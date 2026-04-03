public class Auto extends Veicolo {

    //Attributo + Costruttore + Getter e setter
    private int numeroPorte;
    public Auto(String targa, double velocita, int numeroAssi, int numeroPorte) {
        super(targa, velocita, numeroAssi);
        setNumeroPorte(numeroPorte);
    }
    public int getNumeroPorte() {
        return numeroPorte;
    }
    public void setNumeroPorte(int numeroPorte) {
        if (numeroPorte > 0) {
            this.numeroPorte = numeroPorte;
        } else {
            this.numeroPorte = 4;
        }
    }

    //Implementazione del metodo astratto
    @Override
    public double calcolaPedaggio() {
        return 2.50 + (getNumeroAssi() * 1.00);
    }

    //Tostring
    @Override
    public String toString() {
        return "AUTO\n" +
               super.toString() +
               "\nNumero porte: " + numeroPorte +
               "\nPedaggio: €" + calcolaPedaggio();
    }
}