import java.util.Scanner;

public class EserciziMatematici {
    public static void main(String[] args) {
        /*
        Creare un sistema di menu, che permetta dopo aver scelto di procedere, 
        di avere disponibili 4 operazioni matematiche a scelta vostra su due addendi
        */

        //Apro scanner
        Scanner scanner = new Scanner(System.in);

        //Richiesta variabili all'utente e assegnazione
        System.out.println("Inserisci un numero:");
        int num1 = scanner.nextInt();
        System.out.println("Inserisci un altro numero:");
        int num2 = scanner.nextInt();

        //Calcolo risultati
        int sum = num1+num2;
        int dif = num1-num2;
        int pro = num1*num2;
        int quo = num1/num2;

        //Stampa risultati
        System.out.println("Risultati:\nLa somma è " + sum + "\nLa differenza è " + dif +
                         "\nIl prodotto è " + pro + "\nIl quoziente è " + quo );
        
        //Chiudo scanner
        scanner.close();

    }    
}
