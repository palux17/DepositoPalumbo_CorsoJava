public class DocenteMatematica extends Docente {

    //Costruttore 
    public DocenteMatematica(String nome, int eta) {
        super(nome, eta, "Matematica");
    }
    
    //Override metodo in docente
    @Override
    public void descriviRuolo() {
        System.out.println("Sono un docente specifico di Matematica");
    }
}