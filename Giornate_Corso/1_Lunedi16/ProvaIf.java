public class ProvaIf {
    public static void main(String[] args) {

        int x = 1;
        //if rappresenta le condizioni. Dentro le parentesi tonde ci va una condizione boolean. Quando la condizione == true si
        // entra nel corpo dell'if sennò si va oltre
        if (x>18){
            System.out.println("x maggiore di 18");
        } 

        //Else if è un if che esclude altre condizioni (if e altri else if). Il suo funzionamento è praticamente uguale all'if
        //se non per esclusione di prima. Dopo un if ci posso essere infiniti elseif.
        else if (x<18){
            System.out.println("x minore di 18");
        }

        //Alla fine di tutte le condizioni ci sta un unico else che comprende tutte le altre condizioni.
        else{
            System.out.println("x uguale a 18");
        }
    }   
}
