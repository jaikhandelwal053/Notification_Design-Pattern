package notification;

public interface NotificationStrategy {
	void execute(String subject, String message);
}
