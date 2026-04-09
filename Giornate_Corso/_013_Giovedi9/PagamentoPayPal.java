//Implementazioni strategy
public class PagamentoPayPal implements StrategiaPagamento {
    public void eseguiPagamento(double importo) {
        System.out.println("Pagamento con PayPal: " + importo + "euro");
    }
}