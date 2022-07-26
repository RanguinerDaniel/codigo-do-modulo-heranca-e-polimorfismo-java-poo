package Application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class App {
    public static void main(String [] args){
        Account account = new Account(101, "Gutemberg", 1000);
        Account account1 = new SavingAccount(80, "Pascal", 1000, 0.01);
        Account account2 = new BusinessAccount(93, "Nikola Tesla", 1000, 500);

        account.withdraw(500);
        System.out.printf("Saldo disponível: %s%n", account.getBalance());

        account1.withdraw(500);
        System.out.printf("Saldo disponível: %s%n", account1.getBalance());

        account2.withdraw(500);
        System.out.printf("Saldo disponível: %s", account2.getBalance());


    }
}
