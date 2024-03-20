public class Main {

    public static void main(String[] args) {

        Cantec cantecUnu = new Cantec(35, "Andreea Stan", "Catelus cu parul cret",
                "Ciprian Porumbescu");
        Cantec cantecDoi = new Cantec(60,"Andreea Stan",
                "Oda Bucuriei", "Beethoven");

        cantecUnu.setDurata(35);
        cantecDoi.setDurata(60);

        System.out.println(cantecUnu.toString());
        System.out.println(cantecDoi.toString());

        cantecUnu.durataMilisecunde();
        cantecDoi.durataMilisecunde();

        System.out.println("Numarul total de instante = " + Cantec.getNumarInstante());
    }
}
