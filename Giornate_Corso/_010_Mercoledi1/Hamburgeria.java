import java.util.Scanner;

public class Hamburgeria {

    public static void main(String[] args) {

        //Inizializzazione
        Scanner scanner = new Scanner(System.in);
        GestoreOrdini gestore = new GestoreOrdini();
        GestoreDessert gestoreDessert = new GestoreDessert();
        int scelta;

        //do-while per menu
        do {
            System.out.println("HAMBURGERIA:\n1 - Amatriciccio\n2 - Carbonaro89\n3 - Baconbacon\n4 - Tiramisu\n5 - Cheesecake\n6 - Prepara ordini\n" +
                                "7 - Prepara dessert\n0 - Esci\nCosa vuoi fare: 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 ?");
            scelta = scanner.nextInt();
            scanner.nextLine();
            
            //Casistiche in base alla scelta
            switch (scelta) {

                case 1:
                    gestore.aggiungiOrdine(new Amatriciccio("Amatriciccio"));
                    break;

                case 2:
                    gestore.aggiungiOrdine(new Carbonaro89("Carbonaro89"));
                    break;

                case 3:
                    gestore.aggiungiOrdine(new Baconbacon("Baconbacon"));
                    break;

                case 4:
                    gestoreDessert.aggiungiDessert(new Tiramisu("Tiramisu"));
                    break;

                case 5:
                    gestoreDessert.aggiungiDessert(new Cheesecake("Cheesecake"));
                    break;

                case 6:
                    gestore.preparaOrdini();
                    break;

                case 7:
                    gestoreDessert.preparaDessert();
                    break;

                case 0:
                    System.out.println("Grazie arrivederci");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        
        //Scelta
        } while (scelta != 0);

        //Chiudo scanner
        scanner.close();
    }
}