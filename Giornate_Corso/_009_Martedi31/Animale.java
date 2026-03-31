public class Animale {
    //Attributi
    private String nome;
    private int eta;

    //Getter setter e costruttore e tostring
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    @Override
    public String toString() {
        return "Animale:\nnome - " + nome + ", eta - " + eta;
    }
    //Metodo per stampare verso
    public void stampaVerso(){
        System.out.println("Verso generico");
    }
    
}
