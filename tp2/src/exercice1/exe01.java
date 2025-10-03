package exercice1;

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();
        int[] t = new int[n];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        int result = lis(t, n);

        System.out.println("Longueur de la plus longue sous-suite croissante = " + result);

       
    }

    public static int lis(int[] t, int n) {
        int[] dp = new int[n];
        int max = 1;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

       for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (t[i] > t[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        return max;
    }
}