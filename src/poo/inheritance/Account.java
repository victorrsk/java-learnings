package poo.inheritance;

public class Account {
    protected Double balance;
    protected String bearer;
    protected Integer attribute;

    public Account() {
    }

    public Account(Double balance, String bearer) {
        this.balance = balance;
        this.bearer = bearer;
    }

    public Double getBalance() {
        return balance;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public void printMsg() {
        System.out.println("Only in superclass");
    }

    public Integer getAttribute() {
        System.out.println("Superclass method...");
        return 0;

    }

    public void withdraw(Double value) {
        this.balance -= value;
    }
}
