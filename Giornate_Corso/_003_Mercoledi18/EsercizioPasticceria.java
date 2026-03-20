package Mercoledi18;

import java.util.Scanner;

public class EsercizioPasticceria {
    public static void main(String[] args) {

        /*
        Scrivi un programma Java per una pasticceria che chiede all’utente quanti dolci diversi vuole ordinare (massimo 10).
        Usa due array paralleli:
        Uno per memorizzare il nome del dolce (array di String)
        Uno per memorizzare la quantità ordinata (array di int)
        Dopo aver raccolto i dati, il programma deve:
        Stampare l’elenco degli ordini effettuati
        Calcolare e stampare la quantità totale di dolci ordinati
        Se l’utente inserisce un numero negativo per la quantità, stampare un messaggio di errore e
        richiedere nuovamente il dato per quel dolce.
        */

        //Apro scanner
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        //Inizializzo e assegno variabili compresa quella da parte dell'utente
        System.out.println("Inserisci quanti dolci diversi vuoi avere (massimo 10)");
        int lunghezza = scanner.nextInt();
        scanner.nextLine();
        boolean cond;
        int tot = 0;

        //Controllo validità lunghezza
        if (lunghezza <= 0 || lunghezza > 10) {
            System.out.println("Numero di dolci non valido");
            scanner.close();
            scan.close();
            return;
        }
           
        String[] nomi = new String[lunghezza];
        int[] quantita = new int[lunghezza];

        //Ciclo for per assegnare ogni elemento dei due array con il valore inserito dall'utente
        for (int i = 0; i < lunghezza; i++) {

            cond = true;

            //Inserimento nome
            System.out.println("Inserisci nome del dolce:");
            nomi[i] = scanner.nextLine();

            while (cond) {

                //Inserimento quantità
                System.out.println("Inserisci quantità di " + nomi[i]);
                quantita[i] = scan.nextInt();

                //Controllo della non negatività della quantità
                if (quantita[i] < 0) {
                    System.out.println("Quantità non valida");
                } 
                else {
                    cond = false;
                }
            }
        }

        //Stampa elenco nome + quantità e nel mentre calcolo totale
        for (int j = 0; j < lunghezza; j++) {
            System.out.println("Sono stati ordinati " + quantita[j] + " " + nomi[j]);
            tot += quantita[j];
        }

        //Stampo totale
        System.out.println("Il totale degli ordini è " + tot);

        //Chiudo scanner
        scanner.close();
        scan.close();
    }
}