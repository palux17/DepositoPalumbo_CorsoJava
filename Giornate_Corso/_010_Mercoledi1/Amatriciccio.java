public class Amatriciccio extends Hamburger {

    //Costruttore
    public Amatriciccio(String nome) {
        super(nome);
    }

    //Override prepara
    @Override
    public void prepara() {
        System.out.println("Preparazione Cheeseburger: Panino classico, patty di manzo, guanciale croccante, salsa amatriciana by Ciccionegamer89" +
                            "e scaglie di pecorino");
    }
}