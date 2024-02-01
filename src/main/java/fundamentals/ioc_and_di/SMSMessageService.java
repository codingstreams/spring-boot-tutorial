package fundamentals.ioc_and_di;

public class SMSMessageService implements MessageService{
  @Override
  public void sendMessage(String message) {
    System.out.println("Sending message via SMS: " + message);
  }
}
