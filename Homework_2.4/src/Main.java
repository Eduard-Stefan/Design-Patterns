public class Main {
    public static void main(String[] args) {
        PowerStrip powerStrip = new PowerStrip();
        ElectricDevice device1 = new ElectricDevice("PC");
        ElectricDevice device2 = new ElectricDevice("TV");
        powerStrip.addDevice(device1);
        powerStrip.addDevice(device2);
        powerStrip.connectToOutlet();
    }
}