// Definizione della classe Singleton
public class Singleton{
    
    //Istanza Singleton
    private static Singleton instance;

    // Costruttore privato per impedire l'istanziazione diretta
    private Singleton(){
    }

    //Ottengo l'unica istanza della classe sennò la creo
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //Metodo di esempio che può essere chiamato sull'istanza Singleton
    public void DoSomething(){
        System.out.println("Singleton: DoSomething() called");
    }
}
 