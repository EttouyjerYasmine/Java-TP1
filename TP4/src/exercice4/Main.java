package exercice4;
import java.util.Scanner;
import exercice4.*;
public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Lire la capacité
	        System.out.print("Entrez la capacité de la bibliothèque : ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consommer \n

	        Bibliotheque biblio = new Bibliotheque(n);

	        // Ajouter 2 documents par défaut
	        biblio.ajouter(new Livre("Java pour les nuls", "Smith"));
	        biblio.ajouter(new Revue("Science et Vie", 42));

	        // Menu
	        int choix;
	        do {
	            System.out.println("\n=== Menu Bibliothèque ===");
	            System.out.println("1. Afficher les documents");
	            System.out.println("2. Ajouter un document");
	            System.out.println("3. Supprimer un document");
	            System.out.println("4. Rechercher un document par numéro");
	            System.out.println("5. Afficher les auteurs");
	            System.out.println("0. Quitter");
	            System.out.print("Votre choix : ");
	            choix = sc.nextInt();
	            sc.nextLine();

	            switch (choix) {
	                case 1:
	                    biblio.afficherDocuments();
	                    break;
	                case 2:
	                    System.out.print("Type (1= Livre, 2= Revue) : ");
	                    int type = sc.nextInt();
	                    sc.nextLine();

	                    if (type == 1) {
	                        System.out.print("Titre : ");
	                        String titre = sc.nextLine();
	                        System.out.print("Auteur : ");
	                        String auteur = sc.nextLine();
	                        biblio.ajouter(new Livre(titre, auteur));
	                    } else if (type == 2) {
	                        System.out.print("Titre : ");
	                        String titre = sc.nextLine();
	                        System.out.print("Numéro : ");
	                        int num = sc.nextInt();
	                        sc.nextLine();
	                        biblio.ajouter(new Revue(titre, num));
	                    }
	                    break;
	                case 3:
	                    System.out.print("Numéro d’enregistrement à supprimer : ");
	                    int numSup = sc.nextInt();
	                    Document d = biblio.document(numSup);
	                    if (d != null && biblio.supprimer(d)) {
	                        System.out.println("Document supprimé !");
	                    } else {
	                        System.out.println("Suppression impossible.");
	                    }
	                    break;
	                case 4:
	                    System.out.print("Numéro d’enregistrement : ");
	                    int numCherche = sc.nextInt();
	                    Document doc = biblio.document(numCherche);
	                    if (doc != null) {
	                        System.out.println("Trouvé : " + doc);
	                    } else {
	                        System.out.println("Aucun document trouvé.");
	                    }
	                    break;
	                case 5:
	                    biblio.afficherAuteurs();
	                    break;
	                case 0:
	                    System.out.println("Au revoir !");
	                    break;
	                default:
	                    System.out.println("Choix invalide !");
	            }
	        } while (choix != 0);

	        sc.close();
	    }
	}
