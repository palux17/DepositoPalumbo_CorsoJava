import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioCalcolatrice {

    /*
    Scrivi un programma che simula una semplice calcolatrice utilizzando le funzioni (metodi).
    Il programma deve:
    Chiedere all’utente due numeri
    Mostrare un menu con le operazioni:
    1 - Somma
    2 - Sottrazione
    3 - Moltiplicazione
    4 - Divisione
    5 - Esci
    Utilizzare uno switch per scegliere l’operazione
    Ogni operazione deve essere gestita da una funzione separata
    Funzionalità:
    somma(a, b) → restituisce la somma
    sottrazione(a, b) → restituisce la differenza
    moltiplicazione(a, b) → restituisce il prodotto
    divisione(a, b) → restituisce il risultato        Se b == 0 → stampa "Errore divisione per zero"
    EXTRA: aggiugnere la potenza e le operazioni per + di 2 addendi
    */

    //Definizioni sottofunzioni con operazioni
    public static float somma(float a, float b) {
        return a + b;
    }
    public static float differenza(float a, float b) {
        return a - b;
    }
    public static float moltiplicazione(float a, float b) {
        return a * b;
    }
    public static float divisione(float a, float b) {
        if (b == 0) {
            System.out.println("Non si può dividere per 0");
            return 0;
        }
        return a / b;
    }
    public static float potenza(float a, float b) {
        return (float) Math.pow(a, b);
    }
    public static float sommaMultipla(ArrayList<Float> numeri) {
        float risultato = 0;
        for (float n : numeri) {
            risultato += n;
        }
        return risultato;
    }
    public static float moltiplicazioneMultipla(ArrayList<Float> numeri) {
        float risultato = 1;
        for (float n : numeri) {
            risultato *= n;
        }
        return risultato;
    }

    public static void main(String[] args) {

        //Apro scanner e inizializzazione 
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Benvenuto nella calcolatrice!\nInserisci un numero:");
        float a = scanner.nextFloat();
        System.out.println("Inseriscine un altro");
        float b = scanner.nextFloat();
        boolean cond = true;

        //Ciclo while per mantenere attivo la calcolatrice
        while (cond) {

            //Richiesta dell'operazione da fare e assegnazione
            System.out.println(
                    "Ora decidi cosa fare:\n1 - Somma\n2 - Sottrazione\n3 - Moltiplicazione\n4 - Divisione\n5 - Potenza\n" +
                    "6 - Somma Multipla\n 7 - Moltiplicazione Multipla\n8 - Esci");
            String scelta = scan.nextLine();

            //Switch per decidere che operazione eseguire e stampa
            switch (scelta) {
                case "1":
                    System.out.println("La somma è " + somma(a, b));
                    break;
                case "2":
                    System.out.println("La differenza è " + differenza(a, b));
                    break;
                case "3":
                    System.out.println("Il prodotto è " + moltiplicazione(a, b));
                    break;
                case "4":
                    System.out.println("Il quoziente è " + divisione(a, b));
                    break;
                case "5":
                    System.out.println("La potenza è " + potenza(a, b));
                    break;
                case "6":
                    ArrayList<Float> numeriSomma = new ArrayList<>();
                    System.out.println("Quanti numeri vuoi sommare?");
                    int n1 = scanner.nextInt();
                    for (int i = 0; i < n1; i++) {
                        System.out.println("Inserisci numero:");
                        numeriSomma.add(scanner.nextFloat());
                    }
                    break;
                case "7":
                    ArrayList<Float> numeriMoltiplicazione = new ArrayList<>();
                    System.out.println("Quanti numeri vuoi moltiplicare?");
                    int n2 = scanner.nextInt();
                    for (int i = 0; i < n2; i++) {
                        System.out.println("Inserisci numero:");
                        numeriMoltiplicazione.add(scanner.nextFloat());
                    }
                    System.out.println("Risultato: " + moltiplicazioneMultipla(numeriMoltiplicazione));
                    break;
                case "8":
                    cond = false;
                    break;
                default:
                    System.out.println("Operazione non valida");
                    break;
            }
        }
        //Chiudo scanner
        scanner.close();
        scan.close();
    }
}