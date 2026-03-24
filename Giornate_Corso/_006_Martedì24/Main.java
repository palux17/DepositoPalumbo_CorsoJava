import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ESERCIZIO – Gestione Negozi e Prodotti
        Scrivere un programma in Java che gestisca un insieme di negozi.
        Ogni negozio ha:
        * un nome
        * un solo prodotto associato
        Ogni prodotto ha:
        * nome
        * prezzo
        * quantità disponibile
        REQUISITI:
        1. Creare una classe Prodotto con gli attributi:
        * nome
        * prezzo
        * quantità disponibile
        2. Creare una classe Negozio con:
        * nome del negozio
        * un oggetto Prodotto
        3. Nel metodo main:
        * creare 3 negozi
        * gestire il programma tramite un menu interattivo
        MENU:
        1 - Inserisci prodotto in un negozio
        2 - Visualizza dati di tutti i negozi
        3 - Cerca il negozio con il prodotto più costoso
        4 - Modifica quantità di un prodotto
        5 - Vendi prodotti da un negozio
        6 - Esci
        FUNZIONALITÀ:
        * Inserimento prodotto:
        scegliere il negozio e inserire nome, prezzo e quantità
        * Visualizzazione:
        mostrare i dati di tutti i negozi e dei rispettivi prodotti
        * Prodotto più costoso:
        confrontare i prezzi dei prodotti presenti nei negozi e stampare il negozio con il prezzo maggiore
        * Modifica quantità:
        aggiornare la quantità disponibile di un prodotto
        * Vendita:
        ridurre la quantità disponibile controllando che la quantità richiesta sia valida
        NOTE:
        * Ogni negozio può avere un solo prodotto
        * Non utilizzare ArrayList di negozi o prodotti
        * Gestire i casi in cui un negozio non ha ancora un prodotto
        */

        //Scanner + Inizializzazione
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        Negozio negozio1 = new Negozio("Negozio 1");
        Negozio negozio2 = new Negozio("Negozio 2");
        Negozio negozio3 = new Negozio("Negozio 3");
        boolean cond = true;
        String scelta;

        //Ciclo do-while per il menu
        
        do {
            System.out.println("Menu:\n1 - Inserisci prodotto in un negozio\n2 - Visualizza dati di tutti i negozi\n" +
            "3 - Cerca il negozio con il prodotto più costoso\n4 - Modifica quantità di un prodotto\n" +
            "5 - Vendi prodotti da un negozio6 - Esci\nCosa vuoi fare: 1 , 2 , 3 , 4 , 5 , 6 ?");
            System.out.print("Scelta: ");
            scelta = scanner.nextLine();

            //Switch per casistiche
            switch (scelta) {
                case "1":
                    Negozio negozioScelto = scegliNegozio(negozio1, negozio2, negozio3);
                    if (negozioScelto != null) {
                        System.out.print("Inserisci nome prodotto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Inserisci prezzo prodotto: ");
                        double prezzo = sca.nextDouble();
                        System.out.print("Inserisci quantità disponibile: ");
                        int quantita = scan.nextInt();
                        Prodotto nuovoProdotto = new Prodotto(nome, prezzo, quantita);
                        negozioScelto.setProdotto(nuovoProdotto);
                        System.out.println("Prodotto inserito");
                    }
                    break;
                
                //Richiamo mostradati 3 volte
                case "2":
                    System.out.println("Ecco i dati dei negozi");
                    negozio1.mostraDatiNegozio();
                    negozio2.mostraDatiNegozio();
                    negozio3.mostraDatiNegozio();
                    break;
                
                //Richiamo prodotto più costoso
                case "3":
                    Negozio negozioCostoso = trovaNegozioProdottoPiuCostoso(negozio1, negozio2, negozio3);
                    if (negozioCostoso != null) {
                        System.out.println("Il negozio con il prodotto più costoso è: " + negozioCostoso.getNomeNegozio());
                        negozioCostoso.mostraDatiNegozio();
                    } else {
                        System.out.println("Nessun prodotto presente nei negozi.");
                    }
                    break;
                
                //Modifica quantità
                case "4":
                    Negozio negozioDaModificare = scegliNegozio(negozio1, negozio2, negozio3);
                    if (negozioDaModificare != null) {
                        System.out.print("Inserisci la nuova quantità: ");
                        int nuovaQuantita = scan.nextInt();
                        negozioDaModificare.modificaQuantita(nuovaQuantita);
                    }
                    break;
                
                //Vendere prodotti
                case "5":
                    Negozio negozioDaVendere = scegliNegozio(negozio1, negozio2, negozio3);
                    if (negozioDaVendere != null) {
                        System.out.print("Inserisci quantità da vendere: ");
                        int quantitaVenduta = scan.nextInt();
                        negozioDaVendere.vendiProdotto(quantitaVenduta);
                    }
                    break;
                
                //Esci
                case "6":
                    System.out.println("Uscita dal programma.");
                    cond = false;
                    break;
                
                //Default
                default:
                    System.out.println("Scelta non valida.");
            }
        
        //Condizione da aggiornare
        } while (cond);

        //Chiudo scanner
        scanner.close();
        scan.close();
        sca.close();
    }

    //Metodo per scegliere a che negozio fare riferimento
    public static Negozio scegliNegozio(Negozio negozio1, Negozio negozio2, Negozio negozio3) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli un negozio:\n1 - " + negozio1.getNomeNegozio() + "\n2 - " + negozio2.getNomeNegozio() + 
                            "\n3 - " + negozio3.getNomeNegozio() + "\nVuoi 1 , 2 ,3 ?");
        String sceltaNegozio = scanner.nextLine();
        scanner.close();
        switch (sceltaNegozio) {
            case "1":
                return negozio1;
            case "2":
                return negozio2;
            case "3":
                return negozio3;
            default:
                System.out.println("Negozio non valido.");
                return null;
        }
    }

    //Trovare il prodotto più costoso e restituirne il negozio associato
    public static Negozio trovaNegozioProdottoPiuCostoso(Negozio negozio1, Negozio negozio2, Negozio negozio3) {
        Negozio maxNegozio = null;
        if (negozio1.getProdotto() != null) {
            maxNegozio = negozio1;
        }
        if (negozio2.getProdotto() != null) {
            if (  (maxNegozio == null) || (negozio2.getProdotto().getPrezzo() > maxNegozio.getProdotto().getPrezzo())) {
                maxNegozio = negozio2;
            }
        }
        if (negozio3.getProdotto() != null) {
            if ( (maxNegozio == null) || (negozio3.getProdotto().getPrezzo() > maxNegozio.getProdotto().getPrezzo())) {
                maxNegozio = negozio3;
            }
        }
        return maxNegozio;
    }
    
}