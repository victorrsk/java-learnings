package poo.inheritance;

public class CorporativeAccount extends Account{
    private Integer attribute;

    public CorporativeAccount() {

    }

    public CorporativeAccount(Double balance, String bearer, Integer attribute) {
        super(balance, bearer);
        this.attribute = attribute;
    }

    @Override
    public void printMsg() {
        System.out.println("Only in subclass");
    }

    @Override
    public void withdraw(Double value) {
        this.balance -=  + 5;
    }
}
