//Implementazioni strategy
public class PagamentoCarta implements StrategiaPagamento {
    public void eseguiPagamento(double importo) {
        System.out.println("Pagamento con carta: " + importo + "euro");
    }
}