public abstract class Veicolo {

    //Attributi + Costruttore + getter e setter
    private String targa;
    private double velocita;
    private int numeroAssi;
    public Veicolo(String targa, double velocita, int numeroAssi) {
        setTarga(targa);
        setVelocita(velocita);
        setNumeroAssi(numeroAssi);
    }
    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        if (targa != null && !targa.isBlank()) {
            this.targa = targa;
        } else {
            this.targa = "NON DEFINITA";
        }
    }
    public double getVelocita() {
        return velocita;
    }
    public void setVelocita(double velocita) {
        if (velocita >= 0) {
            this.velocita = velocita;
        } else {
            this.velocita = 0;
        }
    }
    public int getNumeroAssi() {
        return numeroAssi;
    }
    public void setNumeroAssi(int numeroAssi) {
        if (numeroAssi > 0) {
            this.numeroAssi = numeroAssi;
        } else {
            this.numeroAssi = 1;
        }
    }

    //Metodo astratto
    public abstract double calcolaPedaggio();

    //tostring
    @Override
    public String toString() {
        return "Targa: " + targa +
               "\nVelocità: " + velocita +
               "\nNumero assi: " + numeroAssi;
    }
}