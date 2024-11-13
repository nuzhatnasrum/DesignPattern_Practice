package chainofresponsibilty;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    public abstract void approveRequest(double amount);
}

