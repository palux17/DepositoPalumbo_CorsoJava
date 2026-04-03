import java.util.ArrayList;

public class Docente extends Persona implements Registrabile {

    //Attributi
    private String materia;
    private ArrayList<Studente> studenti;

    //Costruttore
    public Docente(String nome, int eta, String materia) {
        super(nome, eta);
        this.materia = materia;
        this.studenti = new ArrayList<>();
    }
    
    //Getter e Setter
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    //Aggiunge studente alla lista del professore
    public void aggiungiStudente(Studente studente) {
        if (studente.getDocenteAssegnato().equals("")) {
            studenti.add(studente);
            studente.setDocenteAssegnato(getNome());
            System.out.println("Studente assegnato correttamente al docente " + getNome());
        } else {
            System.out.println("Lo studente è già assegnato al docente " + studente.getDocenteAssegnato());
        }
    }

    //login
    public boolean puoAccedere(Studente studente) {
        return studente.getDocenteAssegnato().equals(getNome());
    }

    //Assegnazione voto per studente
    public void assegnaVoto(Studente studente, int voto) {
        if (puoAccedere(studente)) {
            studente.aggiungiVoto(voto);
            System.out.println("Voto " + voto + " assegnato a " + studente.getNome() + " da " + getNome());
        } else {
            System.out.println("Accesso negato: il docente " + getNome() + " non può modificare questo studente.");
        }
    }

    //Stampa tutti studenti
    public void mostraStudenti() {
        System.out.println("Studenti assegnati al docente " + getNome() + ":");
        if (studenti.isEmpty()) {
            System.out.println("Nessuno studente assegnato.");
        } else {
            for (Studente studente : studenti) {
                System.out.println("- " + studente.getNome());
            }
        }
    }

    //Override del metodo di persona
    @Override
    public void descriviRuolo() {
        System.out.println("Sono un docente di " + materia);
    }

    //Implementazione interfaccia
    @Override
    public void registrazione() {
        System.out.println("Registrazione tramite segreteria didattica");
    }
}