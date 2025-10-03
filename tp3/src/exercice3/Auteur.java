package exercice3;

import java.util.ArrayList;
import java.util.List;


public class Auteur {
    private static int compteur = 0; // compteur global
    private final int id;            // identifiant unique
    private String nom;
    private List<Livre> livres = new ArrayList<>();

    // ---- CONSTRUCTEUR ----
    public Auteur(String nom) {
        this.id = ++compteur;
        this.nom = nom;
    }

    // ---- GETTERS ----
    public int getId() { return id; }
    public String getNom() { return nom; }
    public List<Livre> getLivres() { return livres; }

    // ---- Association ----
    public void ajouterLivre(Livre livre) {
        if (!livres.contains(livre)) {
            livres.add(livre);
        }
    }

    @Override
    public String toString() {
        return "Auteur[id=" + id +
               ", nom=" + nom +
               ", nbLivres=" + livres.size() +
               "]";
    }
}
