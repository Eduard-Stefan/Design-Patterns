public class ElectricDevice {
    private String name;

    public ElectricDevice(String name) {
        this.name = name;
    }

    public void displayMessage() {
        System.out.println(name + " is now connected to the power strip.");
    }
}