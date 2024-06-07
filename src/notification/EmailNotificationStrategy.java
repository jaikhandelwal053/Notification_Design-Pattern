package notification;

public class EmailNotificationStrategy implements NotificationStrategy {
	    private final NotificationChannel emailChannel;

	    public EmailNotificationStrategy() {
	        this.emailChannel = NotificationChannelFactory.createNotificationChannel("Email");
	    }

	    @Override
	    public void execute(String subject, String message) {
	        emailChannel.sendNotification(subject, message);
	    }
}
