package notification;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);

         System.out.print("Enter Channel Type (Email/SMS): ");
         String channelType = scanner.nextLine();

         System.out.print("Enter Subject: ");
         String subject = scanner.nextLine();

         System.out.print("Enter Message: ");
         String message = scanner.nextLine();


        // Create notification system instance
        NotificationSystem notificationSystem = NotificationSystem.getInstance();

        
        Subscriber subscriber;
        if (channelType.equalsIgnoreCase("Email")) {
            subscriber = new EmailSubscriber("user@example.com");
        } else if (channelType.equalsIgnoreCase("SMS")) {
            subscriber = new SMSSubscriber("6635367890");
        } else {
            System.out.println("Invalid channel type.");
            return;
        }

        notificationSystem.subscribe(subscriber);   

        notificationSystem.sendNotification(channelType, subject, message);

        notificationSystem.unsubscribe(subscriber);
        scanner.close();
    }
}

