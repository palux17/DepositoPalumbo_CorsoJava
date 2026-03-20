public class EserciziFunzioni {

    /*
    Esercizio 1: Funzione Base
    Scrivi un metodo che calcola la somma di due numeri e restituisce il risultato.
    */
    public static float somma(float a, float b){
        return a+b;
    }

    /*
    Esercizio 2: Sfida sull'Overloading  (??)
    Crea due metodi multiply() sovraccaricati:
        Uno che accetta due interi.
        Uno che accetta tre numeri in virgola mobile (double).
    */
    public static int multiply(int a, int b){
        return a*b;
    }
    public static double multiply(double a, double b, double c){
        return a*b*c;
    }

    /*
    Esercizio 3: Ricorsione - Somma dei Numeri Naturali
    Scrivi una funzione ricorsiva che calcola la somma dei primi n numeri naturali.
     Esempio:
    sommaNaturali(5) → 5 + 4 + 3 + 2 + 1 = 15
    Formula matematica:
    S(n)=n+S(n−1)S(n) = n + S(n-1)S(n)=n+S(n−1)
    con caso base: S(1)=1S(1) = 1S(1)=1
    */
    public static int SommaNN(int n){
        if(n==1){
            return 1;
        }
        return n+SommaNN(n-1);
    }

    /* 
    Esercizio 4: Passaggio per Valore & Passaggio per Riferimento
    Crea un metodo che modifica una variabile primitiva.
    Crea un altro metodo che modifica un array.
    stampa variabili prima e dopo
    */
    public static void modificaPrimitivo(int x) {
        System.out.println("Prima: " + x);
        x = 0;
        System.out.println("Dopo: " + x);
    }
    public static void modificaPrimitivo(String x) {
        System.out.println("Prima: " + x);
        x = x.toUpperCase();
        System.out.println("Dopo: " + x);
    }
    public static void modificaPrimitivo(boolean x) {
        System.out.println("Prima: " + x);
        x = !x;
        System.out.println("Dopo: " + x);
    }
    public static void modificaArray(int[] arr) {
        System.out.println("Prima: ");
        for (int i : arr) {
            System.out.println("- " + i);
        }
        arr[0] = arr[0] + 10;
        System.out.println("Dopo: ");
        for (int i : arr) {
            System.out.println("- " + i);
        }
    }
}