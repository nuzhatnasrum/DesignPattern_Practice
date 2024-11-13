package decorator;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehaviorA(); // Adds new behavior
    }

    private void addedBehaviorA() {
        System.out.println("Additional behavior A.");
    }
}
