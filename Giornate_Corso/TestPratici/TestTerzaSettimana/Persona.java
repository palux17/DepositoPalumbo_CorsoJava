public abstract class Persona {

    //Attributi
    private String nome;
    private int eta;

    //Costruttore
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    
    //Getter e Setter
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

    //Metodo Astratto
    public abstract void descriviRuolo();
}