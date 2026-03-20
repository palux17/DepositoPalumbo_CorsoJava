import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioArrayList {

    public static void main(String[] args) {

        /*
        Crei una ArrayList di stringhe per memorizzare nomi di studenti.
        L'utente può aggiungere nomi finché non scrive "fine".
        Il programma deve stampare tutti i nomi in ordine alfabetico.
        Il programma deve dire quanti studenti sono stati inseriti.
        Il programma deve permettere di eliminare degli studenti indicati dall’utente
        */
        /*
        Gestire l'inserimento in parallelo anche dell'età e del voto int e float e inserire tutti e 
        tre glia rraylist in un'altro arraylsit che li contiene e rende il tutto modificabile.
        */

        //Scanner
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);

        //Inizializzazione
        ArrayList<ArrayList<?>> studenti = new ArrayList<>();
        ArrayList<String> nomi = new ArrayList<>();
        ArrayList<Integer> eta = new ArrayList<>();
        ArrayList<Float> voti = new ArrayList<>();

        //Inserimento studenti
        System.out.println("Inserisci i nomi degli studenti: (scrivi 'fine' per terminare):");
        while (true) {

            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fine")) {
                break;
            }
            nomi.add(nome);
        }

        //Ordine alfabetico, stampa e aggiunta a studenti
        nomi.sort(String::compareToIgnoreCase);
        System.out.println("Lista studenti in ordine alfabetico:");
        for (String s : nomi) {
            System.out.println(s);
        }
        studenti.add(nomi);
        studenti.add(eta);
        studenti.add(voti);

        //Aggiunta età e voti
        for(String g : nomi){
            System.out.println("Qual è l'età di " + g);
            eta.add(scan.nextInt());
            System.out.println("Qual è il voto di " + g);
            voti.add(sca.nextFloat());
        }

        //Numero studenti
        System.out.println("Numero totale studenti: " + nomi.size());

        //Eliminazione studente e se presente voti e età
        System.out.println("Vuoi eliminare uno studente? (si/no)");
        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("si")) {

            do {
                System.out.println("Inserisci il nome dello studente da eliminare:");
                String daEliminare = scanner.nextLine();

                if (nomi.contains(daEliminare)){
                    
                    System.out.println("Studente rimosso.");
                    int indice = nomi.indexOf(daEliminare);
                    eta.remove(indice);
                    voti.remove(indice);
                    nomi.remove(daEliminare);
                } 
                else {
                    System.out.println("Studente non trovato.");
                }

                System.out.println("Lista aggiornata:");
                for (String s : nomi) {
                    System.out.println(s);
                }

            System.out.println("Vuoi eliminare un altro studente? (si/no)");
            risposta = scanner.nextLine();

            } while (risposta.equalsIgnoreCase("si"));
        }

        //Chiudo Scanner
        scanner.close();
        sca.close();
        scan.close();
    }
}