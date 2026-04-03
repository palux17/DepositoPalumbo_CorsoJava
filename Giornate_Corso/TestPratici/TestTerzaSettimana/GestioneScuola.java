import java.util.ArrayList;
import java.util.Scanner;

public class GestioneScuola {

    public static void main(String[] args) {

        //Inizializzo variabili
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        ArrayList<Studente> studenti = new ArrayList<>();
        ArrayList<Docente> docenti = new ArrayList<>();
        int scelta;

        //do-while per menu
        do {
            System.out.println("GESTIONE SCUOLA:\n1 - Crea studente\n2 - Crea docente\n3 - Assegna studente a docente\n4 - Assegna voto a studente" +
                                "\n5 - Stampa voti di uno studente\n6 - Mostra ruoli\n7 - Mostra registrazione persona\n8 - Mostra studenti assegnati a un docente\n" +
                                "0 - Esci\nCosa vuoi fare: 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 ?");
            scelta = scan.nextInt();
            scan.nextLine();

            //Switch per casistiche su input per utente
            switch (scelta) {

                //Creazione stuedente
                case 1:
                    System.out.println("Che tipo di studente vuoi creare: 1 , 2 ?\n1 - Studente Informatica\n2 - Studente Linguistico");
                    int tipoStudente = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Come si chiama?");
                    String nomeStudente = scanner.nextLine();
                    System.out.print("Quanti anni ha?");
                    int etaStudente = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Che classe frequenta?");
                    String classe = scanner.nextLine();

                    if (tipoStudente == 1) {
                        studenti.add(new StudenteInformatica(nomeStudente, etaStudente, classe));
                        System.out.println("Studente di Informatica creato.");
                    } 
                    else if (tipoStudente == 2) {
                        studenti.add(new StudenteScientifico(nomeStudente, etaStudente, classe));
                        System.out.println("Studente Scientifico creato.");
                    } 
                    else {
                        System.out.println("Scelta non valida.");
                    }
                    break;

                //Creazione docente
                case 2:
                    System.out.println("Che tipo di docente vuoi creare: 1 , 2 ?\n1 - Docente Matematica\n2 - Docente Informatica");
                    int tipoDocente = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Come si chiama?");
                    String nomeDocente = scanner.nextLine();
                    System.out.print("Quanti anni ha?");
                    int etaDocente = scan.nextInt();
                    scan.nextLine();

                    if (tipoDocente == 1) {
                        docenti.add(new DocenteMatematica(nomeDocente, etaDocente));
                        System.out.println("Docente di Matematica creato.");
                    } 
                    else if (tipoDocente == 2) {
                        docenti.add(new DocenteInformatica(nomeDocente, etaDocente));
                        System.out.println("Docente di Informatica creato.");
                    } 
                    else {
                        System.out.println("Scelta non valida.");
                    }
                    break;

                //Assegna studente a docente
                case 3:
                    if (studenti.isEmpty() || docenti.isEmpty()) {
                        System.out.println("Devi prima creare almeno uno studente e un docente.");
                        break;
                    }

                    System.out.println("Scegli studente:\n");
                    for (int i = 0; i < studenti.size(); i++) {
                        System.out.println(i + " - " + studenti.get(i).getNome());
                    }
                    int indiceStudente = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Scegli docente:");
                    for (int i = 0; i < docenti.size(); i++) {
                        System.out.println(i + " - " + docenti.get(i).getNome());
                    }
                    int indiceDocente = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceStudente >= 0 && indiceStudente < studenti.size() && indiceDocente >= 0 && indiceDocente < docenti.size()) {
                        docenti.get(indiceDocente).aggiungiStudente(studenti.get(indiceStudente));
                    } 
                    else {
                        System.out.println("Indice non valido.");
                    }
                    break;

                //Assegna voto a studente
                case 4:
                    if (studenti.isEmpty() || docenti.isEmpty()) {
                        System.out.println("Devi prima creare studenti e docenti.");
                        break;
                    }
                    System.out.println("Scegli docente che assegna il voto: \n");
                    for (int i = 0; i < docenti.size(); i++) {
                        System.out.println(i + " - " + docenti.get(i).getNome());
                    }
                    int docenteScelto = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Scegli studente:");
                    for (int i = 0; i < studenti.size(); i++) {
                        System.out.println(i + " - " + studenti.get(i).getNome() +
                                " (docente assegnato: " + studenti.get(i).getDocenteAssegnato() + ")");
                    }
                    int studenteScelto = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Inserisci voto: ");
                    int voto = scan.nextInt();
                    scan.nextLine();
                    if (docenteScelto >= 0 && docenteScelto < docenti.size() && studenteScelto >= 0 && studenteScelto < studenti.size()) {
                        docenti.get(docenteScelto).assegnaVoto(studenti.get(studenteScelto), voto);
                    } 
                    else {
                        System.out.println("Indice non valido.");
                    }
                    break;

                //Stampa voti per uno studente
                case 5:
                    if (studenti.isEmpty()) {
                        System.out.println("Nessuno studente presente.");
                        break;
                    }
                    System.out.println("Scegli studente di cui stampare i voti:\n");
                    for (int i = 0; i < studenti.size(); i++) {
                        System.out.println(i + " - " + studenti.get(i).getNome());
                    }
                    int indiceStampa = scan.nextInt();
                    scan.nextLine();
                    if (indiceStampa >= 0 && indiceStampa < studenti.size()) {
                        studenti.get(indiceStampa).stampaVoti();
                    } 
                    else {
                        System.out.println("Indice non valido.");
                    }
                    break;
                
                //Mostra studnti/docenti con ruolo
                case 6:
                    System.out.println("ECCO GLI STUDENTI:\n");
                    for (Studente studente : studenti) {
                        studente.descriviRuolo();
                    }
                    System.out.println("\n");
                    System.out.println("ECCO I DOCENTI:\n");
                    for (Docente docente : docenti) {
                        docente.descriviRuolo();
                    }
                    break;
                    
                //Registrazione docenti/studenti
                case 7:
                    System.out.println("REGISTRAZIONE:\n");
                    for (Studente studente : studenti) {
                        Registrabile r = studente;
                        System.out.print(studente.getNome() + ": ");
                        r.registrazione();
                    }
                    for (Docente docente : docenti) {
                        Registrabile r = docente;
                        System.out.print(docente.getNome() + ": ");
                        r.registrazione();
                    }
                    break;
                
                //Stampa tutti studenti associati ad un docente
                case 8:
                    if (docenti.isEmpty()) {
                        System.out.println("Nessun docente presente.");
                        break;
                    }
                    System.out.println("Scegli docente:\n");
                    for (int i = 0; i < docenti.size(); i++) {
                        System.out.println(i + " - " + docenti.get(i).getNome());
                    }
                    int indiceMostra = scan.nextInt();
                    scan.nextLine();
                    if (indiceMostra >= 0 && indiceMostra < docenti.size()) {
                        docenti.get(indiceMostra).mostraStudenti();
                    } 
                    else {
                        System.out.println("Indice non valido.");
                    }
                    break;
                
                //Uscita
                case 0:
                    System.out.println("Uscita dal programma.");
                    break;
                
                //Errore input dell'utente
                default:
                    System.out.println("Scelta non valida.");
            }

            //Condizione del do-while
        } while (scelta != 0);

        //Chiudo scanner
        scanner.close();
        scan.close();
    }
}