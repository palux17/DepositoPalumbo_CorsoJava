import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        ArrayList<ContenutoDigitale> biblioteca = new ArrayList<>();
        ArrayList<ContenutoDigitale> prestiti = new ArrayList<>();
        Archivio arc = new Archivio(biblioteca, prestiti);
        int scelta;

        do{
            System.out.println("BENVENUTO!!\n1 - Aggiungi contenuto\n2 - Visualizza tutti i contenuti\n3 - Cerca contenuto per codice\n" +
                                "4 - Presta contenuto\n5 - Restituisci contenuto\n6 - Mostra disponibili\n7 - Mostra non disponibili\n" +
                                "8 - Elimina contenuto\n9 - Dettagli completi\n0 - Esci\nCosa vuoi fare: 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ?");
            scelta = scan.nextInt();
            switch (scelta) {
                case 1:
                    
                    break;
                case 2:
                    System.out.println("Ecco tutti i contenuti");
                    arc.stampaInfo();
                    break;
                case 3:
                    System.out.println("Dimmi il codice del contenuto che vuoi cercare.");
                    int codice = scan.nextInt();
                    arc.contenutoPresente(codice);
                    break;
                case 4:
                    System.out.println("Dimmi il nome del libro che vorresti prendere in prestiti.");
                    String nome = scanner.nextLine();
                    arc.prestaContenuto(nome);
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 0:
                    
                    break;
                
                default:
                    System.out.println("Comando non valido.");
                    break;
            }
        }while (scelta!=0);

        scanner.close();
        scan.close();
        sca.close();
    }
}
