package Lab_2_7.Device;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.mac = mac;
        this.speed = speed;
    }

    public String toString() {
        return getManufacturer() + "\n" + getPrice() + "\n" + getSerialNumber() + "\n" + speed + "\n" + mac;
    }
}
