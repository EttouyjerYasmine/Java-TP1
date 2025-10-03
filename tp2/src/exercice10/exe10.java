package exercice10;

import java.util.Scanner;

public class exe10 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = 3;
	        int[][] mat = new int[n][n];
	        System.out.println("Entrez les éléments de la matrice 3x3 :");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                mat[i][j] = sc.nextInt();
	            }
	        }

	        if (estMagique(mat)) {
	            System.out.println("✅ La matrice est magique.");
	        } else {
	            System.out.println("❌ La matrice n'est pas magique.");
	        }

	   
	    }

	    public static boolean estMagique(int[][] mat) {
	        int n = 3;
	        int sommeRef = 0;

	        
	        for (int j = 0; j < n; j++) {
	            sommeRef += mat[0][j];
	        }

	       
	        for (int i = 1; i < n; i++) {
	            int sommeLigne = 0;
	            for (int j = 0; j < n; j++) {
	                sommeLigne += mat[i][j];
	            }
	            if (sommeLigne != sommeRef) return false;
	        }

	    
	        for (int j = 0; j < n; j++) {
	            int sommeCol = 0;
	            for (int i = 0; i < n; i++) {
	                sommeCol += mat[i][j];
	            }
	            if (sommeCol != sommeRef) return false;
	        }

	      
	        int sommeDiag1 = mat[0][0] + mat[1][1] + mat[2][2];
	        if (sommeDiag1 != sommeRef) return false;

	        
	        int sommeDiag2 = mat[0][2] + mat[1][1] + mat[2][0];
	        if (sommeDiag2 != sommeRef) return false;

	        return true;
	    }
	}

