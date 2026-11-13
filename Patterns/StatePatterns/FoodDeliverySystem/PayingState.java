package FoodDeliverySystem;

public class PayingState implements State{
    Order order;

    public PayingState(Order order){
        this.order = order;
    }
    @Override
    public String findFood() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findFood'");
    }

    @Override
    public String addingTocart() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addingTocart'");
        order.addingCart();;
        return "Added to Cart";
    }

    @Override
    public String paying() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'paying'");
        order.paymentHandle();;
        order.setState(new DeliveryState(order));
        System.out.println("Paid. . . Delivering at :  BKC, Bhawan, Kolkata,West Bengal");
        return "";
    }

    @Override
    public String delivering() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delivering'");
    }

}
