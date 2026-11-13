package FoodDeliverySystem;

public interface State {

    public String findFood();
    public String addingTocart();
    public String paying();
    public String delivering();

}
