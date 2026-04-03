import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner + Inizializzo 
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        ArrayList<Veicolo> veicoli = new ArrayList<>();
        int scelta;

        //do-while menu
        do {
            System.out.println("SISTEMA GESTIONE AUTOSTRADALE:\n1 - Inserisci Auto\n2 - Inserisci Camion\n3 - Inserisci Moto" +
                                "4 - Mostra tutti i veicoli\n5 - Calcola e stampa pedaggi\n0 - Esci\nCosa vuoi fare: 0 , 1 , 2 , 3 , 4, , 5 ?");
            scelta = scan.nextInt();
            scanner.nextLine();

            //Scelta
            switch (scelta) {

                case 1:
                    System.out.print("Inserisci targa auto: ");
                    String targaAuto = scanner.nextLine();

                    System.out.print("Inserisci velocità auto: ");
                    double velocitaAuto = sca.nextDouble();

                    System.out.print("Inserisci numero assi auto: ");
                    int assiAuto = scan.nextInt();

                    System.out.print("Inserisci numero porte auto: ");
                    int porte = scan.nextInt();
                    scanner.nextLine();

                    veicoli.add(new Auto(targaAuto, velocitaAuto, assiAuto, porte));
                    System.out.println("Auto inserita correttamente.");
                    break;

                case 2:
                    System.out.print("Inserisci targa camion: ");
                    String targaCamion = scanner.nextLine();

                    System.out.print("Inserisci velocità camion: ");
                    double velocitaCamion = sca.nextDouble();

                    System.out.print("Inserisci numero assi camion: ");
                    int assiCamion = scan.nextInt();

                    System.out.print("Inserisci peso camion (kg): ");
                    double peso = sca.nextDouble();
                    scanner.nextLine();

                    veicoli.add(new Camion(targaCamion, velocitaCamion, assiCamion, peso));
                    System.out.println("Camion inserito correttamente.");
                    break;

                case 3:
                    System.out.print("Inserisci targa moto: ");
                    String targaMoto = scanner.nextLine();

                    System.out.print("Inserisci velocità moto: ");
                    double velocitaMoto = sca.nextDouble();

                    System.out.print("Inserisci numero assi moto: ");
                    int assiMoto = scan.nextInt();

                    System.out.print("Inserisci cilindrata moto: ");
                    int cilindrata = scan.nextInt();
                    scanner.nextLine();

                    veicoli.add(new Moto(targaMoto, velocitaMoto, assiMoto, cilindrata));
                    System.out.println("Moto inserita correttamente.");
                    break;

                case 4:
                    if (veicoli.isEmpty()) {
                        System.out.println("Nessun veicolo presente.");
                    } else {
                        System.out.println("VEICOLI:");
                        for (Veicolo v : veicoli) {
                            System.out.println(v);
                        }
                    }
                    break;

                case 5:
                    if (veicoli.isEmpty()) {
                        System.out.println("Nessun veicolo presente.");
                    } else {
                        System.out.println("PEDAGGI VEICOLI:");
                        for (Veicolo v : veicoli) {
                            System.out.println("Targa: " + v.getTarga());
                            System.out.println("Tipo: " + v.getClass().getSimpleName());
                            System.out.println("Pedaggio: €" + v.calcolaPedaggio());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Uscendo");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        //Chiudo scanner
        scanner.close();
        scan.close();
        sca.close();
    }
}