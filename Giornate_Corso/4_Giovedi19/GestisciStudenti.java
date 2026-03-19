import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class GestisciStudenti {

    /*
    Scrivi un programma che gestisce i voti di uno studente utilizzando le funzioni (metodi).
    Il programma deve:
    Chiedere all’utente quanti voti vuole inserire
    Inserire i voti uno alla volta
    Mostrare un menu:
    1 - Calcola media
    2 - Mostra voto più alto
    3 - Mostra voto più basso
    4 - Verifica promozione
    5 - Esci
    Utilizzare uno switch
    Ogni operazione deve essere gestita da una funzione separata
    Funzionalità richieste:
        calcolaMedia(somma, numeroVoti)
        trovaMax(max)
        trovaMin(min)
        verificaPromozione(media)
            Se media ≥ 6 → "Promosso"
            Altrimenti → "Bocciato"
    */

    //CalcolaMedia
    public static int calcolaMedia(ArrayList<Integer> voti){
        int sum = 0;
        for (Integer i: voti) {
            sum += i;
        }
        return sum/voti.size();
    }
    //Trova Numero Massimo
    public static int TrovaMax(ArrayList<Integer> voti){
        int max = voti.get(0);
        for (Integer i: voti) {
            if (i>max){
                max = i;
            }
        }
        return max;
    }
    //Trova Numero Minimo
    public static int TrovaMin(ArrayList<Integer> voti){
        int min = voti.get(0);
        for (Integer i: voti) {
            if (i<min){
                min = i;
            }
        }
        return min;
    }
    //Controlla Promozione
    public static boolean VerificaPromozione(ArrayList<Integer> voti){
        int media = calcolaMedia(voti);
        if(media>=6){
            System.out.println("Promosso");
            return true;
        }
        else{
            System.out.println("Bocciato");
            return false;
        }
    }



    public static void main(String[] args) {

        //Apro scanner e inizializzo variabili
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        boolean cond = true;
        String scelta;
        HashMap<String,ArrayList<Integer>> studenti = new HashMap<>();
        System.out.println("Quanti studenti vuoi inserire?");
        int numero = scanner.nextInt();

        //Riempio il dizionario con chiave nomi studenti e valore arraylist di interi (voti)
        for(int i=0; i<numero; i++){
            String nome;
            ArrayList<Integer> voti = new ArrayList<>();
            System.out.println("Come si chiama lo studente?");
            nome = scan.nextLine();
            System.out.println("Quanti voti ha preso " + nome +"?");
            int numvoti = scanner.nextInt();
            for(int j=0; j<numvoti; j++){
                System.out.println("Inserisci nuovo voto:");
                int nuovovoto = scanner.nextInt();
                voti.add(nuovovoto);
            }
            studenti.put(nome, voti);
        }

        //Ciclo do while per richiedere domande all'utente
        do{
            System.out.println("Di quale studente vuoi avere informazioni?");
            String name = scan.nextLine();

            //Se studente presente gli chiedo quale comando eseguire
            if(studenti.containsKey(name)){
                System.out.println("Menu:\n1 - Calcola media\n2 - Mostra voto più alto\n3 - Mostra voto più basso\n" +
                                    "4 - Verifica promozione\n5 - Esci");
                scelta = scan.nextLine();
                switch (scelta){
                case "1":
                    System.out.println("Media: " + calcolaMedia(studenti.get(name)));
                    break;
                case "2":
                    System.out.println("Max: " + TrovaMax(studenti.get(name)));
                    break;
                case "3":
                    System.out.println("Min: " + TrovaMin(studenti.get(name)));
                    break;
                case "4":
                    VerificaPromozione(studenti.get(name));
                    break;
                case "5":
                    System.out.println("Arrivederci");
                    cond = false;
                    break;
                default:
                    System.out.println("Comando non valido");
                    break;
                }
            }
            //Caso studente non presente
            else{
                System.out.println("Lo studente selezionato non è presente");
            }
            
        }while (cond);

        //Chiudo Scanner
        scanner.close();
        scan.close();
    }
}
