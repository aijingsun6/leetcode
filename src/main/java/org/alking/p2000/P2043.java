package org.alking.p2000;

/**
 * https://leetcode-cn.com/problems/simple-bank-system/
 */
public class P2043 {

    class Bank {

        private long[] balance;

        public Bank(long[] balance) {
            this.balance = balance;
        }

        private boolean checkIdx(int acc) {
            return acc >= 1 && acc <= balance.length;
        }

        public boolean transfer(int account1, int account2, long money) {

            if(!checkIdx(account1) || !checkIdx(account2)){
                return false;
            }

            if(account1 == account2){
                return true;
            }

            if(balance[account1-1] < money){
                return false;
            }
            balance[account1-1] -= money;
            balance[account2-1] += money;
            return true;
        }

        public boolean deposit(int account, long money) {
            if(!checkIdx(account)){
                return false;
            }
            balance[account-1] += money;
            return true;
        }

        public boolean withdraw(int account, long money) {
            if(!checkIdx(account)){
                return false;
            }
            if(balance[account-1] < money){
                return false;
            }
            balance[account-1] -= money;
            return true;
        }
    }
}
