public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        String userDateOfBirth = "2000";

        int dateofBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = " + (currentYear - dateofBirth));

        String userAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
        System.out.println("The user says he's " + ageWithPartialYear);
    }
}
