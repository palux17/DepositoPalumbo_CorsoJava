public class Suite extends Camera {

    //Attributo + Costruttore + Getter e Setter
    private String serviziExtra;
    public Suite(int numero, float prezzo, String serviziExtra) {
        super(numero, prezzo);
        this.serviziExtra = serviziExtra;
    }
    public String getServiziExtra() {
        return serviziExtra;
    }
    public void setServiziExtra(String serviziExtra) {
        this.serviziExtra = serviziExtra;
    }

    //Override dettagli()
    @Override
    public void dettagli() {
        super.dettagli();
        System.out.println("Servizi extra: " + serviziExtra);
    }
}
