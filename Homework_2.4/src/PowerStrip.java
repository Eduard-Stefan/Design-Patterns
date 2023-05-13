import java.util.ArrayList;

public class PowerStrip {
    private ArrayList<ElectricDevice> devices;

    public PowerStrip() {
        devices = new ArrayList<>();
    }

    public void addDevice(ElectricDevice device) {
        devices.add(device);
    }

    public void connectToOutlet() {
        System.out.println("Power strip connected to outlet.");
        for (ElectricDevice device : devices) {
            device.displayMessage();
        }
    }
}