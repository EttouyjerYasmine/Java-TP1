package exercice4;

public class Livre extends Document {
    private String auteur;

    public Livre(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre #" + getNumEnreg() + " : " + getTitre() + " — Auteur = " + auteur;
    }
}

