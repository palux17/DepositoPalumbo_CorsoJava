public class Cucina {

    //Metodo prepara panino
    public void preparaPanino(Hamburger hamburger) {
        System.out.println("Ordine ricevuto: " + hamburger.getNome());
        hamburger.prepara();
    }
}