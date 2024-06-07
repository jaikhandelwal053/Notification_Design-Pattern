package notification;

public class SMSNotificationStrategy implements NotificationStrategy {
    private final NotificationChannel smsChannel;

    public SMSNotificationStrategy() {
        this.smsChannel = NotificationChannelFactory.createNotificationChannel("SMS");
    }

    @Override
    public void execute(String subject, String message) {
        smsChannel.sendNotification(subject, message);
    }

}
