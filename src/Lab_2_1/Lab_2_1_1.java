package Lab_2_1;

public class Lab_2_1_1 {
    public static void main(String[] args) {


        Computer[] array = new Computer[5];

        for (int i = 0; i < array.length; i++) {

            array[i] = new Computer();
            array[i].setManufacturer("asus" + i);
            array[i].setSerialNumber(234141 + i);
            array[i].setFrequencyCPU(2.3 + i);
            array[i].setPrice(10000 + i);
            array[i].setQuantityCPU(4 + i);


            array[i].increasesPercent(10);


            array[i].view();
        }


    }
}

 class Computer {

    private String manufacturer;
    private int serialNumber;
    private double price;
    private int quantityCPU;
    private double frequencyCPU;


    public double increasesPercent(int percent) {

        price = price / 100 * percent + price;

        return price;

    }

    void view() {
        System.out.println("Manufacturer : " + getManufacturer() + "\nSerialNumber : " + getSerialNumber() + "\nPrice : " + getPrice() + "\nQuantityCPU : " + getQuantityCPU() + "\nFrequencyCPU : " + getFrequencyCPU());
        System.out.println();
        System.out.println();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }


    public double getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(double frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }


}