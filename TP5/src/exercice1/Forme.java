package exercice1;

public class Forme {
	/**
	 * Super-classe représentant une forme géométrique.
	 */
	    protected String couleur;

	    public Forme(String couleur) {
	        this.couleur = couleur;
	    }

	    /**
	     * Méthode de dessin générique.  
	     * Peut être redéfinie par chaque sous-classe.
	     */
	    public void dessiner() {
	        System.out.println("Dessiner une forme de couleur " + couleur);
	    }
	}

