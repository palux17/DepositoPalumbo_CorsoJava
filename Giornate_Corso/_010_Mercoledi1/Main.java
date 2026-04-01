public class Main {
    public static void main(String[] args) {
        //inizializzazione
        Persona p1 = new Persona("Andrea");
        Persona p2 = new Persona("Luca");
        p1.saluta();
        p2.saluta();
        Pirata pirata = new Pirata("Jack");

        pirata.saluta();
    }
}