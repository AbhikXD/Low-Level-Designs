package FoodDeliverySystem;

//Context Class
public class Order {
    private State currState;
    private final State payingState;
    private final State orderingState;
    private final State deliveryState;

    public Order(){
        this.orderingState = new OrderingState(this);
        this.payingState = new PayingState(this);
        this.deliveryState = new DeliveryState(this);
        this.currState = orderingState;
    }
    public void setState(State state){
        this.currState = state;
    }
    
    public String selectFood(){
        return currState.findFood();
    }
    public String addToCart(){
        currState.addingTocart();
       return  currState.paying();
    }
    public String placeOrder(){
        return currState.delivering();
    }

    public void searchFood(){
        System.out.println("Searching for Food . . .. . ");
    }
    public void addingCart(){
        System.out.println("Adding to cart . . . .. ");
    }
    public void paymentHandle(){
        System.out.println("Paying .. . . . ");
    }
    public void orderAccepted(){
        System.out.println("Order Accepted . . . . ");
    }

}
