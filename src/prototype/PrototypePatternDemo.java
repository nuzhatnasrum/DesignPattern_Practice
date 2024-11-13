package prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Create original objects
        Circle originalCircle = new Circle(5);
        Rectangle originalRectangle = new Rectangle(10, 20);

        // Clone the objects
        Shape clonedCircle = originalCircle.clone();
        Shape clonedRectangle = originalRectangle.clone();

        // Use the cloned objects
        clonedCircle.draw();   // Output: Drawing a Circle with radius: 5
        clonedRectangle.draw(); // Output: Drawing a Rectangle with width: 10, height: 20
    }
}
