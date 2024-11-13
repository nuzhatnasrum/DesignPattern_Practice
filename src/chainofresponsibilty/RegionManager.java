package chainofresponsibilty;

public class RegionManager extends Approver {
    public void approveRequest(double amount) {
        System.out.println("Regional Manager approved the withdrawal of $" + amount);
    }
}
