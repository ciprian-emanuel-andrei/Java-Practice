public class Meniu {

    private Burger burger;
    private Obiect bautura;
    private Obiect gustare;

    public Meniu () {
        this("normal", "coca-cola", "cartofi prajiti");
    }
    public Meniu (String tipBurger, String tipBautura, String tipGustare) {

        if(tipBurger.equalsIgnoreCase("deluxe")) {
            this.burger = new BurgerDeluxe(tipBurger, 45);
        } else {
            this.burger = new Burger(tipBurger, 30.0);
        }
        this.gustare = new Obiect("gustare", tipGustare, 10.0);
        this.bautura = new Obiect("bautura", tipBautura, 5.0);
    }
    public double getPretTotal() {

        if(burger instanceof BurgerDeluxe) {
            return burger.getPretAjustat();
        }
        return gustare.getPretAjustat() + bautura.getPretAjustat() + burger.getPretAjustat();
    }

    public void afiseazaLista() {
        burger.AfiseazaObiectul();
        if(burger instanceof BurgerDeluxe) {
            Obiect.AfiseazaObiectul(bautura.getNume(), 0);
            Obiect.AfiseazaObiectul(gustare.getNume(), getPretTotal());
        } else {
            bautura.AfiseazaObiectul();
            gustare.AfiseazaObiectul();
        }
        System.out.println("-".repeat(30));
        Obiect.AfiseazaObiectul("TOTAL PRICE", getPretTotal());
    }

    public void adaugaToppingBurger(String extra1, String extra2, String extra3) {
        burger.adaugaTopping(extra1,extra2,extra3);
    }
    public void adaugaToppingBurger(String extra1, String extra2, String extra3,
                                    String extra4, String extra5) {

        if(burger instanceof BurgerDeluxe db) {
            db.adaugaTopping(extra1,extra2,extra3,extra4,extra5);
        } else {
            burger.adaugaTopping(extra1,extra2,extra3);
        }
    }


    public void seteazaMarimeaBauturii(String marime) {
        bautura.setMarime(marime);
    }
}
