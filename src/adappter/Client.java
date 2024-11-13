package adappter;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee); // Adapter makes Adaptee compatible with Target

        adapter.request(); // Works with the Adaptee through the Target interface
    }
}

