package Giornate_Corso.TestPratici.TestPrimaSettimana;

import java.util.ArrayList;
import java.util.Scanner;

public class GestioneFabbrica {

    /*
    ESERCIZIO – Gestione produzione di una fabbrica
    Scrivi un programma in Java che simula una piccola gestione della produzione di una fabbrica.
    La fabbrica produce pezzi e il programma deve permettere all’utente di registrare i prodotti realizzati durante la giornata.
    Ogni prodotto sarà rappresentato solo dal nome del prodotto e dalla quantità prodotta.

    Per semplicità, puoi usare:
        una ArrayList<String> per i nomi dei prodotti
        una ArrayList<Integer> per le quantità

    Il programma deve mostrare un menu continuo che si ripete fino a quando l’utente decide di uscire.

    Menu richiesto:
        1 - Aggiungi prodotto
        2 - Visualizza produzione
        3 - Cerca prodotto
        4 - Modifica quantità
        5 - Rimuovi prodotto
        6 - Calcola totale pezzi prodotti
        7 - Esci

    Vincoli didattici:
        Il programma deve obbligatoriamente usare:
            almeno un while
            almeno un for
            almeno uno switch
            almeno degli if / else
            almeno 4 funzioni
            almeno una ArrayList

    Funzionalità richieste:
    1 - Aggiungi prodotto
        Il programma deve chiedere:
            nome del prodotto
            quantità prodotta
        Poi deve salvare i dati nelle due ArrayList.

        Controlli richiesti:
            se il nome è vuoto → stampa un messaggio di errore
            se la quantità è minore o uguale a 0 → stampa un messaggio di errore
            altrimenti aggiunge il prodotto

    2 - Visualizza produzione
        Il programma deve stampare tutti i prodotti inseriti con la relativa quantità.
        Esempio:
            1 - Bullone   | Quantità: 50
            2 - Vite      | Quantità: 120
            3 - Ingranaggio | Quantità: 30

        Se non ci sono prodotti, stampa:
            Nessun prodotto registrato

    3 - Cerca prodotto
        Il programma deve chiedere il nome di un prodotto e verificare se esiste nella lista.
        Se esiste → stampa il nome e la quantità
        Se non esiste → stampa "Prodotto non trovato"

    4 - Modifica quantità
        Il programma deve chiedere il nome di un prodotto.

        Se il prodotto esiste:
            chiede la nuova quantità e la aggiorna

        Se il prodotto non esiste:
            stampa un messaggio di errore

        Controlla anche che la nuova quantità sia maggiore di 0

    5 - Rimuovi prodotto
        Il programma deve chiedere il nome di un prodotto.

        Se esiste:
            lo rimuove da entrambe le liste

        Se non esiste:
            stampa "Prodotto non trovato"

    6 - Calcola totale pezzi prodotti
        Il programma deve sommare tutte le quantità dei prodotti presenti e stampare il totale generale della produzione
        */

        public static void aggiungiProdotto(Scanner scanner, Scanner scan, ArrayList<String> nomi, ArrayList<Integer> qt){
            System.out.println("Inserisci nome prodotto:");
            String nome = scanner.nextLine();
            if(nome.isEmpty()){
                System.out.println("Nomi vuoti non sono accettati");
                return;
            }
            else{
                System.out.println("Inserisci quantità di " + nome + ":");
                int num = scan.nextInt();
                if (num<=0){
                    System.out.println("La quantità deve essere maggiore di 0");
                }
                else{
                    nomi.add(nome);
                    qt.add(num);
                }
            } 
        }

        public static void visualizzaProduzione(ArrayList<String> nomi, ArrayList<Integer> qt){
            if(nomi.isEmpty()){
                System.out.println("Nessun prodotto registrato");
            }
            else{
                System.out.println("Ecco la produzione:");
                for (Integer i=0; i<nomi.size(); i++) {
                    System.out.println( (i+1) + " - " + nomi.get(i) + "\t|\tQuantità: " + qt.get(i));
                }
            }
        }

        public static void cercaProdotto(Scanner scanner, ArrayList<String> nomi, ArrayList<Integer> qt){
            System.out.println("Inserisci nome prodotto:");
            String dacercare = scanner.nextLine();
            if (nomi.contains(dacercare)){
                System.out.println("- " + dacercare + "\t|\tQuantità: " + qt.get(nomi.indexOf(dacercare)));
            }
            else{
                System.out.println("Prodotto non trovato");
            }
        }

        public static void modificaQuantita(Scanner scanner, Scanner scan, ArrayList<String> nomi, ArrayList<Integer> qt){
            System.out.println("Inserisci prodotto da modificare:");
            String dacercare = scanner.nextLine();
            if (nomi.contains(dacercare)){
                System.out.println("Inserisci nuova quantità per " + dacercare);
                int nuovonum = scan.nextInt();
                if (nuovonum>0){
                    qt.set(nomi.indexOf(dacercare), nuovonum);
                }
                else{
                    System.out.println("La nuova quantità deve essere maggiore di zero");
                }
            }
            else{
                System.out.println("Prodotto non presente nella produzione");
            }
        }

        public static void rimuoviProdotto(Scanner scanner, ArrayList<String> nomi, ArrayList<Integer> qt){
            System.out.println("Inserisci nome prodotto da rimuovere:");
            String nome = scanner.nextLine();
            if(nome.isEmpty()){
                System.out.println("Nomi vuoti non sono accettati");
            }
            else{
                if (nomi.contains(nome)){
                    qt.remove(nomi.indexOf(nome));
                    nomi.remove(nome);
                }
                else{
                    System.out.println("Prodotto non trovato");
                }
            } 
        }

        public static void totaleProduzione(ArrayList<Integer> qt){
            int sum = 0;
            for (Integer i: qt) {
                sum += i;
            }
            System.out.println("Il totale di prodotti prodotti è " + sum);
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);
            ArrayList<String> nomi = new ArrayList<>();
            ArrayList<Integer> qt = new ArrayList<>();
            boolean cond = true;

            do{
                System.out.println("Benvenuto nella fabbrica!\nMenu:\n1 - Aggiungi prodotto\n2 - Visualizza produzione\n" +
                                "3 - Cerca prodotto\n4 - Modifica quantità\n5 - Rimuovi prodotto\n"+
                                "6 - Calcola totale pezzi prodotti\n7 - Esci");
                String scelta = scanner.nextLine();
                switch (scelta){
                    case "1":
                        aggiungiProdotto(scanner, scan, nomi, qt);
                        break;
                    case "2":
                        visualizzaProduzione(nomi, qt);
                        break;
                    case "3":
                        cercaProdotto(scanner, nomi, qt);
                        break;
                    case "4":
                        modificaQuantita(scanner, scan, nomi, qt);
                        break;
                    case "5":
                        rimuoviProdotto(scanner, nomi, qt);
                        break;
                    case "6":
                        totaleProduzione(qt);
                        break;
                    case "7":
                        System.out.println("Arrivederci");
                        cond = false;
                        break;
                    default:
                        System.out.println("Comando non valido");
                        break;
                }
            } while(cond);

            scanner.close();
            scan.close();
        }
}
