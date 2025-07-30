public class Car extends Vehicle {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void displayCarInfo() {
        System.out.println("Car Info:");
        System.out.println("Model: " + model);
        System.out.println("Brand: " + getBrand());            
        System.out.println("Speed: " + speed + " km/h");       
        System.out.println("Engine No: " + getEngineNumber()); 
    }
}
