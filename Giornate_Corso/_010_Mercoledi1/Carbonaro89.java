public class Carbonaro89 extends Hamburger {

    //Costruttore
    public Carbonaro89(String nome) {
        super(nome);
    }

    //Override prepara
    @Override
    public void prepara() {
        System.out.println("Panino al carbone vegetale, patty di manzo, guanciale croccante e la mitica salsa carbonara by Ciccionegamer89");
    }
}