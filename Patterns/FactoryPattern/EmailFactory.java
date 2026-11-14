package Patterns.FactoryPattern;

public class EmailFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'createNotification'");
        Notification notify = new EmailNotification();
        notify.sendNotification("abhikhaza@gmail.com", "Hii");
        return notify;
    }

}
