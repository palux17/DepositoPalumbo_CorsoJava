public class InvestitorePrivato implements Investitore {

    //Attributo + costruttore
    private String nome;
    public InvestitorePrivato(String nome) {
        this.nome = nome;
    }

    @Override
    public void notifica(String azione, double valore) {
        System.out.println("Attenzione! Investitore Privato " + nome + ", l'azione " + azione + " ha assunto il valore di " + valore + " euro.");
    }
}