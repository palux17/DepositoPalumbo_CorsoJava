public class InvestitoreBancario implements Investitore {

    //Attributo + costruttore
    private String banca;
    public InvestitoreBancario(String banca) {
        this.banca = banca;
    }

    @Override
    public void notifica(String azione, double valore) {
        System.out.println("Attenzione! Investitore Banca" + banca + ", l'azione " + azione + " ha assunto il valore di " + valore + " euro.");
    }
}