public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product {

    private int size;
    private String resulution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resulution) {
        super(model, manufacturer);
        this.size = size;
        this.resulution = resulution;
    }

    public void drawPixelAt (int x, int y, String color) {
        System.out.println(String.format(
                "Drawing pixel at %d, %d in color %s", x, y, color));
    }
}

class Motherboard extends Product {

    private int ramSlots;
    private int cardSlots;
    private String bios;
    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram (String programName) {
        System.out.println("Program " + programName + "is now loading...");
    }
}

class Computercase extends Product {

    private String powerSupplier;
    public Computercase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Computercase(String model, String manufacturer, String powerSupplier) {
        super(model, manufacturer);
        this.powerSupplier = powerSupplier;
    }

    public void pressPowerButton() {
        System.out.println("Power Button pressed!");
    }
}
