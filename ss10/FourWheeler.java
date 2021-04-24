package ss10;

public class FourWheeler extends Vehicle{
    private boolean powerSteer;
    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer){
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        powerSteer = pSteer;
    }

    public void showDetails(){
        System.out.println("Vehicleno:" + vehicleNo);
        System.out.println("Vehicle Name:" + vehicleName);
        System.out.println("Number of Wheels:" + wheels);
        if (powerSteer == true){
            System.out.println("PowerSteering:Yes");
        }else {
            System.out.println("PowerSteering:No");
        }
    }
}
