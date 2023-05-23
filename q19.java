/*interface Account {
    void set(String name, String accountNumber, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

class Customer implements Account, Person {
    private String name;
    private String accountNumber;
    private double balance;

    @Override
    public void set(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Person Information:");
        System.out.println("Name: " + name);
    }

    public void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        System.out.println("Interest: " + interest);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.store("John Doe");
        customer.set("John Doe", "123456789", 5000);
        customer.disp();
        customer.display();
        customer.calculateInterest(2.5);
    }
}
*/