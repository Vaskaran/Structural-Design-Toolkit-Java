package facade.demo2.external;

public class LinkedInApi {

    private static final int MAX_LENGTH = 3000;

    public void publishOnLinkedIn(String message) {
        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty.");
        }
        if (message.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("LinkedIn post exceeds 3000 characters.");
        }
        System.out.println("[LinkedIn]: " + message);
    }
}