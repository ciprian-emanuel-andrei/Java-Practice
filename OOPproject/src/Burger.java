public class Burger extends Obiect{

    private Obiect extra1;
    private Obiect extra2;
    private Obiect extra3;

    public Burger(String nume, double pret) {
        super("Burger", nume, pret);
    }

    @Override
    public String getNume() {
        return super.getNume() + " BURGER";
    }

    @Override
    public double getPretAjustat() {
        return getPretDeBaza() +
                ((extra1 == null) ? 0 : extra1.getPretAjustat()) +
                ((extra2 == null) ? 0 : extra2.getPretAjustat()) +
                ((extra3 == null) ? 0 : extra3.getPretAjustat());
    }

    public double getPretExtra(String numeTopping) {
        return switch (numeTopping.toUpperCase()) {
            case "BRANZA", "SALATA" -> 1.0;
            case "BACON", "SALAM" -> 1.5;
            default -> 0.0;
        };
    }

    public void adaugaTopping(String extra1, String extra2, String extra3) {

        this.extra1 = new Obiect("TOPPING", extra1,
                getPretExtra(extra1));
        this.extra2 = new Obiect("TOPPING", extra2,
                getPretExtra(extra2));
        this.extra3 = new Obiect("TOPPING", extra3,
                getPretExtra(extra3));
    }

    public void afiseazaListaObiecte() {

        AfiseazaObiectul("NORMAL BURGER", getPretDeBaza());
        if(extra1 != null) {
            extra1.AfiseazaObiectul();
        }
        if(extra2 != null) {
            extra2.AfiseazaObiectul();
        }
        if(extra3 != null) {
            extra3.AfiseazaObiectul();
        }
    }

    @Override
    public void AfiseazaObiectul() {

        afiseazaListaObiecte();
        System.out.println("-".repeat(30));
        super.AfiseazaObiectul();
    }
}
