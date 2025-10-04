package exercice4;

public class Bibliotheque {
    private Document[] documents;
    private int nbDocs;

    public Bibliotheque(int capacite) {
        documents = new Document[capacite];
        nbDocs = 0;
    }

    public void afficherDocuments() {
        if (nbDocs == 0) {
            System.out.println("Aucun document dans la bibliothèque.");
            return;
        }
        for (int i = 0; i < nbDocs; i++) {
            System.out.println(documents[i]);
        }
    }

    public boolean ajouter(Document doc) {
        if (nbDocs < documents.length) {
            documents[nbDocs++] = doc;
            return true;
        }
        return false;
    }

    public boolean supprimer(Document doc) {
        for (int i = 0; i < nbDocs; i++) {
            if (documents[i].equals(doc)) {
                // Décalage
                for (int j = i; j < nbDocs - 1; j++) {
                    documents[j] = documents[j + 1];
                }
                documents[--nbDocs] = null;
                return true;
            }
        }
        return false;
    }

    public Document document(int numEnreg) {
        for (int i = 0; i < nbDocs; i++) {
            if (documents[i].getNumEnreg() == numEnreg) {
                return documents[i];
            }
        }
        return null;
    }

    public void afficherAuteurs() {
        for (int i = 0; i < nbDocs; i++) {
            if (documents[i] instanceof Livre) {
                Livre livre = (Livre) documents[i];
                System.out.println("Auteur : " + livre.getAuteur());
            }
        }
    }

}
