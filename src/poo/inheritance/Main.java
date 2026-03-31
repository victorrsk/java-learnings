package poo.inheritance;

public class Main {
    public static void main(String[] args) {
        CorporativeAccount corpAcc = new CorporativeAccount();
        CorporativeAccount corp = new CorporativeAccount(10.0, "john", 0);

        System.out.println(corp.getBalance());

        // Upcasting

        Account acc = new CorporativeAccount();
        acc.printMsg();

        // Downcasting

        CorporativeAccount corpAcc2 = (CorporativeAccount) acc;

    }
}
