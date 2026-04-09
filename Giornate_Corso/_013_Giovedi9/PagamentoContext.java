public class PagamentoContext {

    private MetodoPagamento metodoPagamento;

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void eseguiPagamento(double importo) {
        if (metodoPagamento == null) {
            System.out.println("Errore: nessun metodo di pagamento selezionato.");
            return;
        }

        metodoPagamento.paga(importo);
    }
}