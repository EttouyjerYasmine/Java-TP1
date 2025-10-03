package exercice7;
import java.util.Scanner;
public class exe07 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        System.out.print("Entrez la taille du tableau : ");
	        int n = sc.nextInt();
	        int[] t = new int[n];

	        System.out.println("Entrez les éléments du tableau : ");
	        for (int i = 0; i < n; i++) {
	            t[i] = sc.nextInt();
	        }

	        int majoritaire = trouverMajoritaire(t);

	        if (majoritaire != -1) {
	            System.out.println("L’élément majoritaire est : " + majoritaire);
	        } else {
	            System.out.println("Aucun élément majoritaire trouvé.");
	        }

	        sc.close();
	    }

	    public static int trouverMajoritaire(int[] t) {
	        
	        int candidat = t[0];
	        int compteur = 1;

	        for (int i = 1; i < t.length; i++) {
	            if (t[i] == candidat) {
	                compteur++;
	            } else {
	                compteur--;
	                if (compteur == 0) {
	                    candidat = t[i];
	                    compteur = 1;
	                }
	            }
	        }

	       
	        compteur = 0;
	        for (int val : t) {
	            if (val == candidat) compteur++;
	        }

	        if (compteur > t.length / 2) {
	            return candidat;
	        } else {
	            return -1; 
	        }
	    }
	}
