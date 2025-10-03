package exercice6;

import java.util.Scanner;

public class exe06 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();
        int[] t = new int[n];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

      
        int resultat = kadane(t);

        System.out.println("Somme maximale d’un sous-tableau = " + resultat);

        
    }
    public static int kadane(int[] t) {
    int maxCourant = t[0];
    int maxGlobal = t[0];

    for (int i = 1; i < t.length; i++) {
        maxCourant = Math.max(t[i], maxCourant + t[i]);
        maxGlobal = Math.max(maxGlobal, maxCourant);
    }

    return maxGlobal;
}
}
