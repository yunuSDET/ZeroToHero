package session19.ex10car;

public class Car {
    public String brand;
    public int year;
    public double price;
    public boolean isStarted;

    public Car(String brand, int year, double price, boolean isStarted) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.isStarted = isStarted;
    }


    public void start() {
        isStarted = true;
    }

    public void stop() {
        isStarted = false;
    }




    public String toString() {
        return "Car{" +
                "bran='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", isStarted=" + isStarted +
                '}';
    }
}
