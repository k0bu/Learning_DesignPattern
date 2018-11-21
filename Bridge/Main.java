/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello World.") );
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello World Second") );
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello World Third") );

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}