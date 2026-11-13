package FoodDeliverySystem;
public class Driver{
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("----- Opened the App, and going through the menu ----");
        System.out.println(order.selectFood());

        System.out.println("-----Choose the food and added to the cart-----");
        System.out.println(order.addToCart());

        System.out.println("-------Placing the Order --------");
        System.out.println(order.placeOrder());
    }
}