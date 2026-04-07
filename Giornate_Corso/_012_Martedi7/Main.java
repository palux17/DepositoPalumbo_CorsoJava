import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner + Inizializzo 
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int scelta;
        Utente utente = new Utente("Andrea");

        //Menu do-while
        do {
            System.out.println("MENU:\n1 - Salva dato\n2 - Mostra dati\n3 - Numero connessioni\n0 - Esci\nCosa vuoi fare: 0 , 1 , 2 , 3 ?");
            scelta = scan.nextInt();
            scan.nextLine();

            //Opzioni con switch
            switch (scelta) {

                case 1:
                    System.out.print("Inserisci dato: ");
                    String dato = scanner.nextLine();
                    utente.salvaDato(dato);
                    System.out.println("\n");
                    break;

                case 2:
                    utente.leggiDati();
                    System.out.println("\n");
                    break;

                case 3:
                    GestisciDB db = GestisciDB.getInstance();
                    System.out.println("Totale connessioni: " + db.getConnectionCount() + "\n");
                    break;

                case 0:
                    System.out.println("Arrivederci\n");
                    break;

                default:
                    System.out.println("Scelta non valida\n");
            }

            //Condizione do-while
        } while (scelta != 0);

        //Chiudo Scanner
        scanner.close();
        scan.close();
    }
}