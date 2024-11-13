package prototype;

class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        // Creating a copy of the current Circle object
        return new Circle(this.radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}
