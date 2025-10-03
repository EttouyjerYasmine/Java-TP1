package exercice2;

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();
        int[] t = new int[n];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        
        trouverPivots(t, n);
    }
        public static void trouverPivots(int[] t, int n) {
            int[] maxGauche = new int[n];
            int[] minDroite = new int[n];

            // Max à gauche
            maxGauche[0] = t[0];
            for (int i = 1; i < n; i++) {
                maxGauche[i] = Math.max(maxGauche[i - 1], t[i]);
            }

            // Min à droite
            minDroite[n - 1] = t[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                minDroite[i] = Math.min(minDroite[i + 1], t[i]);
            }

            // Vérifier pivots
            System.out.print("Pivots : ");
            boolean trouve = false;
            for (int i = 0; i < n; i++) {
                if (maxGauche[i] == t[i] && minDroite[i] == t[i]) {
                    System.out.print(t[i] + " ");
                    trouve = true;
                }
            }

            if (!trouve) {
                System.out.println("Aucun pivot trouvé.");
            }
        }
    }
