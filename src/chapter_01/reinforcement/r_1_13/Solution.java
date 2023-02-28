package chapter_01.reinforcement.r_1_13;

/*
Modify the declaration of the first for loop in the main method in Code Frag-
ment 1.6 so that its charges will cause exactly one of the three credit cards to
attempt to go over its credit limit. Which credit card is it?
 */

/*
-- Answer: the first credit card will go over its credit limit.
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

        System.out.println("start loop------------");
        for (int val = 1; val <= 58; val++) {
            System.out.println("wallet 1:" + wallet[0].charge(3 * val));
            System.out.println("wallet 2:" + wallet[1].charge(2 * val));
            System.out.println("wallet 3:" + wallet[2].charge(val));
        }
        System.out.println("end loop----------------");
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
}
