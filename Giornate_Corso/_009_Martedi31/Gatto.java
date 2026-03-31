public class Gatto extends Animale{
    
    //Costruttore
    public Gatto(String nome, int eta) {
        super(nome, eta);
    }

    //Override di stampaverso
    @Override
    public void stampaVerso(){
        System.out.println("Miao");
    }

    @Override
    public String toString() {
        return "Gatto:\nnome - " + getNome() + ", eta - " + getEta();
    }
    
}
