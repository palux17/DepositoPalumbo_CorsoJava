import java.util.Scanner;

public class Maina {
    public static void main(String[] args) {

        //Scanner + inizializzazione + creazione variabili
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        StazioneSpaziale stazione = new StazioneSpaziale();
        Scienziato scienziato = new Scienziato("Luca", "luca@email.com");
        Ispettore ispettore = new Ispettore("Sara", "sara@email.com");
        ScienziatoCapo scienziatoCapo = new ScienziatoCapo("Marco", "marco@email.com");
        IspettoreEsperto ispettoreEsperto = new IspettoreEsperto("Anna", "anna@email.com");
        int sceltaRuolo;
        int sceltaMenu;

        //Do-while per menu login di ruolo
        do {
            System.out.println("STAZIONE SPAZIALE\n1 - Scienziato\n2 - Ispettore\n3 - Scienziato Capo\n4 - Ispettore Esperto\n" +
                    "0 - Esci\nCosa vuoi fare 0, 1 , 2 , 3 , 4?");
            sceltaRuolo = scan.nextInt();
            scan.nextLine();

            //In base al ruolo scelto ognuno avrà un nuovo menu
            switch (sceltaRuolo) {


                //Per scienzato e ispettore c'è un contatore che una volta raggiunto 3 promuove il personaggio
                //Scienziato
                case 1:
                    int azioniScienziato = 0;
                    boolean promossoScienziato = false;

                    //Login + menu
                    scienziato.login();
                    do {
                        System.out.println("MENU SCIENZIATO\n1 - Aggiungi esperimento\n2 - Mostra dati astronauta\n" +
                                (promossoScienziato ? "3 - Visualizza esperimenti\n" : "") +
                                "0 - Indietro\nCosa vuoi fare 0 , 1 , 2, 3 ?");

                        sceltaMenu = scan.nextInt();
                        scan.nextLine();
                        
                        //Azioni scienziato
                        switch (sceltaMenu) {
                            case 1:
                                System.out.println("Inserisci nome esperimento:");
                                String esp = scanner.nextLine();

                                if (!promossoScienziato) {
                                    scienziato.eseguiEsperimento(stazione, esp);
                                } else {
                                    scienziatoCapo.eseguiEsperimento(stazione, esp);
                                }

                                azioniScienziato++;
                                break;

                            case 2:
                                if (!promossoScienziato) {
                                    scienziato.stampaDati();
                                } else {
                                    scienziatoCapo.stampaDati();
                                }
                                break;

                            case 3:
                                if (promossoScienziato) {
                                    scienziatoCapo.visualizzaEsperimenti(stazione);
                                }
                                break;
                        }

                        //Promozione
                        if (azioniScienziato >= 3 && !promossoScienziato) {
                            promossoScienziato = true;
                            System.out.println("PROMOSSO A SCIENZIATO CAPO!");
                        }

                    } while (sceltaMenu != 0);
                    break;


                //Ispettore
                case 2:
                    int azioniIspettore = 0;
                    boolean promossoIspettore = false;

                    //Login + menu
                    ispettore.login();
                    do {
                        System.out.println("MENU ISPETTORE\n1 - Inserisci valutazione\n2 - Mostra dati astronauta\n" +
                                (promossoIspettore ? "3 - Visualizza valutazioni\n" : "") +
                                "0 - Indietro\nCosa vuoi fare 0 , 1 , 2" + (promossoIspettore ? " , 3 ?" : " ?"));

                        sceltaMenu = scan.nextInt();

                        //Azioni Ispettore
                        switch (sceltaMenu) {
                            case 1:
                                System.out.println("Inserisci valutazione (1-5):");
                                int val = scan.nextInt();

                                if (!promossoIspettore) {
                                    ispettore.valutaEsperimento(stazione, val);
                                } else {
                                    ispettoreEsperto.valutaEsperimento(stazione, val);
                                }

                                azioniIspettore++;
                                break;

                            case 2:
                                if (!promossoIspettore) {
                                    ispettore.stampaDati();
                                } else {
                                    ispettoreEsperto.stampaDati();
                                }
                                break;

                            case 3:
                                if (promossoIspettore) {
                                    ispettoreEsperto.visualizzaValutazioni(stazione);
                                }
                                break;
                        }

                        //PROMOZIONE
                        if (azioniIspettore >= 3 && !promossoIspettore) {
                            promossoIspettore = true;
                            System.out.println("PROMOSSO A ISPETTORE ESPERTO!");
                        }

                    } while (sceltaMenu != 0);
                    break;


                //ScienziatoCapo
                case 3:
                    //Login + menu
                    scienziatoCapo.login();
                    do {
                        System.out.println("MENU SCIENZIATO CAPO\n1 - Aggiungi esperimento\n2 - Visualizza esperimenti\n" +
                                "3 - Mostra dati astronauta\n0 - Indietro\nCosa vuoi fare 0 , 1 , 2 , 3?");
                        sceltaMenu = scan.nextInt();
                        scan.nextLine();

                        //Azioni ScienziatoCapo
                        switch (sceltaMenu) {
                            case 1:
                                System.out.println("Inserisci nome esperimento:");
                                String espCapo = scanner.nextLine();
                                scienziatoCapo.eseguiEsperimento(stazione, espCapo);
                                break;
                            case 2:
                                scienziatoCapo.visualizzaEsperimenti(stazione);
                                break;
                            case 3:
                                scienziatoCapo.stampaDati();
                                break;
                        }

                    } while (sceltaMenu != 0);
                    break;


                //Ispettore esperto
                case 4:
                    //Login + menu
                    ispettoreEsperto.login();
                    do {
                        System.out.println("MENU ISPETTORE ESPERTO\n1 - Inserisci valutazione\n2 - Visualizza valutazioni\n" +
                                "3 - Mostra dati astronauta\n0 - Indietro\nCosa vuoi fare 0 , 1 , 2 , 3?");
                        sceltaMenu = scan.nextInt();

                        //Azioni ispettore esperto
                        switch (sceltaMenu) {
                            case 1:
                                System.out.println("Inserisci valutazione (1-5):");
                                int valEsp = scan.nextInt();
                                ispettoreEsperto.valutaEsperimento(stazione, valEsp);
                                break;
                            case 2:
                                ispettoreEsperto.visualizzaValutazioni(stazione);
                                break;
                            case 3:
                                ispettoreEsperto.stampaDati();
                                break;
                        }
                    //Condizione menu ruolo
                    } while (sceltaMenu != 0);
                    break;
            }

        //Condizione menu 
        } while (sceltaRuolo != 0);

        
        scanner.close();
        scan.close();
    }
}