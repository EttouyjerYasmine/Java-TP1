package exercice2;

public class TestTripletH {
	public static void main(String[] args) {
        // Triplet hétérogène : Integer, String, Double
        TripletH<Integer,String,Double> th =
            new TripletH<>(42, "Answer", 3.14);
        th.affiche();  // affiche [42, Answer, 3.14]

        // Exemple avec des objets métiers
        TripletH<String, Integer, Boolean> th2 =
            new TripletH<>("Alice", 30, true);
        th2.affiche();
    }
}
