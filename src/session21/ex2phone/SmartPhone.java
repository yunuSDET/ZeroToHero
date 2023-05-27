package session21.ex2phone;

public class SmartPhone extends Phone{
    private String operatingSystem;

    public SmartPhone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void takePhoto(){
        System.out.println(getBrand()+" "+getModel()+" is taking photo.");
    }

    public void accessInternet(){
        System.out.println(getBrand()+" "+getModel()+" is accessing the internet.");
    }




}
