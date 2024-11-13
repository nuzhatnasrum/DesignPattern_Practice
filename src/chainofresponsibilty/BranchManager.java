package chainofresponsibilty;

public class BranchManager extends Approver {
    public void approveRequest(double amount) {
        if (amount <= 5000) {
            System.out.println("Branch Manager approved the withdrawal of $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}

