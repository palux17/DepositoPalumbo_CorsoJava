public class Cane extends Animale{

    //Costruttore
    public Cane(String nome, int eta) {
        super(nome, eta);
    }

    //Override di stampaverso
    @Override
    public void stampaVerso(){
        System.out.println("Bau");
    }

    @Override
    public String toString() {
        return "Cane:\nnome - " + getNome() + ", eta - " + getEta();
    }
    
    
}
