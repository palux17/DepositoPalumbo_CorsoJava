import java.util.Scanner;

/*Tipi di Scanner
nextLine()      tutta la riga
next()          prossima parola
nextboolean()   true/false
nextInt()       numero intero
nextDouble()    numero decimale
nextLong()      numero long
nextFloat()     float
nextByte()      byte
nextShort()     short
 */

public class ProvaInput{
    public static void main(String[] args) {

        //Apertura di uno Scanner nuovo
        Scanner myObj = new Scanner(System.in);

        System.out.println("Inserire username");

        //Associazione dell'input ad una variabile (occhio alla coerenza dell'input con il tipo della variabile)
        String userName = myObj.nextLine();

        System.out.println("L'Username è " + userName);

        //Chiusura di uno Scanner
        myObj.close();
    }
}