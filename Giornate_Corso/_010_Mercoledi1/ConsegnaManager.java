import java.util.ArrayList;
import java.util.Scanner;

public class ConsegnaManager {

    public static void main(String[] args) {

        //Inizializzo
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        ArrayList<VeicoloConsegna> veicoli = new ArrayList<>();
        int scelta;

        //do while menu
        do {
            System.out.println("MENU DELIVERY:\n1 - Aggiungi Furgone\n2 - Aggiungi Drone\n3 - Visualizza veicoli\n4 - Effettua consegna" +
                                "\n5 - Traccia consegna\n0 - Esci\nCosa vuoi fare: 0 , 1 , 2 , 3 , 4 , 5 ?");
            scelta = scanner.nextInt();
            scanner.nextLine();

            //Switch per casistiche
            switch (scelta) {

                case 1:
                    System.out.print("Inserisci targa furgone: ");
                    String targaFurgone = scanner.nextLine();
                    System.out.print("Inserisci carico massimo: ");
                    float caricoFurgone = sca.nextFloat();
                    sca.nextLine();
                    veicoli.add(new Furgone(targaFurgone, caricoFurgone));
                    System.out.println("Furgone aggiunto con successo.");
                    break;

                case 2:
                    System.out.print("Inserisci codice drone/targa: ");
                    String targaDrone = scanner.nextLine();
                    System.out.print("Inserisci carico massimo: ");
                    float caricoDrone = scan.nextFloat();
                    scan.nextLine();
                    veicoli.add(new Drone(targaDrone, caricoDrone));
                    System.out.println("Drone aggiunto con successo.");
                    break;

                case 3:
                    if (veicoli.isEmpty()) {
                        System.out.println("Nessun veicolo presente.");
                    } else {
                        for (int i = 0; i < veicoli.size(); i++) {
                            System.out.println("\nVeicolo in posizione " + i);
                            veicoli.get(i).stampaInfo();
                        }
                    }
                    break;

                case 4:
                    if (veicoli.isEmpty()) {
                        System.out.println("Nessun veicolo disponibile.");
                    } else {
                        System.out.print("Inserisci indice del veicolo: ");
                        int indiceConsegna = scan.nextInt();
                        scan.nextLine();

                        if (indiceConsegna >= 0 && indiceConsegna < veicoli.size()) {
                            System.out.print("Inserisci destinazione: ");
                            String destinazione = scanner.nextLine();

                            VeicoloConsegna veicolo = veicoli.get(indiceConsegna);
                            veicolo.consegnaPacco(destinazione);
                        } else {
                            System.out.println("Indice non valido.");
                        }
                    }
                    break;

                case 5:
                    if (veicoli.isEmpty()) {
                        System.out.println("Nessun veicolo disponibile.");
                    } else {
                        System.out.print("Inserisci indice del veicolo: ");
                        int indiceTracking = scan.nextInt();
                        scan.nextLine();

                        if (indiceTracking >= 0 && indiceTracking < veicoli.size()) {
                            System.out.print("Inserisci codice tracking: ");
                            String codiceTracking = scanner.nextLine();

                            VeicoloConsegna veicolo = veicoli.get(indiceTracking);

                            if (veicolo instanceof Tracciabile) {
                                Tracciabile tracciabile = (Tracciabile) veicolo;
                                tracciabile.tracciaConsegna(codiceTracking);
                            } else {
                                System.out.println("Questo veicolo non supporta il tracking.");
                            }

                        } else {
                            System.out.println("Indice non valido.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
            //Condizione do-while
        } while (scelta != 0);

        //Chiudo scanner
        scanner.close();
        scan.close();
        sca.close();
    }
}