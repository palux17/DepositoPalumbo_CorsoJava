public class SistemaOrdineFacade {

    //Attributi per facade
    private Computer computer;
    private StrategiaPagamento pagamento;
    private StrategiaSpedizione spedizione;

    //Metodo per inizializzzare il computer
    public void creaComputerBase(String tipo) {
        if (tipo.equalsIgnoreCase("ufficio")) {
            computer = new ComputerBaseUfficio();
        } else {
            computer = new ComputerBaseGaming();
        }
    }

    //Aggiungi componenti
    public void aggiungiExtra(String extra) {
        switch (extra.toLowerCase()) {
            case "ram":
                computer = new RamExtra(computer);
                break;
            case "ssd":
                computer = new SSDExtra(computer);
                break;
            case "gpu":
                computer = new SchedaVideoExtra(computer);
                break;
            case "raffreddamento":
                computer = new RaffreddamentoExtra(computer);
                break;
        }
    }

    //Costruttori
    public void scegliPagamento(StrategiaPagamento pagamento) {
        this.pagamento = pagamento;
    }
    public void scegliSpedizione(StrategiaSpedizione spedizione) {
        this.spedizione = spedizione;
    }

    //Stampa delle info
    public void riepilogo() {
        System.out.println("CONFIGURAZIONE: " + computer.getDescrizione() + "\nPREZZO: " + computer.getPrezzo() + "€");
    }
    public void confermaOrdine() {
        pagamento.eseguiPagamento(computer.getPrezzo());
        spedizione.eseguiSpedizione();
        System.out.println("Ordine completato!");
    }
}