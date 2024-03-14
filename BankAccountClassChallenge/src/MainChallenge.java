public class MainChallenge {
    public static void main(String[] args) {


//        BankAccount bank = new BankAccount(127, 23030.89, "Ciprian", "andrei_ciprian_emanuel@yahoo.com", "0785916157");

//        bank.setNumber(124);
//        bank.setBalance(23000.89);
//        bank.setName("Ciprian");
//        bank.setEmail("andrei_ciprian_emanuel@yahoo.com");
//        bank.setPhoneNumber("0785916157");
        BankAccount bank = new BankAccount();
        System.out.println("number = " + bank.getNumber());
        System.out.println("balance = " + bank.getBalance());
        System.out.println("name = " + bank.getName());
        System.out.println("email = " + bank.getEmail());
        System.out.println("phone number = " + bank.getPhoneNumber());

        bank.depositFunds(0);
        bank.withdrawFunds(10000.98);
        System.out.println("\n");
        bank.depositFunds(0);
        bank.withdrawFunds(2323.98);
        System.out.println("\n");
        bank.depositFunds(44.09);
        bank.withdrawFunds(20212.98);

        BankAccount ciprianAccount = new BankAccount("Cipri", "andrei_ciprian_emanuel@uahoo.com",
                "0785916157");
        System.out.println("AccountNo : " + ciprianAccount.getNumber() +
                "; name " + ciprianAccount.getName());
    }
}
