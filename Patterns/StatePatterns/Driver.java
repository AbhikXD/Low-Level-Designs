public class Driver {
    public static void main(String[] args) {
        Laptop acerPredatorHelios = new Laptop(); 

        System.out.println("--- Action: Press Power Button ---");
        System.out.println(acerPredatorHelios.pressPowerButton());
        
        System.out.println("\n--- Action: Press Power Button Again ---");
        // State has changed, so the behavior of this button press changes
        System.out.println(acerPredatorHelios.pressPowerButton());

        System.out.println("\n--- Action: Close Lid ---");
        System.out.println(acerPredatorHelios.closeLid());
    }
}