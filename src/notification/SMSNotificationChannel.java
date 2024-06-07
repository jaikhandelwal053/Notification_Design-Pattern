package notification;

public class SMSNotificationChannel implements NotificationChannel{
	@Override
    public void sendNotification(String subject, String message) {
        // Implementation of sending SMS notification
        System.out.println("Sending SMS notification with subject: " + subject + ", message: " + message);
    }
}
