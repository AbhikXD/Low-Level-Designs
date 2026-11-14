package Patterns.FactoryPattern;

public class SMSFactory extends NotificationFactory{

    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'createNotification'");
        Notification notify = new SMSNotification();
        notify.sendNotification("89067432573", "You plan validity has been expired");
        return notify;
    }

}
