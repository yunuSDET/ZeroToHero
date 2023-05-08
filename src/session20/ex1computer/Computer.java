package session20.ex1computer;

public class Computer {
    public String brand,cpu;
    public double price;
    public boolean isOpened;

    public Computer(String brand, String cpu, double price) {
        this.brand = brand;
        this.cpu = cpu;
        this.price = price;
        this.isOpened = false;
    }

    public void open(){
        if (isOpened) {
            System.out.println(brand+" is already opened.");
            return;
        }
        isOpened=true;
        System.out.println(brand+" is starting");
    }

    public void close(){
        if(!isOpened) {
            System.out.println(brand+" already closed");
            return;
        }
        isOpened=false;
        System.out.println(brand+" is closing.");
    }


    public void restart(){
        if(!isOpened) {
            System.out.println(brand+" closed and so you can't restart");
            return;
        }
        isOpened=false;
        System.out.println(brand+" is restarting.");
        isOpened=true;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", price=" + price +
                ", isOpened=" + (isOpened ? "Opened" : "Closed") +
                '}';
    }
}
