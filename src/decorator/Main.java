package decorator;

public class Main {
    public static void main(String[] args) {
        Component baseComponent = new ConcreteComponent();

        // Add first decorator
        Component decoratedA = new ConcreteDecoratorA(baseComponent);

        // Add second decorator
        Component decoratedB = new ConcreteDecoratorB(decoratedA);

        // Execute the operation with all decorations applied
        decoratedB.operation();
    }
}
