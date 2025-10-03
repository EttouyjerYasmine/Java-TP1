package exercice3;

import java.util.HashSet;
import java.util.Set;

public class Bibliotheque {
    private static int compteur = 0;     // compteur global
    private final int id;                // identifiant unique
    private String nom;
    private Set<Livre> collection;       // ensemble de livres

    // ---- CONSTRUCTEUR ----
    public Bibliotheque(String nom) {
        this.id = ++compteur;
        this.nom = nom;
        this.collection = new HashSet<>();
    }

    // ---- GETTERS ----
    public int getId() { return id; }
    public String getNom() { return nom; }
    public Set<Livre> getCollection() { return collection; }

    // ---- Ajouter un livre ----
    public void ajouterLivre(Livre livre) {
        collection.add(livre); // HashSet évite automatiquement les doublons
    }

    // ---- Affichage personnalisé ----
    @Override
    public String toString() {
        return "Bibliotheque[id=" + id +
               ", nom=" + nom +
               ", nbLivres=" + collection.size() +
               "]";
    }

    // ---- Méthode d’affichage des livres ----
    public void afficherLivres() {
        System.out.println("Livres dans la bibliothèque " + nom + " :");
        for (Livre l : collection) {
            System.out.println("  • " + l.getTitre() + " (Auteur : " + l.getAuteur().getNom() + ")");
        }
    }
}
