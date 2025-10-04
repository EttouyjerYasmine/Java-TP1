package exercice3;

import exercice3.Personne;

	 /**
	  * Développeur avec prime de 10%.
	  */
	public class Developpeur extends Personne {
	    public Developpeur(String nom, double salaireBase) {
	        super(nom, salaireBase);
	    }

	    @Override
	    public double calculerSalaire() {
	        return salaireBase * 1.10;  // +10%
	    }
	}

