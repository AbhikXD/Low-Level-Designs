package FoodDeliverySystem;

public class DeliveryState implements State {
    Order order;
    public DeliveryState(Order order){
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
        throw new UnsupportedOperationException("Unimplemented method 'addingTocart'");
    }

    @Override
    public String paying() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'paying'");
    }

    @Override
    public String delivering() {
        // TODO Auto-generated method stub
        order.orderAccepted();
        order.setState(new OrderingState(order));
        return "Order will be delivered soon";
    }
    
}
