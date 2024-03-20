public class Cantec {

    static final int durataMinima = 40;
    private int durata = durataMinima;
    private String interpret;
    public String titlu;
    public String compozitor;
    private static int numarInstante = 0;

    public Cantec(int durata, String interpret, String titlu, String compozitor) {
        if(durata >= durataMinima){
            this.durata = durata;
        } else {
            System.out.println("Durata minima nu e buna in constructor! \n");
            this.durata = durataMinima;
        }
        this.interpret = interpret;
        this.titlu = titlu;
        this.compozitor = compozitor;
        numarInstante++;
    }
    public static int getNumarInstante () {
        return numarInstante;
    }
    public void setDurata(int durata) {
        if (durata > durataMinima) {
            this.durata = durata;
            System.out.println("S-a atins durata minima!");
        } else {
            System.out.println("Nu s-a atins durata minima a cantecului!");
        }
    }

    @Override
    public String toString() {
        return "Cantec{" +
                "durata=" + durata +
                ", interpret='" + interpret + '\'' +
                ", titlu='" + titlu + '\'' +
                ", compozitor='" + compozitor + '\'' +
                '}';
    }

    public int getDurata() {
        return durata;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void durataMilisecunde() {
        int durataNoua = durata * 1000;
        System.out.println("Durata in milisecunde = " + durataNoua + "ms");
    }

    public void metodaAfisare () {
        System.out.println("Aceast cantec are o durata de " + durata + " de secunde, interpretat de " + interpret +
                ", cu titlul " + titlu + " si compozitorul " + compozitor + ".");
    }
}
