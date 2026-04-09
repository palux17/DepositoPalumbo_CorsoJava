public class PagamentoBonifico implements StrategiaPagamento {
    public void eseguiPagamento(double importo) {
        System.out.println("Pagamento con bonifico: " + importo + "euro");
    }
}