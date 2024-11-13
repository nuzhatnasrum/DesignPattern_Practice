package chainofresponsibilty;

public class BankSystem {
    public static void main(String[] args) {
        // Set up the chain of responsibility
        Approver teller = new Teller();
        Approver branchManager = new BranchManager();
        Approver regionalManager = new RegionManager();

        teller.setNextApprover(branchManager);
        branchManager.setNextApprover(regionalManager);

        // Test the chain with various withdrawal amounts
        teller.approveRequest(100);    // Teller will approve
        teller.approveRequest(1500);   // Branch Manager will approve
        teller.approveRequest(6000);   // Regional Manager will approve
    }
}
