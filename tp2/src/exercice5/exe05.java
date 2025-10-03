package exercice5;

import java.util.Scanner;

public class exe05 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Entrez la taille du tableau n : ");
	        int n = sc.nextInt();
	        int[] t = new int[n];

	        System.out.println("Entrez les éléments du tableau : ");
	        for (int i = 0; i < n; i++) {
	            t[i] = sc.nextInt();
	        }

	        
	        if (estPermutationCirculaire(t, n)) {
	            System.out.println("✅ Le tableau est une permutation circulaire valide.");
	        } else {
	            System.out.println("❌ Le tableau n'est PAS une permutation circulaire.");
	        }

	        sc.close();
	    }

	    public static boolean estPermutationCirculaire(int[] t, int n) {
	       
	        boolean[] vu = new boolean[n + 1];
	        for (int val : t) {
	            if (val < 1 || val > n || vu[val]) {
	                return false; 
	            }
	            vu[val] = true;
	        }

	      
	        int pos = -1;
	        for (int i = 0; i < n; i++) {
	            if (t[i] == 1) {
	                pos = i;
	                break;
	            }
	        }

	       
	        for (int k = 0; k < n; k++) {
	            if (t[(pos + k) % n] != k + 1) {
	                return false;
	            }
	        }

	        return true;
	    }
	}
