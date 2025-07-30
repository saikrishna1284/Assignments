public class Vehicle {
    private String engineNumber;       
    protected String brand;            
    public int speed;                  

    
    public String getEngineNumber() {
        return engineNumber;
    }

   
    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed!");
        }
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle Info:");
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
