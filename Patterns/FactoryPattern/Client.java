package Patterns.FactoryPattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is a client");

        NotificationFactory nf = new EmailFactory();
        nf.createNotification();
        NotificationFactory nfac = new SMSFactory();
        nfac.createNotification();
    }
}
