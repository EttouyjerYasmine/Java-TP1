package exercice3;

public class InvalidUserException extends Exception {
    /**
     * Construire l’exception avec un message explicite.
     * @param message description de l'erreur de validation
     */
    public InvalidUserException(String message) {
        super(message);
    }
}
