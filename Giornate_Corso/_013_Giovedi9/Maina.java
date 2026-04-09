public class Maina {
    public static void main(String[] args) {

        //Inizializzo
        Ordine ordine1 = new Ordine(1, "Andrea", "Laptop", 1000);
        CentroPriorita centro = new CentroPriorita();

        //Associo observewr ordine + stampa
        centro.registraObserver(ordine1);
        System.out.println("\nDATI ORDINE:");
        ordine1.mostraDatiOrdine();

        //Cambio stato
        System.out.println("\nCAMBIO STATO -> NORMALE");
        centro.setStatoOperativo("normale");
        ordine1.eseguiStrategia();
        System.out.println("\nCAMBIO STATO -> PRIORITA");
        centro.setStatoOperativo("priorita");
        ordine1.eseguiStrategia();
        System.out.println("\nCAMBIO STATO -> CONTROLLO");
        centro.setStatoOperativo("controllo");
        ordine1.eseguiStrategia();
    }
}