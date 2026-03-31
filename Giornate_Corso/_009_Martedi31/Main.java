public class Main {
    public static void main(String[] args) {
        Animale a1 = new Cane("balto", 3);
        Animale a2 = new Gatto("Miu", 2);
        Animale a3 = new Gatto("garfield", 4);

        Zoo zoo = new Zoo();

        zoo.aggiungiAnimale(a1);
        zoo.aggiungiAnimale(a2);
        zoo.aggiungiAnimale(a3);

        zoo.stampaZoo();
    }
}
