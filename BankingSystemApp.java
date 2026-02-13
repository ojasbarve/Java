import java.util.*;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance)
            throw new InsufficientFundsException("Insufficient balance");
        balance -= amount;
    }

    public void transfer(Account targetAccount, double amount) throws InsufficientFundsException {
        if (targetAccount == null)
            throw new InsufficientFundsException("Invalid target account");
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }

    public void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void createAccount(String number, String name, double balance) {
        accounts.add(new Account(number, name, balance));
    }

    public Account getAccount(String number) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(number))
                return a;
        }
        return null;
    }

    public void displayAllAccounts() {
        for (Account a : accounts)
            a.displayAccountDetails();
    }
}

public class BankingSystemApp {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createAccount("A101", "Alice", 5000);
        bank.createAccount("A102", "Bob", 3000);

        Account acc1 = bank.getAccount("A101");
        Account acc2 = bank.getAccount("A102");

        try {
            acc1.deposit(1000);
            acc1.withdraw(2000);
            acc1.transfer(acc2, 1500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        bank.displayAllAccounts();
    }
}
