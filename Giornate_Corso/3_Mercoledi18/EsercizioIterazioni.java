package Mercoledi18;

import java.util.Scanner;

public class EsercizioIterazioni {
    public static void main(String[] args) {

        /*
        Scrivi un programma Java che: 
        Chieda all’utente di inserire una password.
        L’utente ha massimo 3 tentativi per inserirla correttamente.
        La password corretta è "java123".
        Usa un ciclo while per gestire i tentativi e un if per verificare se la password è corretta.
        Dopo il login riuscito, usa un ciclo do-while per chiedere conferma dell’accesso: "Vuoi accedere al sistema? (s/n)"
        Continua a chiedere finché non viene digitato s o n.
        Infine:
        Se l’utente ha confermato con s, stampa "Accesso al sistema effettuato".
        Se ha detto n, stampa "Accesso annullato".
        Se i 3 tentativi vengono esauriti senza successo, stampa "Accesso bloccato".
        */
        
        //Apro scanner
        Scanner scanner = new Scanner(System.in);

        //Inizializzo variabili
        String passwordcorretta = "java123";
        int cont = 0;
        String risposta = "";

        //Ripeto entro il numero massimo di tentativi
        while(cont<3){

            //Chiedo e assegno password
            System.out.println("Inserisci password:");
            String password = scanner.nextLine();

            //Controllo password sia giusta
            if (password.equals(passwordcorretta)){
                
                //Continuo a chiedere una risposta adatta 
                do{
                    System.out.println("Password Corretta!\nVuoi accedere al sistema: s/n?");
                    risposta = scanner.nextLine();
                }while (!risposta.toLowerCase().equals("s") && !risposta.toLowerCase().equals("n") );

                //Stampo in base alla risposta data
                if (risposta.toLowerCase().equals("s")){
                    System.out.println("Accesso al sistema effettuato");
                }
                else{
                    System.out.println("Accesso annullato");
                }
                break;
            }

            else{
                System.out.println("Password errata");
            }
            
            //Aumento contatore
            cont++;
        }

        //Stampa in caso di tentativi esauriti
        if (cont==3){
            System.out.println("Accesso bloccato");
        }

        //Chiudo scanner
        scanner.close();  
    

        
        /*
        Scrivi un programma Java che:
        Chiede all’utente quanti voti vuole inserire (intero positivo).
        Usa un ciclo while per validare che il numero sia maggiore di zero.
        Poi usa un ciclo for per inserire ogni voto.
        Ogni voto deve essere un numero compreso tra 0 e 30 (estremi inclusi).
        Se il voto è valido:
            Se è maggiore o uguale a 18 e minore di 24, stampa "Sufficiente"
            Se è maggiore o uguale a 24, stampa "Buono o Ottimo"
            Altrimenti stampa "Insufficiente"
        Se il voto non è valido (fuori range), stampa "Voto non valido" e non lo conta tra quelli validi.
        Alla fine, stampa il numero totale di voti validi inseriti.
        */

        //Apro scanner
        Scanner scan = new Scanner(System.in);

        //Inizializzo e assegno variabili
        System.out.println("Inserisci numero di voti");
        int numvoti = scan.nextInt();
        int numvotivalidi = 0;

        //Controllo che numero di iterazioni sia valido
        if(numvoti>0){

            //Chiedo voti un numero di volte pari a numvoti
            for(int i = 0; i<numvoti; i++){

                //Chiedo il voto
                System.out.println("Inserisci un voto");
                int voto = scan.nextInt();

                //In base al voto stampo il risultato e aggiorno il contatore numeri voti validi
                if(voto>=24 && voto<=30){
                    System.out.println("Buono o Ottimo");
                    numvotivalidi++;
                }
                else if(18<=voto && voto<24){
                    System.out.println("Sufficiente");
                    numvotivalidi++;
                }
                else if (voto>=0 && voto<18){
                    System.out.println("Insufficiente");
                    numvotivalidi++;
                }
                else{
                    System.out.println("Voto non valido");
                }
            }

            //Stampo numeri voti validi
            System.out.println("Il numero di voti validi è " + numvotivalidi);
        }

        //Stampo errore numeri di voti validi 
        else{
            System.out.println("Numero di voti non valido");
        }

        //Chiudo scanner
        scan.close();
    }
    

}
