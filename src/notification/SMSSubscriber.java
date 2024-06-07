package notification;

public class SMSSubscriber implements Subscriber {
    private final String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String subject, String message) {
        // Implement SMS sending to the subscriber
        System.out.println("SMS Sent to " + phoneNumber );
        System.out.println("subject: " + subject );
        System.out.println("message: " + message);
    }
}
