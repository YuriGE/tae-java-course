/* @author <Yuri Kirkitadze> */

package homework6;

import java.sql.SQLOutput;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("არასაკმარისი თანხა");
        } else balance -= amount;
    }

    public double getBalance() {
        return balance;
    }


    public static void main(String[] args) {
        BankAccount acc = new BankAccount("იური", 100);
        acc.deposit(50);
        System.out.println(acc.getBalance());
        System.out.println(" ");

        //დამატებით გამოტანის გამოყნება, არასკამრის თანხაზე
        acc.withdraw(450);
        System.out.println(acc.getBalance());

    }

}
