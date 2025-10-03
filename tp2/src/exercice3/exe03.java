package exercice3;
import java.util.Scanner;
public class exe03 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Entrez la taille n de la matrice : ");
	        int n = sc.nextInt();

	        int[][] matrice = remplirSpirale(n);

	      
	        System.out.println("Matrice spirale :");
	        afficherMatrice(matrice);

	        sc.close();
	    }

	    
	    public static int[][] remplirSpirale(int n) {
	        int[][] mat = new int[n][n];
	        int haut = 0, bas = n - 1;
	        int gauche = 0, droite = n - 1;
	        int num = 1;

	        while (haut <= bas && gauche <= droite) {
	         
	            for (int j = gauche; j <= droite; j++) {
	                mat[haut][j] = num++;
	            }
	            haut++;

	          
	            for (int i = haut; i <= bas; i++) {
	                mat[i][droite] = num++;
	            }
	            droite--;

	           
	            if (haut <= bas) {
	                for (int j = droite; j >= gauche; j--) {
	                    mat[bas][j] = num++;
	                }
	                bas--;
	            }

	            
	            if (gauche <= droite) {
	                for (int i = bas; i >= haut; i--) {
	                    mat[i][gauche] = num++;
	                }
	                gauche++;
	            }
	        }
	        return mat;
	    }

	    
	    public static void afficherMatrice(int[][] mat) {
	        for (int[] ligne : mat) {
	            for (int val : ligne) {
	                System.out.printf("%3d ", val);
	            }
	            System.out.println();
	        }
	    }
	}


