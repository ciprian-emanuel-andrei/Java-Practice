public class Customer {
    private String name;
    private double credit;
    private String email;

    public Customer() {
        this("Nobody", "nobody@nowhere.com");
    }

    public Customer(String name, String email) {
        this(name, 10000.98, email);
    }

    public Customer(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
}


