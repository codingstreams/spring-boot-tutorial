package fundamentals.ioc_and_di;

/*
-> Inversion of Control (IoC): In traditional programming, the program's code determines the flow of control. In contrast, IoC is a design principle where the control of object creation and lifecycle is inverted or moved outside the class. Instead of a class creating its dependencies directly, it relies on an external entity to provide those dependencies.

-> Dependency Injection (DI): DI is a specific implementation of the IoC. It’s a design pattern where a class receives its dependencies from an external source rather than creating them itself. These dependencies are “injected” into the class via constructor injection, setter injection, or interface injection.
*/

public class IocAndDiExample {
  public static void main(String[] args) {
    var emailMessageService = new EmailMessageService();
    var mobilePhone = new MobilePhone(emailMessageService);

    mobilePhone.sendMessage("Hello World");
  }
}
