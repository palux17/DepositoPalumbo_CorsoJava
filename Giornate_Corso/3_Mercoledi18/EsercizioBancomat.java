package Mercoledi18;

import java.util.Scanner;

public class EsercizioBancomat {

    public static void main(String[] args) {

        /*
        Scrivi un programma che simula un semplice bancomat.
        Il sistema deve partire con un saldo iniziale di 1000 euro.
        Mostra un menu che si ripete finché l’utente non decide di uscire:
            1 - Visualizza saldo
            2 - Preleva
            3 - Deposita
            4 - Esci
        Comportamento:
        Usa un while per mantenere attivo il programma
        Usa uno switch per gestire le operazioni
        Funzionalità:
        Se l’utente sceglie 1 → stampa il saldo attuale
        Se sceglie 2 → chiedi un importo:
        Se l’importo è maggiore del saldo → stampa "Fondi insufficienti"
            Altrimenti sottrai e mostra il nuovo saldo
        Se sceglie 3 → chiedi un importo e aggiungilo al saldo
        Se sceglie 4 → termina il programma con messaggio "Arrivederci"
         Per qualsiasi altro valore → "Scelta non valida"
        */
        
        //Apro scanner
        Scanner scanner = new Scanner(System.in);

        //Inizializzo e assegno variabili
        int saldo = 1000, scelta = 0, importo;
        
        //Avvio un ciclo while per ripetere il menu
        while (scelta != 4) {

            //Stampo menu e assegno scelta dell'utente
            System.out.println("Benvenuto!\nDigita:\n1 - Visualizza saldo\n2 - Preleva\n3 - Deposita\n4 - Esci\n" +
            "Cosa vuoi fare: 1 , 2, 3 , 4 ?");
            scelta = scanner.nextInt();

            //Creo casistiche in base alla scelta dell'utente con le rispettive azioni da fare
            switch(scelta){

                case 1:
                    System.out.println("Il tuo saldo è " + saldo);
                    break;

                case 2:
                    System.out.println("Inserisci importo da prelevare:");
                    importo = scanner.nextInt();
                    if(importo<=0){
                        System.out.println("Importo selezionato non accettabile");
                    }
                    else if(importo>saldo){
                        System.out.println("Fondi insufficienti");
                    }
                    else{
                        saldo -= importo;
                        System.out.println("Il tuo saldo aggiornato è " + saldo);
                    }
                    break;

                case 3:
                    System.out.println("Inserisci importo da aggiungere:");
                    importo= scanner.nextInt();
                    if(importo<=0){
                        System.out.println("Importo selezionato non accettabile");
                    }
                    else{
                        saldo += importo;
                        System.out.println("Il tuo saldo aggiornato è " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Arrivederci");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }

        //Chiudo scanner
        scanner.close();
    }
}
