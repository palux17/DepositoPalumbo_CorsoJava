public class DisplayMobile implements Display {

    @Override
    public void aggiorna(float temperatura) {
        System.out.println("La nuova temperatura è " + temperatura + "°C\n");
    }
}