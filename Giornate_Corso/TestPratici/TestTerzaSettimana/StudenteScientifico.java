public class StudenteScientifico extends Studente {

    //Costruttore
    public StudenteScientifico(String nome, int eta, String classe) {
        super(nome, eta, classe);
    }

    //Override del metodo in studente
    @Override
    public void descriviRuolo() {
        System.out.println("Sono uno studente del liceo scientifico della classe " + getClasse());
    }
}