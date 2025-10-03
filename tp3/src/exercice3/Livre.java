package exercice3;

public class Livre {
    private static int compteur = 0;  // compteur global
    private final int id;             // identifiant unique
    private String titre;
    private Auteur auteur;

    // ---- CONSTRUCTEUR ----
    public Livre(String titre, Auteur auteur) {
        this.id = ++compteur;
        this.titre = titre;
        this.auteur = auteur;

        // Liaison bidirectionnelle : l'auteur connaît son livre
        auteur.ajouterLivre(this);
    }

    // ---- GETTERS ----
    public int getId() { return id; }
    public String getTitre() { return titre; }
    public Auteur getAuteur() { return auteur; }

    // ---- Affichage personnalisé ----
    @Override
    public String toString() {
        return "Livre[id=" + id +
               ", titre=" + titre +
               ", auteur=" + auteur.getNom() +
               "]";
    }
}
