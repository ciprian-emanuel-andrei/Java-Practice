public class BankAccount {

    private int number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount () {

        this(56789, 2.50, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called!");
    }

    public BankAccount (int number, double balance, String name, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this(9999, 100.55, name, email, phoneNumber);
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double sumGiven) {
        balance = balance - sumGiven;
        if (sumGiven == 0) {
            System.out.println("You didn't deposit anything!");
        } else {
            System.out.println("After depositing, your balance = " + balance);
        }

    }

    public void withdrawFunds(double sumTaken) {


        balance = balance - sumTaken;
        if (balance < 0) {
            System.out.println("You don't have enough funds!");
        } else {
            System.out.println("You withdrew " + sumTaken + "! " + "The remaining balance = " + balance);
        }
    }


    // Getters

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


