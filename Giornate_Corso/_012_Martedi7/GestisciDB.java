import java.sql.*;

public class GestisciDB {

    //Attributi
    //Creazione Singleton
    private static GestisciDB instance;
    private Connection conn;
    private int connectionCount = 0;

    //Connessione DB
    private final String URL = "jdbc:mysql://localhost:3306/test_singleton";
    private final String USER = "root";
    private final String PASSWORD = "";

    //Costrutttore privato singleton
    private GestisciDB() {
        connect();
    }

    //Creazione istanza database
    public static GestisciDB getInstance() {
        if (instance == null) {
            instance = new GestisciDB();
        }
        return instance;
    }

    //Stampo connessione riuscita al DB
    public void connect() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                connectionCount++;
                System.out.println("Connessione stabilita con successo!\nNumero connessioni: " + connectionCount);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Ritorno numero connessioni
    public int getConnectionCount() {
        return connectionCount;
    }

    //Salvo dato nel DB
    public void salvaDato(String valore) {
        String query = "INSERT INTO dati (valore) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, valore);
            stmt.executeUpdate();
            System.out.println("Dato salvato nel DB!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Leggo dati nel DB
    public void mostraDati() {
        String query = "SELECT * FROM dati";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " ---> " + rs.getString("valore"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}