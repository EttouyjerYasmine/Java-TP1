package exercice8;

import java.util.Scanner;

public class exe08 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Entrez la taille du tableau : ");
	        int n = sc.nextInt();
	        int[] t = new int[n];

	        System.out.println("Entrez les éléments du tableau (entre 1 et " + n + ") : ");
	        for (int i = 0; i < n; i++) {
	            t[i] = sc.nextInt();
	        }

	        
	        afficherNombresAbsents(t, n);

	        sc.close();
	    }

	    public static void afficherNombresAbsents(int[] t, int n) {
	        boolean[] present = new boolean[n + 1];
	        for (int val : t) {
	            if (val >= 1 && val <= n) {
	                present[val] = true;
	            }
	        }

	       
	        System.out.print("Éléments manquants : ");
	        boolean aucunManquant = true;
	        for (int i = 1; i <= n; i++) {
	            if (!present[i]) {
	                System.out.print(i + " ");
	                aucunManquant = false;
	            }
	        }

	        if (aucunManquant) {
	            System.out.println("Aucun élément manquant.");
	        } else {
	            System.out.println();
	        }
	    }
	}

