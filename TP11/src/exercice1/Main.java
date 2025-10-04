package exercice1;
import java.io.IOException;

	public class Main {
	    public static void main(String[] args) {
	        try {
	            TextReader.readLines("input.txt");
	        } catch (IOException e) {
	            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
	        }
	    }
}
