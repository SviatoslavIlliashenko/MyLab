package Lab_2_7.Device;

public class Main {
    public static void main(String[] args) {

        Device[] devices=new Device[2];

        devices[0]=new Monitor("Sumsung",20000,"123mjfw",1366,788);
        devices[1]=new EthernetAdapter("Sumsung",20000,"123mjfw",100,"mac234");

        for(int i=0;i<devices.length;i++){
            System.out.println(devices[i]);
            System.out.println("---------");
        }
    }
}
