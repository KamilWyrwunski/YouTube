package pl.jaknauczycsieprogramowania;

import pl.jaknauczycsieprogramowania.drive.HDDDrive;
import pl.jaknauczycsieprogramowania.drive.SSDDrive;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
      //  HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

        drive.addFiles(new File("jnsp.jpg"));
        drive.listFiles();


    }
}
