public class VehicleMain {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setModel("Swift Dzire");
        myCar.setBrand("Maruti Suzuki");
        myCar.setSpeed(80);
        myCar.setEngineNumber("ENG123456");

        
        myCar.displayCarInfo();
        //myCar.displayVehicleInfo();
    }
}
