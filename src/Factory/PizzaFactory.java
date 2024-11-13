package Factory;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new VeggiePizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
