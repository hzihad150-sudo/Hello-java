class Account {

    public double balance;
    public int rateOfInterest;

    // Constructor
    Account(double balance, int rateOfInterest) {
        this.balance = balance;
        this.rateOfInterest = rateOfInterest;
    }

    double getBalance() {
        return balance;
    }

    void addInterest() {
        balance = balance + (balance * rateOfInterest / 100);
    }

    void getDetails() {
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + rateOfInterest);
    }
}

// Saving class
class Saving extends Account {

    Saving(double balance, int rateOfInterest) {
        super(balance, rateOfInterest);
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void addInterestToSaving() {
        double interest = balance + (balance * rateOfInterest / 100);
        balance = interest;
        System.out.println("After Interest: " + balance);
    }
}

// Credit class
class Credit extends Account {

    double amount;

    Credit(double balance, int rateOfInterest, double amount) {
        super(balance, rateOfInterest);
        this.amount = amount;
    }

    void deposit() {
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdraw: " + amount);
    }

    void addInterest() {
        double interest = balance + (balance * rateOfInterest / 100);
        balance = interest;
        System.out.println("After Interest: " + balance);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Saving s = new Saving(1000, 5);
        s.deposit(1000);
        s.withdraw(300);
        s.addInterestToSaving();
        s.getDetails();

        System.out.println("-----------");

        Credit c = new Credit(2000, 10, 500);
        c.deposit();
        c.withdraw(400);
        c.addInterest();
        c.getDetails();
    }
}