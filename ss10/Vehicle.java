package ss10;

public class Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;
    public void accelerate(int speed){
        System.out.println("Acclerating at:" + speed + "kmph");
    }
}
