public class PayPal implements MetodoPagamento {

    @Override
    public void paga(double importo) {
        System.out.println("Pagamento effettuato con PayPal.");
        System.out.println("Importo pagato: " + importo + " euro.");
    }
}