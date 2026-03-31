import java.util.ArrayList;

public class Reception {

    // Lista di hotel
    private ArrayList<Hotel> listahotel;

    // Costruttore
    public Reception() {
        listahotel = new ArrayList<>();
    }

    //Aggiunge hotel
    public void aggiungiHotel(Hotel hotel) {
        listahotel.add(hotel);
    }

    //Stampare gli hotel con le loro camere
    public void stampaHotel() {
        for (Hotel hotel : listahotel) {
            System.out.println(hotel.getNome() + "\n");

            for (Camera camera : hotel.getListaCamere()) {
                camera.dettagli();
            }

            System.out.println("\n\n");
        }
    }

    //Contare suite negli hotel
    public int contaSuiteTotali() {
        int totale = 0;
        for (Hotel hotel : listahotel) {
            totale += Hotel.contaSuite(hotel.getListaCamere());
        }
        return totale;
    }

    //Cerca hotel
    public Hotel cercaHotel(String nome) {
        for (Hotel hotel : listahotel) {
            if (hotel.getNome().equalsIgnoreCase(nome)) {
                return hotel;
            }
        }
        return null;
    }
}