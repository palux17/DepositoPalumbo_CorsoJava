import java.util.Scanner;

public class EserciziRandom {
    public static void main(String[] args) {

        /*
        Scrivi un programma che chiede all’utente di inserire un username.
        Il programma deve verificare:
            Se lo username è vuoto → stampa "Username non valido"
            Se la lunghezza è minore di 5 caratteri → stampa "Username troppo corto"
            Se la lunghezza è maggiore o uguale a 5 → stampa "Username valido"
        */

        //Apro scanner
        Scanner scanner = new Scanner(System.in);

        //Richiesta e assegnazione username
        System.out.println("Inserisci nome utente:");
        String username = scanner.nextLine();

        //Verifico se stringa vuota
        if(username.isEmpty()){
            System.out.println("Username non valido");
        }
        //Essendo non vuota, controllo lunghezza della stringa 
        else{
            //Lunghezza insufficiente mando errore a schermo
            if(username.length()<5){
                System.out.println("Usename troppo corto");
            }
            //tutto ok
            else{
                System.out.println("Username valido");
            }
        }

        //Chiudo scanner
        scanner.close();



        /*
        Scrivi un programma che chiede all’utente: Username, Password
        Il sistema ha credenziali predefinite: Username corretto: "admin", Password corretta: "1234"
        Il programma deve:
        Confrontare username e password (ignorando maiuscole/minuscole per lo username)
        Se entrambi sono corretti → stampa "Accesso consentito"
        Se solo uno è sbagliato → stampa "Credenziali errate"
        Se entrambi sono sbagliati → stampa "Accesso negato"
         */

        //La parte dell'username la riprendo dall'esserciziodi prima

        //Apro scanner
        Scanner scan = new Scanner(System.in);

        //Chiedo e assegno password
        System.out.println("Inserisci password:");
        String password = scan.nextLine();

        //Verifico in primis se l'username è corretto.  
        if(username.toLowerCase().equals("admin")){
            //Controllo password: se corretta consento login sennò credenziali errate
            if(password.equals("1234")){
                System.out.println("Accesso Consentito!");
            }
            else{
                System.out.println("Credenziali errate");
            }
        }
        //Username non è corretto. 
        else{
            //Controllo password: se coincide allora credenziali errate sennò accesso negato
            if(password.equals("1234")){
                System.out.println("Credenziali Errate");
            }
            else{
                System.out.println("Accesso Negato");
            }
        }

        //Scanner chiuso
        scan.close();



        /*
        Scrivi un programma che chiede all’utente di inserire: Un codice sconto (stringa), L’importo totale della spesa (numero)
        Il programma deve: Convertire l’importo inserito in numero (casting)
        Verificare il codice sconto:
        Se il codice è "SCONTO10" -> sconto del 10%
        Se il codice è "SCONTO20" -> sconto del 20%
        Se il codice è "VIP"      -> sconto del 30% SOLO se la spesa è maggiore di 100
        Se il codice non è valido -> stampa "Codice non valido"
        Stampare il totale scontato (solo se il codice è valido)
        */

        //Apro scanner per stringa e scanner per int
        Scanner sca = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        //Chiedo e assegno variabili
        System.out.println("Inserisci sconto");
        String sconto = sca.nextLine();
        System.out.println("Inserisci spesa:");
        int spesa = sc.nextInt();

        //Verifico che sconto corrisponda ai valori preassegnati sennò mando errore a schermo. Se giusto aggiorno spesa e la stampo
        if (sconto.equals("SCONTO10")){
            spesa *= 0.9;
            System.out.println("Il totale è " + spesa);
        }
        else if (sconto.equals("SCONTO20")){
            spesa *= 0.8;
            System.out.println("Il totale è " + spesa);
        }
        else if (sconto.equals("VIP") && spesa>100){
            spesa *= 0.7;
            System.out.println("Il totale è " + spesa);
        }
        else{
            System.out.println("Codice non valido");
        }

        //Chiudo scanner
        sca.close();
        sc.close();


        /*
        Scrivi un programma che mostri all’utente un menu testuale con le seguenti opzioni:
        1 - Visualizza profilo
        2 - Modifica nome
        3 - Logout
        Il programma deve: Chiedere all’utente di inserire un numero, Utilizzare uno switch per gestire la scelta
        Comportamento:
        Se l’utente inserisce 1 → stampa "Profilo utente visualizzato"
        Se inserisce 2 → chiedi all’utente di inserire un nuovo nome e stampa "Nome aggiornato in: [nome]"
        Se inserisce 3 → stampa "Logout effettuato"
        Per qualsiasi altro valore → stampa "Scelta non valida"
        */

        //Apro scanner
        Scanner scann = new Scanner(System.in);
        
        //Stampo menu e scelte disponibili e assegno l'input ad una variabile
        System.out.println("Menu:\n1 - Visualizza profilo\n2 - Modifica nome\n3 - Logout\nCosa vuoi fare: 1 , 2 , 3 ?");
        String scelta = scann.nextLine();

        //Creo uno switch sulla variabile assegnata con i 3 cas + default
        switch (scelta) {
            case "1":
                System.out.println("Profilo utente visualizzato");
                break;
            case "2":
                System.out.println("Inserisci nuovo nome");
                username = scann.nextLine();
                System.out.println("Nome aggiornato in " + username);
                break;
            case "3":
                System.out.println("Logout effettuato");
                break;
            default:
                System.out.println("Scelta non valida");
                break;
        }

        //Chiudo scanner
        scann.close();



        /*
        come extra prova uno switch conseguenziale dovrà va prima 1 poi 2 poi 3 in tutti i case e difficile ma prova
        */

        //Apro scanner
        Scanner scanne = new Scanner(System.in);
        
        //Stampo menu e scelte disponibili e assegno l'input ad una variabile
        System.out.println("Menu:\n1 - Visualizza profilo\n2 - Modifica nome\n3 - Logout\nCosa vuoi fare: 1 , 2 , 3 ?");
        String scelt = scanne.nextLine();

        //Creo uno switch sulla variabile assegnata con i 3 cas + default. La variabile viene aggiornata alla fine per permettere
        //di passare da un caso all'altro.
        switch (scelt) {
            case "1":
                System.out.println("Profilo utente visualizzato");
                scelt = "2";
            case "2":
                System.out.println("Inserisci nuovo nome");
                username = scanne.nextLine();
                System.out.println("Nome aggiornato in " + username);
                if (scelt.equals("2")){
                    break;
                }
                scelt = "3";
            case "3":
                System.out.println("Logout effettuato");
                break;
            default:
                System.out.println("Scelta non valida");
                break;
        }
        //Chiudo scanner
        scanne.close();    
    }  
}
