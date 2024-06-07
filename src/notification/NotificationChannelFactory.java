package notification;

public class NotificationChannelFactory {
    public static NotificationChannel createNotificationChannel(String channelType) {
        if (channelType.equalsIgnoreCase("Email")) {
            return new EmailNotificationChannel();
        } else if (channelType.equalsIgnoreCase("SMS")) {
            return new SMSNotificationChannel();
        }
        throw new IllegalArgumentException("Invalid channel type");
    }
}

