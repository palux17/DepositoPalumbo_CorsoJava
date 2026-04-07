import java.sql.*;
import java.util.ArrayList;

public class OrdineDAO {

    //Connessione al db
    private Connection connection;
    public OrdineDAO() {
        connection = DBConnection.getInstance().getConnection();
    }

    //Inserisce un nuovo ordine
    public void inserisciOrdine(Ordine ordine) {
        String query = "INSERT INTO ordini (cliente, prodotto, quantita, stato) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, ordine.getNomeCliente());
            pstmt.setString(2, ordine.getProdotto());
            pstmt.setInt(3, ordine.getQuantita());
            pstmt.setString(4, ordine.getStato());
            int righe = pstmt.executeUpdate();
            if (righe > 0) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    ordine.setId(rs.getInt(1));
                }
                System.out.println("Ordine inserito con successo.");
            }
        } catch (SQLException e) {
            // Gestione errore inserimento
            System.out.println("Errore durante l'inserimento dell'ordine.");
            e.printStackTrace();
        }
    }

    //Restituisce tutti gli ordini
    public ArrayList<Ordine> visualizzaTuttiGliOrdini() {
        ArrayList<Ordine> ordini = new ArrayList<>();
        String query = "SELECT * FROM ordini";
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Ordine ordine = new Ordine(
                    rs.getInt("id"),
                    rs.getString("cliente"),
                    rs.getString("prodotto"),
                    rs.getInt("quantita"),
                    rs.getString("stato")
                );
                ordini.add(ordine);
            }
        } catch (SQLException e) {
            // Gestione errore lettura
            System.out.println("Errore durante la lettura degli ordini.");
            e.printStackTrace();
        }
        return ordini;
    }

    //Cerca un ordine tramite ID
    public Ordine cercaOrdinePerId(int id) {
        String query = "SELECT * FROM ordini WHERE id = ?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Ordine(
                    rs.getInt("id"),
                    rs.getString("cliente"),
                    rs.getString("prodotto"),
                    rs.getInt("quantita"),
                    rs.getString("stato")
                );
            }
        } catch (SQLException e) {
            // Gestione errore ricerca
            System.out.println("Errore durante la ricerca dell'ordine.");
            e.printStackTrace();
        }
        return null; 
    }

    //Aggiorna lo stato di un ordine
    public void aggiornaStatoOrdine(int id, String nuovoStato) {
        String query = "UPDATE ordini SET stato = ? WHERE id = ?";
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, nuovoStato);
            pstmt.setInt(2, id);
            int righe = pstmt.executeUpdate();
            if (righe > 0) {
                System.out.println("Stato ordine aggiornato con successo.");
            } else {
                System.out.println("Nessun ordine trovato con ID " + id);
            }
        } catch (SQLException e) {
            System.out.println("Errore durante l'aggiornamento dello stato.");
            e.printStackTrace();
        }
    }
}