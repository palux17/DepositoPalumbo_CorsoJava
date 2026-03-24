import java.util.Scanner;

public class Maina {

    /*
    ESERCIZIO – Gestione di una casa di sviluppo videoludico
    Scrivi un programma in Java che simula la gestione base di una casa di sviluppo videoludico.
    Il programma deve usare più classi che collaborano tra loro, ma senza usare ArrayList di oggetti. 
    Puoi usare oggetti normali creati singolarmente nel main.
    STRUTTURA RICHIESTA – Devi creare almeno queste classi:
        1. Classe Gioco
            Rappresenta un videogioco e contiene:
            * titolo
            * genere
            * costo di sviluppo
            * stato del progetto
            Esempi di stato del progetto:
            * "IN SVILUPPO"
            * "IN TEST"
            * "PUBBLICATO"
        2. Classe Team
            Rappresenta un team della software house e contiene:
            * nome del team
            * numero di sviluppatori
            * un oggetto Gioco assegnato
            Ogni team quindi lavora su un solo gioco.
        3. Classe Main
            Contiene il menu e gestisce l’interazione con l’utente.
            Situazione iniziale:
            Nel programma principale devi creare tre team, ad esempio:
            * Team1
            * Team2
            * Team3
    Ogni team può avere associato un gioco.
    NON DEVI USARE:
        * ArrayList<Team>
        * ArrayList<Gioco>
    MENU RICHIESTO
    Il programma deve mostrare un menu che si ripete fino all’uscita:
    1 - Assegna gioco a un team
    2 - Visualizza tutti i team
    3 - Cerca il gioco con costo di sviluppo più alto
    4 - Modifica stato di un gioco
    5 - Aggiungi sviluppatori a un team
    6 - Esci
    */

    //Apro scanner
    static Scanner scanner = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {

        //Inizializzo variabili
        Team[] team = new Team[3];
        team[0] = new Team("Team 1");
        team[1] = new Team("Team 2");
        team[2] = new Team("Team 3");
        boolean cond = true;

        //Ennesimo menu do-while
        do {
            System.out.println("\nMENU\n1 - Assegna gioco a un team\n2 - Visualizza tutti i team\n" + 
                               "3 - Cerca il gioco con costo di sviluppo più alto\n4 - Modifica stato di un gioco\n" +
                                "5 - Aggiungi sviluppatori a un team\n6 - Esci\nCosa vuoi fare: 1 , 2 , 3 , 4 , 5 , 6 ?");
            String scelta = scanner.nextLine();

            //Ennesima scelta con lo switch + default
            switch (scelta) {

                case "1":
                    Team teamScelto = scegliTeam(team);
                    if (teamScelto != null) {
                        System.out.print("Titolo gioco: ");
                        String titolo = scanner.nextLine();
                        System.out.print("Genere: ");
                        String genere = scanner.nextLine();
                        System.out.print("Costo sviluppo: ");
                        double costo = sca.nextDouble();
                        System.out.print("Stato (IN SVILUPPO / IN TEST / PUBBLICATO): ");
                        String stato = scanner.nextLine();
                        Gioco gioco = new Gioco(titolo, genere, costo, stato);
                        teamScelto.setGioco(gioco);
                        System.out.println("\nGioco assegnato con successo.\n");
                    }
                    break;

                case "2":
                    System.out.println("Ecco i dati:\n");
                    for (int i = 0; i < team.length; i++) {
                        team[i].mostraDati();
                    }
                    break;

                case "3":
                    Team maxTeam = trovaGiocoCostoso(team);
                    if (maxTeam != null) {
                        System.out.println("Team con gioco più costoso: " + maxTeam.getNome());
                        maxTeam.mostraDati();
                    } else {
                        System.out.println("Nessun gioco presente.\n");
                    }
                    break;

                case "4":
                    Team teamMod = scegliTeam(team);
                    if (teamMod != null && teamMod.getGioco() != null) {
                        System.out.print("Nuovo stato: ");
                        String nuovoStato = scanner.nextLine();
                        teamMod.getGioco().setStato(nuovoStato);
                        System.out.println("Stato aggiornato.");
                    } else {
                        System.out.println("Nessun gioco");
                    }
                    break;

                case "5":
                    Team teamDev = scegliTeam(team);
                    if (teamDev != null) {
                        System.out.print("Quanti sviluppatori aggiungere: ");
                        int num = Integer.parseInt(scanner.nextLine());
                        teamDev.aggiungiSviluppatori(num);
                    }
                    break;

                case "6":
                    System.out.println("Uscita dal programma.");
                    cond = false;
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (cond);

        scanner.close();
    }

    //Metodo per restituire un team su scelta dell'utente
    public static Team scegliTeam(Team[] team) {
        System.out.println("Scegli un team: ");
        for (int i = 0; i < team.length; i++) {
            System.out.println((i + 1) + " - " + team[i].getNome());
        }
        System.out.print("Quale vuoi? ");
        int scelta = scan.nextInt();
        if (scelta >= 1 && scelta <= team.length) {
            return team[scelta - 1];
        } 
        else {
            System.out.println("Team non valido.");
            return null;
        }
    }

    //Ciclo for per scorrere i team e restituire il più costoso
    public static Team trovaGiocoCostoso(Team[] team) {
        Team max = null;
        for (int i = 0; i < team.length; i++) {
            if (team[i].getGioco() != null) {
                if (max == null ||
                    team[i].getGioco().getCostoSviluppo() > max.getGioco().getCostoSviluppo()) {
                    max = team[i];
                }
            }
        }

        return max;
    }
}
