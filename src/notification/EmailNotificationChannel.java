package notification;

public class EmailNotificationChannel implements NotificationChannel{
	  @Override
	    public void sendNotification(String subject, String message) {
	        // Implementation of sending email notification
	        System.out.println("Sending email notification with subject: " + subject + ", message: " + message);
	    }
}
