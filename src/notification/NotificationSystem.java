package notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationSystem {
    private static NotificationSystem instance;
    private List<Subscriber> subscribers;

    private NotificationSystem() {
        subscribers = new ArrayList<>();
    }

    public static synchronized NotificationSystem getInstance() {
        if (instance == null) {
            instance = new NotificationSystem();
        }
        return instance;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void sendNotification(String channelType, String subject, String message) {
        NotificationStrategy strategy;
        if (channelType.equalsIgnoreCase("Email")) {
            strategy = new EmailNotificationStrategy();
        } else if (channelType.equalsIgnoreCase("SMS")) {
            strategy = new SMSNotificationStrategy();
        } else {
            throw new IllegalArgumentException("Invalid channel type");
        }
        strategy.execute(subject, message);
        notifySubscribers(subject, message);
    }

    private void notifySubscribers(String subject, String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(subject, message);
        }
    }
}