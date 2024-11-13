package decorator;

// Concrete Component
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Executing base operation.");
    }
}

