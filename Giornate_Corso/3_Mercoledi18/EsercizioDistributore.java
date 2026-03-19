package Mercoledi18;

import java.util.Scanner;

public class EsercizioDistributore {

    public static void main(String[] args) {

        /*
        Scrivi un programma Java che simuli il funzionamento di un distributore automatico di bevande. 
        L'utente inizia con un certo credito iniziale (ad esempio, 10€).
        Il programma mostra un menu con le seguenti opzioni:
        - 1. Caffè - 1.50€    
        - 2. Cappuccino - 2.00€   
        - 3. Tè - 1.00€   
        - 4. Acqua - 0.50€    
        - 5. Uscire
        L'utente può selezionare una bevanda e il costo viene scalato dal credito disponibile.
        Se il credito non è sufficiente, il programma deve avvisare l'utente e chiedere una nuova scelta. 
        L'utente può continuare a comprare bevande finché non sceglie di uscire o esaurisce il credito.
        Alla fine, il programma stampa il credito rimanente e un messaggio di chiusura.
        */

        //Apro Scanner
        Scanner scanner = new Scanner(System.in);

        //Inizializzo e assegno variabili
        double credito = 10.0;
        int scelta;

        //Inizio ciclo do while per ripetere la scelta
        do {

            //Stampa menu e scelta dell'utente
            System.out.println("\nCredito disponibile: " + credito +" euro\n1. Caffè - 1.50 euro\n2. Cappuccino - 2.00euro" + 
            "\n3. Tè - 1.00 euro\n4. Acqua - 0.50euro\n5. Uscire\nCosa vuoi fare: 1 , 2 , 3 , 4 , 5 ?");
            scelta = scanner.nextInt();

            //Switch per comprendere tutte le casistiche
            switch (scelta) {

                //Ogni caso si divide in base al credito presente. Se il credito è sufficiente aggiorno credito e stampo l'operazione
                // sennò stampo credito insufficiente
                case 1:
                    if (credito >= 1.50) {
                        credito -= 1.50;
                        System.out.println("Caffè Selezionato");
                    } 
                    else {
                        System.out.println("Credito insufficiente");
                    }
                    break;

                case 2:
                    if (credito >= 2.00) {
                        credito -= 2.00;
                        System.out.println("Cappuccino Selezionato");
                    } 
                    else {
                        System.out.println("Credito insufficiente");
                    }
                    break;

                case 3:
                    if (credito >= 1.00) {
                        credito -= 1.00;
                        System.out.println("Tè Selezionato");
                    } 
                    else {
                        System.out.println("Credito insufficiente");
                    }
                    break;

                case 4:
                    if (credito >= 0.50) {
                        credito -= 0.50;
                        System.out.println("Acqua Selezionata");
                    } 
                    else {
                        System.out.println("Credito insufficiente");
                    }
                    break;

                case 5:
                    System.out.println("Uscita confermata");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }

        //Condizione per continuare ad iterare sul do while ossia scelta diversa dall'uscita e credito sufficiente 
        } while (scelta!=5 && credito>0);

        //Stampa risultati
        System.out.println("\nCredito rimanente: €" + credito + ". Alla prossima");

        //Chiudo scanner
        scanner.close();
    }
}