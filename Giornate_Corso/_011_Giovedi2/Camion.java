public class Camion extends Veicolo {

    //Attributo + Costruttore + getter e setter
    private double peso;
    public Camion(String targa, double velocita, int numeroAssi, double peso) {
        super(targa, velocita, numeroAssi);
        setPeso(peso);
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            this.peso = 1000;
        }
    }

    //Implementazione del metodo astratto
    @Override
    public double calcolaPedaggio() {
        return 5.00 + (getNumeroAssi() * 2.00) + (peso / 1000);
    }

    //To string
    @Override
    public String toString() {
        return "CAMION\n" +
               super.toString() +
               "\nPeso: " + peso + " kg" +
               "\nPedaggio: €" + calcolaPedaggio();
    }
}