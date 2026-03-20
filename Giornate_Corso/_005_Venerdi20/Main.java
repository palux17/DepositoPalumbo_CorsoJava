import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creazione oggetti Libro
        Libro libro1 = new Libro("Il Signore degli Anelli", "Tolkien", 29.99);
        Libro libro2 = new Libro("1984", "George Orwell", 14.50);
        // Stampa dettagli
        libro1.stampaDettagli();
        libro2.stampaDettagli();

        // Creazione oggetti Persona
        Persona p1 = new Persona("Andrea", 25, "Roma");
        Persona p2 = new Persona("Luca", 30, "Milano");

        // Stampa dettagli
        p1.stampaDettagli();
        p2.stampaDettagli();
        

        
        /*
        Scrivi un programma in Java che gestisce un solo veicolo utilizzando una classe Veicolo.
        Devi creare una classe Veicolo con le seguenti variabili:
        - marca
        - modello
        - anno
        - prezzo
        Nel programma principale (main) devi creare un oggetto Veicolo e permettere all’utente di modificarlo tramite un menu.
        MENU:
        1 - Inserisci dati veicolo
        2 - Visualizza veicolo
        3 - Modifica prezzo
        4 - Verifica età veicolo
        5 - Esci
        FUNZIONALITÀ RICHIESTE:
        1 - Inserisci dati veicolo
            - Chiedi marca, modello, anno e prezzo
            - Salva i dati nell’oggetto
                Controlli:
                - prezzo > 0
                - anno > 1900
        2 - Visualizza veicolo
            - Stampa tutte le informazioni del veicolo
            - Se non è stato ancora inserito → stampa "Nessun veicolo inserito"
        3 - Modifica prezzo
            - Chiedi un nuovo prezzo
            - Se valido (> 0) aggiorna il valore
            - Altrimenti stampa errore
        4 - Verifica età veicolo
        - Calcola se il veicolo è:
            * "Nuovo" (meno di 5 anni)
            * "Usato" (tra 5 e 15 anni)
            * "Vecchio" (più di 15 anni)
        5 - Esci
        - Termina il programma
        */

        //Apro scanner e inizializzo variabili
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        Veicolo veicolo = new Veicolo();
        boolean cond = true;
        
        //Ciclo do-while per mantenere attivo il menu
        do {
            System.out.println("Benvenuto!\nMenu:\n1 - Inserisci veicolo\n2 - Visualizza veicolo\n3 - Modifica prezzo\n" + 
                                "4 - Verifica età veicolo\n5 - Esci/nCosa vuoi fare: 1 , 2 , 3 , 4 , 5 ?");
            String scelta = scanner.nextLine();

            //switch per le varie casistiche + default
            switch (scelta) {

                case "1":
                    System.out.print("Inserisci marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Inserisci modello: ");
                    String modello = scanner.nextLine();
                    System.out.print("Inserisci anno: ");
                    int anno = scan.nextInt();
                    System.out.print("Inserisci prezzo: ");
                    double prezzo = sca.nextDouble();
                    veicolo.inserisciDati(marca, modello, anno, prezzo);
                    break;

                case "2":
                    veicolo.visualizzaVeicolo();
                    break;

                case "3":
                    System.out.print("Inserisci nuovo prezzo: ");
                    double nuovoPrezzo = sca.nextDouble();
                    veicolo.modificaPrezzo(nuovoPrezzo);
                    break;

                case "4":
                    veicolo.verificaEtaVeicolo();
                    break;

                case "5":
                    System.out.println("Arrivederci");
                    cond = false;
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (cond);

        //Chiudo scanner
        scanner.close();
        scan.close();
        sca.close();
    }
}
    