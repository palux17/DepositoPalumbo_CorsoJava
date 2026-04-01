public class Cheesecake extends Dessert {

    //Costruttore
    public Cheesecake(String nome) {
        super(nome);
    }

    //Override prepara
    @Override
    public void prepara() {
        System.out.println("Preparazione Cheesecake: base biscotto, crema al formaggio, topping frutti di bosco");
    }
}