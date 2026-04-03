public class StudenteInformatica extends Studente {

    //Costruttore
    public StudenteInformatica(String nome, int eta, String classe) {
        super(nome, eta, classe);
    }

    //Override metodo studente
    @Override
    public void descriviRuolo() {
        System.out.println("Sono uno studente di informatica della classe " + getClasse());
    }
}