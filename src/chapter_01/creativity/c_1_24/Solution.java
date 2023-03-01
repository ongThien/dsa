package chapter_01.creativity.c_1_24;

/*
Modify the CreditCard class from Code Fragment 1.5 so that printSummary be-
comes a nonstatic method, and modify the main method from Code Fragment 1.6
accordingly.
 */

public class Solution {

    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("John Bowman", "California Savings",
                "5391 0375 9387 5309", 5000);

        wallet[1] = new CreditCard("John Bowman", "California Federal",
                "3485 0399 3395 1954", 3500);

        wallet[2] = new CreditCard("John Bowman", "California Savings",
                "5391 0375 9387 5309", 2500, 300);


        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
//            System.out.println("wallet 1:" + wallet[0].charge(3 * val));
//            System.out.println("wallet 2:" + wallet[1].charge(2 * val));
//            System.out.println("wallet 3:" + wallet[2].charge(val));
        }

        for (CreditCard card : wallet) {
            card.printSummary();
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }
}

class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        this.customer = cust;
        this.bank = bk;
        this.account = acnt;
        this.limit = lim;
        this.balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    // update limit
    public void setLimit(int lim) {
        if (lim <= 0) {
            return;
        }

        this.limit = lim;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }

        balance += price;
        return true;
    }

    public boolean makePayment(double amount) {
        if (amount <= 0) {
            return false;
        }

        if (balance < amount) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public void printSummary() {
        System.out.println("Customer = " + this.customer);
        System.out.println("Bank = " + this.bank);
        System.out.println("Account = " + this.account);
        System.out.println("Balance = " + this.balance); // implicit cast
        System.out.println("Limit = " + this.limit); // implicit cast
    }
}
