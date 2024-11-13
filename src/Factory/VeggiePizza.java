package Factory;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza");
    }
}
