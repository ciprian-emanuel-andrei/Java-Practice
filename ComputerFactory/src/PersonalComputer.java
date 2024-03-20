public class PersonalComputer extends Product {

    private Computercase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer,
                            Computercase computerCase, Monitor monitor,
                            Motherboard motherboard) {

        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200,50,"yellow");
    }
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public Computercase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
