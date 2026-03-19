public class EsercizioFunzione {

    //Funzione fattoriale
    public static int fattoriale(int n) {
    //Controllo che l'input sia corretto
        if (n < 0) {
            System.out.println("Numero non valido");
            return -1;
        }

        //Inizializzo risultato
        int risultato = 1;

        //Esecuzione fattoriale
        for (int i = 1; i <= n; i++) {
            risultato *= i;
        }
        return risultato;
    }

    //Caso input sbagliato
    public static void fattoriale(String s) {
        System.out.println("Inserisci un numero valido");
    }

    public static void main(String[] args) {
        System.out.println(fattoriale(5));
        fattoriale("ciao");
    }
}
