package pl.jaknauczycsieprogramowania;

import pl.jaknauczycsieprogramowania.Headphones;
import pl.jaknauczycsieprogramowania.Monitor;
import pl.jaknauczycsieprogramowania.USBDevice;
import pl.jaknauczycsieprogramowania.drive.Drive;

import java.util.ArrayList;
import java.util.List;

public class Computer {
   private  Monitor monitor;
   private Drive drive;
   private Headphones headphones;

   List<USBDevice> usnDevices = new ArrayList<>();
   public Computer(Monitor monitor,Drive drive){
       this.monitor = monitor;
       this.drive = drive;
   }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevice> getUsnDevices() {
        return usnDevices;
    }
}
