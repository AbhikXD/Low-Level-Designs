package Patterns.FactoryPattern;

public class SMSNotification implements Notification{

    @Override
    public void sendNotification(String receiverAddress, String payLoad) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'sendNotification'");
        System.out.println("Sending notification " +payLoad + " to " +receiverAddress);
    }

}
