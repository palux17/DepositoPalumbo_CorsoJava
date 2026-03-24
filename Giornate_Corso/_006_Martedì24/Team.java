public class Team {

    //Attributi
    private String nome;
    private int numeroSviluppatori;
    private Gioco gioco;

    //Costruttori
    public Team(String nome) {
        this.nome = nome;
        this.numeroSviluppatori = 0;
        this.gioco = null;
    }

    //Getter setter
    public String getNome() {
        return nome;
    }
    public int getNumeroSviluppatori() {
        return numeroSviluppatori;
    }
    public Gioco getGioco() {
        return gioco;
    }
    public void setGioco(Gioco gioco) {
        this.gioco = gioco;
    }

    //Aggiungi sviluppatori
    public void aggiungiSviluppatori(int num) {
        if (num > 0) {
            numeroSviluppatori += num;
            System.out.println("Sviluppatori aggiunti.");
        } 
        else {
            System.out.println("Numero non valido.");
        }
    }

    //Printa tutto
    public void mostraDati() {
        System.out.println("Team: " + nome);
        System.out.println("Numero sviluppatori: " + numeroSviluppatori);
        if (gioco != null) {
            gioco.mostraDati();
        } 
        else {
            System.out.println("Nessun gioco assegnato.");
        }
    }
}