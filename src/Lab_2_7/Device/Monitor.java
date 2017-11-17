package Lab_2_7.Device;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionY, int resolutionX) {
        super(manufacturer, price, serialNumber);
        this.resolutionY = resolutionY;
        this.resolutionX = resolutionX;
    }

    public String toString() {
        return this.getManufacturer() + "\n" + getPrice() + "\n" + getSerialNumber() + "\n" + resolutionX + "\n" + resolutionY;
    }
}
