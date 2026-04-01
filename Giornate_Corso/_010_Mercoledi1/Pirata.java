public class Pirata extends Persona {

    // Costruttore
    public Pirata(String nome) {
        super(nome);
    }

    // Override saluta
    @Override
    public void saluta() {
        System.out.println("Ahoy! Sono il pirata " + nome);
    }
}