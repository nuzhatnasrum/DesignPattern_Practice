package chainofresponsibilty;

public class Teller extends Approver {
    public void approveRequest(double amount) {
        if (amount <= 500) {
            System.out.println("Teller approved the withdrawal of $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}
