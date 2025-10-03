package exercice4;

import java.util.Scanner;
import java.util.Stack;

public class exe4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lecture de la matrice
        System.out.print("Entrez le nombre de lignes : ");
        int n = sc.nextInt();
        System.out.print("Entrez le nombre de colonnes : ");
        int m = sc.nextInt();

        int[][] matrice = new int[n][m];
        System.out.println("Entrez les éléments de la matrice (0 ou 1) : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrice[i][j] = sc.nextInt();
            }
        }

        // Calcul du plus grand rectangle de 1
        int maxAire = 0;
        int[] hauteurs = new int[m];

        for (int i = 0; i < n; i++) {
            // Construire l'histogramme ligne par ligne
            for (int j = 0; j < m; j++) {
                if (matrice[i][j] == 0) {
                    hauteurs[j] = 0;
                } else {
                    hauteurs[j] += 1;
                }
            }

            // Calcul de l'aire max dans cet histogramme
            maxAire = Math.max(maxAire, plusGrandRectangleHistogramme(hauteurs));
        }

        System.out.println("Aire du plus grand rectangle de 1 = " + maxAire);

        sc.close();
    }

    // Fonction pour trouver le plus grand rectangle dans un histogramme
    public static int plusGrandRectangleHistogramme(int[] hauteurs) {
        Stack<Integer> pile = new Stack<>();
        int maxAire = 0;
        int i = 0;

        while (i < hauteurs.length) {
            if (pile.isEmpty() || hauteurs[i] >= hauteurs[pile.peek()]) {
                pile.push(i++);
            } else {
                int sommet = pile.pop();
                int largeur = pile.isEmpty() ? i : i - pile.peek() - 1;
                maxAire = Math.max(maxAire, hauteurs[sommet] * largeur);
            }
        }

        while (!pile.isEmpty()) {
            int sommet = pile.pop();
            int largeur = pile.isEmpty() ? i : i - pile.peek() - 1;
            maxAire = Math.max(maxAire, hauteurs[sommet] * largeur);
        }

        return maxAire;
    }
}
