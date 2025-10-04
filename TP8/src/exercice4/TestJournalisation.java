package exercice4;
import java.io.FileWriter;
import java.io.IOException;

public class TestJournalisation {
	public static void main(String[] args) {
        try {
            // code pouvant provoquer une exception
            int resultat = 10 / 0;
        } catch (Exception e) {
            // écriture dans le fichier error.log
            try (FileWriter fw = new FileWriter("error.log", true)) { // true = append
                fw.write("Erreur : " + e.getMessage() + "\n");
            } catch (IOException ioEx) {
                ioEx.printStackTrace(); // en dernier recours si on ne peut pas écrire
            }
        }
    }
}
