package decorator;

// Decorator Class
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation(); // Delegate to the wrapped component
    }
}
