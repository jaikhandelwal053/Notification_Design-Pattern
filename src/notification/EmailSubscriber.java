package notification;

public class EmailSubscriber implements Subscriber {
    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String subject, String message) {
        // Implement email sending to the subscriber
    	System.out.println("Email Sent to " + email );
        System.out.println("subject: " + subject );
        System.out.println("message: " + message);
    }
}