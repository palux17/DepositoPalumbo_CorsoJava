import java.util.ArrayList;
import java.util.Scanner;

public class Maine {

    public static void main(String[] args) {

        //Scanner + inizializzazione
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        OrdineDAO ordineDAO = new OrdineDAO();
        GestoreOrdini gestoreOrdini = new GestoreOrdini();
        gestoreOrdini.aggiungiObserver(new MagazzinoObserver());
        gestoreOrdini.aggiungiObserver(new SpedizioniObserver());
        gestoreOrdini.aggiungiObserver(new NotificheObserver());
        int scelta;

        //Menu do-while
        do {
            System.out.println("MENU GESTIONE ORDINI:\n1 - Inserisci nuovo ordine\n2 - Visualizza tutti gli ordini\n3 - Cerca ordine per ID\n" +
                              "4 - Aggiorna stato ordine\n5 - Esci\nCosa vuoi fare: 0 , 1 , 2 , 3 , 4 ,5 ?");
            scelta = scan.nextInt();
            scan.nextLine();

            //Switch per casistiche
            switch (scelta) {

                case 1:
                    System.out.print("Nome cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Prodotto: ");
                    String prodotto = scanner.nextLine();
                    System.out.print("Quantità: ");
                    int quantita = scan.nextInt();
                    scan.nextLine();
                    String stato = "CREATO";
                    Ordine nuovoOrdine = new Ordine(nomeCliente, prodotto, quantita, stato);
                    ordineDAO.inserisciOrdine(nuovoOrdine);
                    System.out.println("Ordine creato: " + nuovoOrdine);
                    break;

                case 2:
                    ArrayList<Ordine> ordini = ordineDAO.visualizzaTuttiGliOrdini();
                    if (ordini.isEmpty()) {
                        System.out.println("Nessun ordine presente.");
                    } else {
                        for (Ordine ordine : ordini) {
                            System.out.println(ordine);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Inserisci ID ordine da cercare: ");
                    int idRicerca = scan.nextInt();
                    scan.nextLine();
                    Ordine ordineTrovato = ordineDAO.cercaOrdinePerId(idRicerca);
                    if (ordineTrovato != null) {
                        System.out.println("Ordine trovato:");
                        System.out.println(ordineTrovato);
                    } else {
                        System.out.println("Ordine non trovato.");
                    }
                    break;

                case 4:
                    System.out.print("Inserisci ID ordine da aggiornare: ");
                    int idAggiornamento = scan.nextInt();
                    scan.nextLine();
                    Ordine ordineDaAggiornare = ordineDAO.cercaOrdinePerId(idAggiornamento);
                    if (ordineDaAggiornare != null) {
                        System.out.println("Stato attuale: " + ordineDaAggiornare.getStato());
                        System.out.print("Nuovo stato (CREATO / IN PREPARAZIONE / SPEDITO / CONSEGNATO): ");
                        String nuovoStato = scanner.nextLine();
                        ordineDAO.aggiornaStatoOrdine(idAggiornamento, nuovoStato);
                        ordineDaAggiornare.setStato(nuovoStato);
                        gestoreOrdini.notificaObservers(ordineDaAggiornare);    //notifica observer
                    } else {
                        System.out.println("Ordine non trovato.");
                    }
                    break;

                case 5:
                    System.out.println("Uscita dal programma...");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        //Condizione do-while
        } while (scelta != 5);

        //Chiudo scan
        scanner.close();
        scan.close();
    }
}