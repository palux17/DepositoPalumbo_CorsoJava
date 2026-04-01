public class Baconbacon extends Hamburger {

    //Costruttore
    public Baconbacon(String nome) {
        super(nome);
    }

    //Override prepara
    @Override
    public void prepara() {
        System.out.println("Panino classico, patty di manzo, bacon croccante, miele, formaggio e la nostra salsa burger");
    }
}