public class Main {

    public static void main(String[] args) {

        int numereGasite = 0;
        int sumaNumerelor = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                numereGasite++;
                sumaNumerelor += i;
                System.out.println("Am gasit un numar divizibil cu 3 si 5: " + i);
            }

            if (numereGasite == 5) {
                break;
            }
        }
        System.out.println("Suma numerelor este = " + sumaNumerelor);
    }
}
