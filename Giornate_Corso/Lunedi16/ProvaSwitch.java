import java.util.Scanner;

public class ProvaSwitch {
    public static void main(String[] args) {
        
        //Apro scanner
        Scanner scanner = new Scanner(System.in);

        //Chiedo variabili di default e le assegno 
        System.out.println("Dimmi come ti chiami");
        String name = scanner.nextLine();
        System.out.println("Dimmi il tuo cognome");
        String surname = scanner.nextLine();
        System.out.println("Dimmi la password");
        String password = scanner.nextLine();

        //Chiedo all'utente variabile da cambiare e assegno variabile (lowercase per evitare problemi con maiuscole)
        System.out.println("Dimmi cosa vuoi cambiare: nome , cognome o password ?");;
        String condizione = scanner.nextLine().toLowerCase();

        //Creo switch su i tre valori (e un default in caso errore di immissione da parte dell'utente) e stampo a
        // schermo la conferma dell'operazione
        switch (condizione){
            case "nome":
                System.out.println("Dimmi il nuovo nome");
                name = scanner.nextLine();
                System.out.println("Nome cambiato correttamente in " + name );
                break;

            case "cognome":
                System.out.println("Dimmi il nuovo cognome");
                surname = scanner.nextLine();
                System.out.println("Cognome cambiato correttamente in " + surname);
                break;

            case "password":
                System.out.println("Dimmi la nuova password");
                password = scanner.nextLine();
                System.out.println("Password cambiata correttamente in " + password);
                break;
            
            default:
                System.out.println("Valore non valido");
        }

        //Stampa a schermo di tutti i dati compreso quello aggiornato
        System.out.println("Ecco i tuoi dati:\n" + "Nome: " + name + "\nCognome: " + surname + "\nPassword: " + password);

        //Chiudo Scanner
        scanner.close();

    }
}
