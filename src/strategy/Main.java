package strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(250.00);

        // Pay with PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(120.00);

        // Pay with Google Pay
        cart.setPaymentStrategy(new GooglePayPayment("+123456789"));
        cart.checkout(75.00);
    }
}
