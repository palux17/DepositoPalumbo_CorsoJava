public class CartaDiCredito implements MetodoPagamento {

    @Override
    public void paga(double importo) {
        System.out.println("Pagamento effettuato con Carta di Credito.");
        System.out.println("Importo pagato: " + importo + " euro.");
    }
}