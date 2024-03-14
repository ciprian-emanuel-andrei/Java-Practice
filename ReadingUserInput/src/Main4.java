import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while(true) {
            System.out.println("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();
            try {
                double vaildNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || vaildNum < min) {
                    min = vaildNum;
                }
                if (loopCount == 0 || vaildNum > max) {
                    max = vaildNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid number");
        }
    }
}
