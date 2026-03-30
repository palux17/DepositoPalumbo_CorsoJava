import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CercaFilmJDBC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/sakila";
        String user = "root";
        String password = "";

        System.out.print("Inserisci una stringa da cercare nel titolo: ");
        String datrovare = scanner.nextLine();

        String sql = """
                SELECT title, description, release_year
                FROM film
                WHERE title LIKE ?
                ORDER BY title
                """;

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, "%" + datrovare + "%");

            ResultSet rs = pstmt.executeQuery();

            boolean trovato = false;

            while (rs.next()) {
                String titolo = rs.getString("title");
                String descrizione = rs.getString("description");
                int anno = rs.getInt("release_year");

                System.out.println("\nTitolo: " + titolo + "\nDescrizione: " + descrizione + "\nAnno di rilascio: " + anno);
                trovato = true;
            }

            if (!trovato) {
                System.out.println("Nessun film trovato.");
            }

            rs.close();

        } catch (Exception e) {
            System.out.println("Errore durante la connessione o la query.");
            e.printStackTrace();
        }

        scanner.close();
    }
}