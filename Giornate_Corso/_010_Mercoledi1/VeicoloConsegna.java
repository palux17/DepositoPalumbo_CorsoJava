public abstract class VeicoloConsegna {

    //Attributi + costruttori + getter setter
    protected String targa;
    protected float caricoMassimo;
    public VeicoloConsegna(String targa, float caricoMassimo) {
        this.targa = targa;
        this.caricoMassimo = caricoMassimo;
    }
    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public float getCaricoMassimo() {
        return caricoMassimo;
    }
    public void setCaricoMassimo(float caricoMassimo) {
        this.caricoMassimo = caricoMassimo;
    }

    //Metodo astratto definito dopo
    public abstract void consegnaPacco(String destinazione);

    public void stampaInfo() {
        System.out.println("Targa: " + targa + "Carico massimo: " + caricoMassimo + " kg");
    }
}