public class Dessert {

    protected String nome;

    public Dessert(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void prepara() {
        System.out.println("Preparazione dessert generico...");
    }
}