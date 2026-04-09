public class Main {
    public static void main(String[] args) {

        //Inizializzo
        Calcolatore calcolatore = new Calcolatore();

        //Addizione
        calcolatore.setOperazione(new Addizione());
        System.out.println("Addizione: " + calcolatore.calcola(5, 3));

        // Cambio strategia a runtime
        calcolatore.setOperazione(new Moltiplicazione());
        System.out.println("Moltiplicazione: " + calcolatore.calcola(5, 3));
    }
}