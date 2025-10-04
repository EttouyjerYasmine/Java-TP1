package exercice1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TextReader {

    public static void readLines(String path) throws IOException {
        // try-with-resources pour fermeture automatique
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
