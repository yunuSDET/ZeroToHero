package session21.ex2phone;

public class Test {

    public static void main(String[] args) {

        Phone phone=new Phone("Nokia","3310");

        SmartPhone smartPhone=new SmartPhone("Samsung","S23","Android13");

        phone.call();
        phone.text();

        smartPhone.call();
        smartPhone.text();
        smartPhone.takePhoto();
        smartPhone.accessInternet();


        System.out.println(smartPhone);

    }



}
