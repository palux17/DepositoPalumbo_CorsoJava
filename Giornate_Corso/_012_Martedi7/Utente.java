public class Utente {

    //Attributo
    private String nome;

    //Costruttore
    public Utente(String nome) {
        this.nome = nome;
    }

    //Salva dato
    public void salvaDato(String dato) {
        GestisciDB db = GestisciDB.getInstance();
        db.connect();
        db.salvaDato(nome + ": " + dato);
    }

    //LEggo dato
    public void leggiDati() {
        GestisciDB db = GestisciDB.getInstance();
        db.connect();
        db.mostraDati();
    }
}