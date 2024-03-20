public class BurgerDeluxe extends Burger {

    Obiect delux1;
    Obiect delux2;

    public BurgerDeluxe(String nume, double pret) {
        super(nume, pret);
    }

    public void adaugaTopping(String extra1, String extra2, String extra3,
                              String extra4, String extra5) {
        super.adaugaTopping(extra1, extra2, extra3);
        delux1 = new Obiect("TOPPING", extra4, 0.0);
        delux2 = new Obiect("TOPPING", extra5, 0.0);
    }

    @Override
    public void afiseazaListaObiecte() {
        super.afiseazaListaObiecte();
        if(delux1 != null) {
            delux1.AfiseazaObiectul();
        }
        if(delux2 != null) {
            delux2.AfiseazaObiectul();
        }
    }

    @Override
    public double getPretExtra(String numeTopping) {
        return 0;
    }
}
