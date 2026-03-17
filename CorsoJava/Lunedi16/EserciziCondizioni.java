import java.util.Scanner;

public class EserciziCondizioni {
    public static void main(String[] args) {

        // Apro scanner
        Scanner scanner = new Scanner(System.in);  

        // Richiesta numero utente e assegnazione variabile
        System.out.println("Inserisci un numero:"); 
        int x = scanner.nextInt();
        //Controllo se =, >, < di 0
        if ( x == 0){
            System.out.println("Il numero inserito è 0");
        }
        else if (x>0){
            System.out.println("Numero Positivo");
        }
        else{
            System.out.println("Numero negativo");
        }


        // Richiesta numero 1 utente e assegnazione variabile
        System.out.println("Inserisci un numero");
        int firstnum = scanner.nextInt();
        // Richiesta numero 2 utente e assegnazione variabile
        System.out.println("Inserisci un altro numero");
        int secondnum = scanner.nextInt();
        //Confronto due numeri se uguali, primo>secondo, primo<secondo
        if ( firstnum == secondnum){
            System.out.println("I due numeri sono uguali");
        }
        else if ( firstnum > secondnum){
            System.out.println("Il primo numero è il maggiore");
        }
        else{
            System.out.println("Il secondo numero è il maggiore");
        }


        // Richiesta età utente e assegnazione variabile
        System.out.println("Inserisci età");
        int age = scanner.nextInt();
        //Controllo se età maggiore o minore di 18 e stampo il risultato corrispondente
        if (age>=18){
            System.out.println("Utente maggiorenne");
        }
        else{
            System.out.println("Utente minorenne");
        }


        //Richiesta anno dell'utente e assegnazione variabile
        System.out.println("Inserisci anno");
        int year = scanner.nextInt();
        //Condizione dell'if suddivisa in 2 condizioni unite fra di loro di cui la seconda l'intersezione di due sotto condizioni
        //Se l'if è positivo allora l'anno è bisestile
        if ((year%400==0) || ( ( (year%4==0) && (year%100!=0) ) )){
            System.out.println("Anno bisestile");
        }
        else{
            System.out.println("Anno non bisestile");
        }

        scanner.close();
    }
}
