import java.util.ArrayList;

public class Studente extends Persona implements Registrabile {

    //Attributi
    private String classe;
    private ArrayList<Integer> voti;
    private String docenteAssegnato;

    //Costruttore
    public Studente(String nome, int eta, String classe) {
        super(nome, eta);
        this.classe = classe;
        this.voti = new ArrayList<>();
        this.docenteAssegnato = "";
    }

    //Getter e Setter
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classeFrequentata) {
        this.classe = classeFrequentata;
    }
    public ArrayList<Integer> getVoti() {
        return voti;
    }
    public String getDocenteAssegnato() {
        return docenteAssegnato;
    }
    public void setDocenteAssegnato(String docenteAssegnato) {
        this.docenteAssegnato = docenteAssegnato;
    }

    //Aggiunge voto a lista di voti
    public void aggiungiVoto(int voto) {
        voti.add(voto);
    }

    //Stampa di tutti i voti 
    public void stampaVoti() {
        System.out.println("Voti di " + getNome() + ":");
        if (voti.isEmpty()) {
            System.out.println("Nessun voto presente.");
        } else {
            for (int voto : voti) {
                System.out.println("- " + voto);
            }
        }
    }

    //Override del metodo di persona
    @Override
    public void descriviRuolo() {
        System.out.println("Sono uno studente della classe " + classe);
    }

    //Implementazione interfaccia
    @Override
    public void registrazione() {
        System.out.println("Registrazione tramite modulo online");
    }
}