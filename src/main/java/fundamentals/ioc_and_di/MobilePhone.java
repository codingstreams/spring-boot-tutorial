package fundamentals.ioc_and_di;

public class MobilePhone {
  private MessageService messageService;

  // Constructor Injection
  public MobilePhone(MessageService messageService){
    this.messageService = messageService;
  }

  public void sendMessage(String message){
    this.messageService.sendMessage(message);
  }
}
