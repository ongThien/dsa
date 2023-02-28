package chapter_01.reinforcement.r_1_11;

/*
Modify the CreditCard class from Code Fragment 1.5 to include a method that
updates the credit limit.
 */

/*
-- Note: the requirement is not really clear on whether to "increase/decrease"
         the current limit or to set it to a new value. I went with the "set it to a new value"
 */

public class Solution {
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

        public void makePayment(double amount) {
            balance -= amount;
        }
    }
}
