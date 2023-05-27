package session21.ex2phone;

public class Phone {
    private String brand,model;
    private int batteryLevel;


    public Phone(String brand, String model) {
        setModel(model);
        setBrand(brand);
        setBatteryLevel(100);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isBlank()) {
            System.out.println("Invalid brand");
            return;
        }
        this.brand = brand;
    }

    public void call(){
        System.out.println(brand+" "+ model+" is calling.");
    }

    public void text(){
        System.out.println(brand+" "+model+" is texting.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.isBlank()){
            System.out.println("Invalid model");
            return;
        }

        this.model = model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if(batteryLevel<0 || batteryLevel>100){
            System.out.println("Invalid battery level");
            return;
        }
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batteryLevel=" + batteryLevel +
                '}';
    }
}
