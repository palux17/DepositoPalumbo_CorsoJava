public class Moto extends Veicolo {

    //Attributo + Costruttore + getter e setter
    private int cilindrata;
    public Moto(String targa, double velocita, int numeroAssi, int cilindrata) {
        super(targa, velocita, numeroAssi);
        setCilindrata(cilindrata);
    }
    public int getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata) {
        if (cilindrata > 0) {
            this.cilindrata = cilindrata;
        } else {
            this.cilindrata = 125;
        }
    }

    //Implementazione del metodo astratto
    @Override
    public double calcolaPedaggio() {
        if (cilindrata <= 125) {
            return 1.00;
        } else if (cilindrata <= 500) {
            return 1.50;
        } else {
            return 2.00;
        }
    }

    //TO string
    @Override
    public String toString() {
        return "MOTO\n" +
               super.toString() +
               "\nCilindrata: " + cilindrata + " cc" +
               "\nPedaggio: €" + calcolaPedaggio();
    }
}