package exercise11_3;

import ToolKit.Account;
import ToolKit.CheckingAccount;
import ToolKit.SavingsAccount;


    public static void main(String[] args) {

        Account account = new Account(111, 200);
        CheckingAccount checkingAccount = new CheckingAccount(112, 250);
        SavingsAccount savingsAccount = new SavingsAccount(113, 300);

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }


public class Exercise11_3 {

}