public class Maino {

    public static void main(String[] args) {

        //Inizializzazione
        Reception reception = new Reception();
        Hotel hotel1 = new Hotel("Hotel Paradise");
        Hotel hotel2 = new Hotel("Hotel Luxury");
        Camera c1 = new Camera(101, 80.0f);
        Camera c2 = new Camera(102, 90.0f);
        Suite s1 = new Suite(201, 150.0f, "Spa, Jacuzzi");
        Camera c3 = new Camera(301, 70.0f);
        Suite s2 = new Suite(401, 200.0f, "Vista mare, Colazione inclusa");
        Suite s3 = new Suite(402, 250.0f, "Piscina privata, Sauna");
        hotel1.aggiungiCamera(c1);
        hotel1.aggiungiCamera(c2);
        hotel1.aggiungiCamera(s1);
        hotel2.aggiungiCamera(c3);
        hotel2.aggiungiCamera(s2);
        hotel2.aggiungiCamera(s3);
        reception.aggiungiHotel(hotel1);
        reception.aggiungiHotel(hotel2);

        //Stampa hotel + camere
        System.out.println("Ecco gli Hotel");
        reception.stampaHotel();

        //Conta suite
        System.out.println("\nSuite totali presenti in tutti gli hotel: " + reception.contaSuiteTotali());

        // Ricerca hotel per nome
        System.out.println("Cerca Hotel");
        Hotel hotelTrovato = reception.cercaHotel("Hotel Paradise");

        if (hotelTrovato != null) {
            System.out.println("Hotel trovato: " + hotelTrovato.getNome());
            for (Camera camera : hotelTrovato.getListaCamere()) {
                camera.dettagli();
            }
        } else {
            System.out.println("Hotel non trovato.");
        }
    }
}