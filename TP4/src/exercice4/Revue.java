package exercice4;

public class Revue extends Document {
    private int numero;

    public Revue(String titre, int numero) {
        super(titre);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revue #" + getNumEnreg() + " : " + getTitre() + " — Numéro = " + numero;
    }
}

