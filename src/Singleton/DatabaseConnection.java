package Singleton;

public class DatabaseConnection {
    // Step 1: Create a private static instance of the class
    private static DatabaseConnection instance;

    // Step 2: Make the constructor private to prevent instantiation
    private DatabaseConnection() {
        System.out.println("Database Connection established.");
    }

    // Step 3: Provide a public static method to get the instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection(); // Lazy instantiation
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void connect() {
        System.out.println("Connected to the database.");
    }
}
