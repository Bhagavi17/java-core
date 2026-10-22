
public class Main {
    public static void main(String[] args) {

        // First object: SavingAccount
        SavingAccount obj = new SavingAccount();

        obj.accountHolderName = "Pranav Patil";
        obj.balance = 1000;
        obj.interestRate = 5;

        obj.deposit(1500);
        obj.applyInterest();

        System.out.println();

        // Second object: CurrentAccount
        CurrentAccount obj1 = new CurrentAccount();

        obj1.accountHolderName = "Rahul Patil";
        obj1.balance = 1000;
        obj1.overdraftLimit = 2000;

        obj1.deposit(500);
        obj1.withdraw(2000);
    }
}

class Account {
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;

        System.out.println("Deposited " + amount
                + " in " + accountHolderName
                + " account. New balance is " + balance);
    }
}

class SavingAccount extends Account {
    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;

        System.out.println("Interest added: " + interest);
        System.out.println("Final balance: " + balance);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;

            System.out.println("Withdrawn " + amount
                    + " from " + accountHolderName
                    + " account. New balance is " + balance);
        } else {
            System.out.println("Insufficient balance or overdraft limit exceeded.");
        }
    }
}
