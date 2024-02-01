package fundamentals.ioc_and_di;

public class EmailMessageService implements MessageService{
  @Override
  public void sendMessage(String message) {
    System.out.println("Sending message via email: " + message);
  }
}
