package Factory;

public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = PizzaFactory.createPizza("cheese");
        cheesePizza.prepare(); // Output: Preparing Cheese Pizza

        Pizza pepperoniPizza = PizzaFactory.createPizza("pepperoni");
        pepperoniPizza.prepare(); // Output: Preparing Pepperoni Pizza

        Pizza veggiePizza = PizzaFactory.createPizza("veggie");
        veggiePizza.prepare(); // Output: Preparing Veggie Pizza
    }
}
