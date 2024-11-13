package prototype;

class Rectangle implements Shape {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        // Creating a copy of the current Rectangle object
        return new Rectangle(this.width, this.height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + ", height: " + height);
    }
}

