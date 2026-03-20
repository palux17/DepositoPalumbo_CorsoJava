public class Persona {

    private String nome;
    private int eta;
    private String citta;

    // Costruttore
    public Persona(String nome, int eta, String citta) {
        this.nome = nome;
        this.eta = eta;
        this.citta = citta;
    }

    //Metodo per stampare i dettagli
    public void stampaDettagli() {
        System.out.println("Nome: " + nome + "\nEtà: " + eta + "\nCittà: " + citta);
    }
}

