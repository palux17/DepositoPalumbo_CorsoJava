public class Hamburger {
    //Attributi + costruttori + getter
    protected String nome;
    public Hamburger(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //Metodo prepara
    public void prepara() {
        System.out.println("Preparazione hamburger generico...");
    }
}