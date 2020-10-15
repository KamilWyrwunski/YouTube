package pl.jaknauczycsieprogramowania.usbdevice;

public class MemoryStick implements USBDevice{
    private String name;
    private boolean ejected = false;

    public MemoryStick(String name){
        this.name = name;

    }

    @Override
    public boolean connect() {
        System.out.println("connected memory stick");


        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected){
            System.out.println("Please eject memory stick");
            return false;
        }else{
            System.out.println("memory stick disconnected");
            return true;
        }


        }
        public void eject(){
        ejected = true;
            System.out.println("ejecting memory stick");
        }


    @Override
    public String getName() {
        return name;
    }
}
