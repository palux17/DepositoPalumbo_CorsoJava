import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    //Connessione + costruttore PRIVATO
    private static DBConnection instance;
    private Connection connection;
    private final String URL = "jdbc:mysql://localhost:3306/magazzino_db";
    private final String USER = "root";
    private final String PASSWORD = "";
    private DBConnection() {
        connect();
    }

    //Singleton per un'unica connessionee
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    //Stabilisce la connessione al database
    private void connect() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connessione al database avvenuta con successo.");
        } catch (SQLException e) {
            System.out.println("Errore di connessione al database.");
            e.printStackTrace();
        }
    }

    //Restituisce connessione attiva
    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}