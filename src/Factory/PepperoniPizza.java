package Factory;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza");
    }
}