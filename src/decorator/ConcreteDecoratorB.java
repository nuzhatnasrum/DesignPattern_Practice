package decorator;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehaviorB(); // Adds different behavior
    }

    private void addedBehaviorB() {
        System.out.println("Additional behavior B.");
    }
}