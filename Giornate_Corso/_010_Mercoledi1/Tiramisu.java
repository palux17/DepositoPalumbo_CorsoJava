public class Tiramisu extends Dessert {

    public Tiramisu(String nome) {
        super(nome);
    }

    @Override
    public void prepara() {
        System.out.println("Preparazione Tiramisù: savoiardi, mascarpone, caffè, cacao");
    }
}