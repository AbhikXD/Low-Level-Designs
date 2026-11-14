package Patterns.FactoryPattern;

public abstract class NotificationFactory {
    
    public abstract Notification createNotification();
    public void operations(){
        System.out.println("Inbuilt logic for Operations");
    }

    public void auditRecord(){
        System.out.println("Recording audit . . .");
    }
}
