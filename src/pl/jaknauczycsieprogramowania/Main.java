package pl.jaknauczycsieprogramowania;

import pl.jaknauczycsieprogramowania.drive.HDDDrive;
import pl.jaknauczycsieprogramowania.drive.SSDDrive;
import pl.jaknauczycsieprogramowania.usbdevice.MemoryStick;
import pl.jaknauczycsieprogramowania.usbdevice.Mouse;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
      //  HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

       // drive.addFiles(new File("jnsp.jpg"));
        //drive.listFiles();
        MemoryStick memoryStick = new MemoryStick("prndrive");
        Mouse mouse = new Mouse("Mysz");

        computer.addUSBDevice(memoryStick);
       // computer.addUSBDevice(mouse);

        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);
      //  computer.removeUSBDevice(mouse);



    }
}
