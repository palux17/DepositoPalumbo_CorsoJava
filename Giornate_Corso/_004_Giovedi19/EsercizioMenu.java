package Giornate_Corso.Giovedi19;

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioMenu {
    
    public static void main(String[] args) {

        /*
        Scrivi un programma che permetta di gestire una lista di nomi utilizzando un menu interattivo.
        Il programma deve utilizzare una ArrayList di stringhe per salvare i nomi inseriti dall’utente.
        Mostra un menu che si ripete finché l’utente non decide di uscire:
        1 - Aggiungi nome
        2 - Visualizza tutti i nomi
        3 - Cerca nome
        4 - Rimuovi nome
        5 - Esci
        Comportamento:
        Usa un while per mantenere attivo il programma
        Usa uno switch per gestire le operazioni
        Funzionalità:
        1 - Aggiungi nome
            Chiedi all’utente un nome e Inseriscilo nella ArrayList
        2 - Visualizza tutti i nomi
            Stampa tutti i nomi presenti nella lista
            Se la lista è vuota → stampa "Lista vuota"
        3 - Cerca nome
            Chiedi un nome all’utente
            Verifica se esiste nella lista:
            Se esiste → "Nome trovato"
            Se non esiste → "Nome non trovato"
        4 - Rimuovi nome
            Chiedi un nome
            Se presente → rimuovilo e stampa "Nome rimosso"
            Se non presente → "Nome non trovato"
        5 - Esci
            Termina il programma con "Arrivederci"
        */
        
        //Scanner e inizializzazione
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        ArrayList<ArrayList<?>> studenti = new ArrayList<>();
        ArrayList<String> nomi = new ArrayList<>();
        ArrayList<Integer> eta = new ArrayList<>();
        ArrayList<Float> voti = new ArrayList<>();
        boolean a = true;
        String nome;
        int age;
        float voto;

        //Ciclo do-while per richiesta di comandi
        do{
            System.out.println("Cosa vuoi fare?\n1 - Aggiungi nome\n2 - Visualizza tutti i nomi\n" +
                                "3 - Cerca nome\n4 - Rimuovi nome\n5 - Esci");
            String scelta = scanner.nextLine();

            //Switch per differenziare le casistiche
            switch (scelta) {

                case "1":
                    System.out.println("Inserisci nome da aggiungere");
                    nome = scanner.nextLine();
                    nomi.add(nome);
                    System.out.println("Inserisci eta di " + nome);
                    age = scan.nextInt();
                    eta.add(age);
                    System.out.println("Inserisci voto di" + nome);
                    voto = sca.nextFloat();
                    voti.add(voto);
                    break;

                case "2":
                    if (nomi.isEmpty()){
                        System.out.println("Lista vuota");
                    }
                    else{
                        System.out.println("Ecco tutti gli studenti:");
                        for (int i = 0; i<nomi.size();i++) {
                            System.out.println( nomi.get(i) + ", " + eta.get(i) + " anni, voto: " + voti.get(i));
                        } 
                    }
                    break;

                case "3":
                    System.out.println("Inserisci nome da trovare");
                    nome = scanner.nextLine();
                    boolean trovatoRicerca = false;
                    for (String n : nomi) {
                        if (n.equalsIgnoreCase(nome)) {
                            trovatoRicerca = true;
                            break;
                        }
                    }
                    if (trovatoRicerca) {
                        System.out.println("Nome trovato");
                    } 
                    else {
                        System.out.println("Nome non trovato");
                    }
                    break;

                case "4":
                    System.out.println("Inserisci nome da rimuovere");
                    nome = scanner.nextLine();
                    boolean trovato = false;
                    for (int i = 0; i < nomi.size(); i++) {
                        if (nomi.get(i).equalsIgnoreCase(nome)) {
                            nomi.remove(i);
                            voti.remove(i);
                            eta.remove(i);
                            trovato = true;
                            break;
                        }
                    }
                    if (trovato) {
                        System.out.println("Nome rimosso");
                    } 
                    else {
                        System.out.println("Nome non trovato");
                    }
                    break;
    
                case "5":
                    System.out.println("Arrivederci");
                    a = false;
                    break;

                default:
                    System.out.println("Comando non valido");
                    break;
            }

        } while (a);

        //Aggiungo ad array principale
        studenti.add(nomi);
        studenti.add(eta);
        studenti.add(voti);
        
        //Chiudo Scanner
        scanner.close();
        scan.close();
        sca.close();
    }
}
