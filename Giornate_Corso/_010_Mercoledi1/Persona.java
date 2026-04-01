public class Persona {

    //Attributi
    String nome;

    // Costruttore
    public Persona(String nome) {
        this.nome = nome;
    }

    //Saluta
    public void saluta() {
        System.out.println("Ciao, sono " + nome);
    }
}