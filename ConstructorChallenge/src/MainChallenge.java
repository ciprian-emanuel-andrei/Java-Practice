public class MainChallenge {
    public static void main(String[] args) {

        Customer customer = new Customer("Ciprian", 10000.98,
                "andrei_ciprian_emanuel@yahoo.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCredit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCredit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("Bianca", "biancaelena208@yahoo.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCredit());
        System.out.println(thirdCustomer.getEmail());
    }
}
