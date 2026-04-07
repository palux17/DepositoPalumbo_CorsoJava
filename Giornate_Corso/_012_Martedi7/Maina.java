public class Maina {
    public static void main(String[] args) {

        //Inizializzo
        AgenziaBorsa agenzia = new AgenziaBorsa();

        Investitore investitore1 = new InvestitorePrivato("Andrea");
        Investitore investitore2 = new InvestitorePrivato("Luca");
        Investitore investitore3 = new InvestitoreBancario("UniCredit");
        System.out.println("\n");

        agenzia.aggiungiInvestitore(investitore1);
        agenzia.aggiungiInvestitore(investitore2);
        agenzia.aggiungiInvestitore(investitore3);

        agenzia.aggiornaValoreAzione("AMAZON", 14.75);
        agenzia.aggiornaValoreAzione("FIAT", 9.30);

        agenzia.rimuoviInvestitore(investitore2);
        agenzia.aggiornaValoreAzione("Ferrari", 320.50);
    }
}