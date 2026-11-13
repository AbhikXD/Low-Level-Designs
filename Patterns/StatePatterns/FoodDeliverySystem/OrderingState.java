package FoodDeliverySystem;

public class OrderingState implements State {
    Order order;
    public OrderingState(Order order){
        this.order  = order;
    }
    @Override
    public String findFood() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'findFood'");
        
       order.searchFood();
       order.setState(new PayingState(order));
        return "Food found . . . .. .";
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
        throw new UnsupportedOperationException("Unimplemented method 'delivering'");
    }

}
