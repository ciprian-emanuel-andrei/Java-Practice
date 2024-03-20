public class Obiect {

    private String tip;
    private String nume;
    private double pret;
    private String marime = "MEDIU";

    public Obiect(String tip, String nume, double pret) {
        this.tip = tip.toUpperCase();
        this.nume = nume.toUpperCase();
        this.pret = pret;
    }

    public String getNume() {

        if(tip.equals("GUSTARE") || tip.equals("BAUTURA")) {
            return marime + " " + nume;
        }
        return nume;
    }

    public double getPretDeBaza() {
        return pret;
    }

    public double getPretAjustat() {
        return switch (marime) {
            case "MIC" -> getPretDeBaza() - 0.5;
            case "MARE" -> getPretDeBaza() + 1;
            default -> getPretDeBaza();
        };
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    public static void AfiseazaObiectul(String nume, double pret) {
        System.out.printf("%20s:%6.2f%n", nume, pret);
    }

    public void AfiseazaObiectul() {
        AfiseazaObiectul(getNume(), getPretAjustat());
    }
}
