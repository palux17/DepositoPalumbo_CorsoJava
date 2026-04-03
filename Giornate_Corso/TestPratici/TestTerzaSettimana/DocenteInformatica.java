public class DocenteInformatica extends Docente {

    //Costruttore
    public DocenteInformatica(String nome, int eta) {
        super(nome, eta, "Informatica");
    }

    //Override metodo in docente
    @Override
    public void descriviRuolo() {
        System.out.println("Sono un docente specifico di Informatica");
    }
}