package Singleton;

public class Main {
    public static void main(String[] args) {
        // Trying to get two instances of DatabaseConnection
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // Both variables should point to the same instance
        System.out.println(connection1 == connection2); // Output: true

        // Using the singleton instance
        connection1.connect(); // Output: Connected to the database.
    }
}
