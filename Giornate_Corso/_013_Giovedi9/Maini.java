public class Maini {
    public static void main(String[] args) {

        //Inizializzo e richiamo facade
        SistemaOrdineFacade sistema = new SistemaOrdineFacade();
        sistema.creaComputerBase("gaming");
        sistema.aggiungiExtra("ram");
        sistema.aggiungiExtra("ssd");
        sistema.aggiungiExtra("gpu");
        sistema.scegliPagamento(new PagamentoCarta());
        sistema.scegliSpedizione(new SpedizioneEspressa());
        sistema.riepilogo();
        sistema.confermaOrdine();
    }
}