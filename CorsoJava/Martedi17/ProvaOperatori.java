public class ProvaOperatori {
    public static void main(String[] args) {
        /*
        Operatori aritmetici:
        Gli operatori aritmetici vengono utilizzati per eseguire operazioni matematiche
        +   (Addizione)        → Somma due valori                →  x + y
        -   (Sottrazione)      → Sottrae un valore da un altro   →  x - y
        *   (Moltiplicazione)  → Moltiplica due valori           →  x * y
        /   (Divisione)        → Divide un valore per un altro   →  x / y
        %   (Modulo)           → Resto della divisione           →  x % y
        ++  (Incremento)       → Aumenta di 1                    →  ++x
        --  (Decremento)       → Diminuisce di 1                 →  --x
        Incremento e Decremento hanno una differenza (nella riga in cui vengono scritti) in 
        base a come vengono scritti (x++ e ++x). Esempio :
        int x = 10;
        sout(x++);
        int x = 10;
        sout(++x);
        il primo stampa 10 mentre il secondo 11 perché stampa 10 e poi esegue l'operazione
        mentre il secondo fa l'operazione e poi stampa 11

        Operatori di assegnamento: 
        Gli operatori di assegnazione vengono utilizzati per assegnare valori alle variabili.
        - Uguale          =
        - Più uguale     +=
        - Meno uguale    -=
        - Per uguale     *=
        - Diviso uguale  /=

        Operatori di confronto:
        Gli operatori di confronto in Java servono per confrontare due valori e restituiscono 
        sempre un risultato booleano.
        ==  (Equal to)                   → Uguale a                      →   x == y
        !=  (Not equal)                  → Diverso da                    →   x != y
        >   (Greater than)               → Maggiore di                   →   x > y
        <   (Less than)                  → Minore di                     →   x < y
        >=  (Greater than or equal to)   → Maggiore o uguale             →   x >= y
        <=  (Less than or equal to)      → Minore o uguale               →   x <= y

        Operatori logici:
        Gli operatori logici in Java servono per combinare o modificare condizioni
        - OR             ||
        - AND            &&
        - NOT            !
        - XOR            ^
        - AND bitwise    &

        Operatori bit a bit
        */

        //Somma di interi
        int sum1 = 100 + 50;

        //Somma di variabile e intero
        int sum2 = sum1 + 250;

        //Somma due variabili
        int sum3 = sum1 + sum2;

        System.out.println(sum3);

    }
}
