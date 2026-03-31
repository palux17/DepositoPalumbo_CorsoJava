public class Astronauta {

    private String nome;
    private String email;
    private float creditoOssigeno;

    //Costruttore senza ossigeno
    public Astronauta(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getCreditoOssigeno() {
        return creditoOssigeno;
    }
    public void setCreditoOssigeno(float creditoOssigeno) {
        this.creditoOssigeno = creditoOssigeno;
    }

    //LOGIN e genera ossigeno casuale
    public void login() {
        this.creditoOssigeno = (float) (50 + Math.random() * 50);
        System.out.println("Login effettuato!");
        System.out.println("Credito ossigeno: " + creditoOssigeno);
    }

    // Metodo per stampare i dati
    public void stampaDati() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Credito ossigeno: " + creditoOssigeno);
    }

    // toString
    @Override
    public String toString() {
        return "Astronauta{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", creditoOssigeno=" + creditoOssigeno +
                '}';
    }
}
