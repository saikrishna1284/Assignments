
abstract class RideSahringApp {
    abstract void bookRide(String pickup, String destination);
    abstract void cancelRide();
    abstract void calculateFare(int distance); 
    
    
    void rideDetails(String type) {
        System.out.println("Ride Type: " + type);
    }
}


class Uber extends RideSahringApp {
    private int farePerKm = 15;

    void bookRide(String pickup, String destination) {
        System.out.println("Uber ride booked from " + pickup + " to " + destination);
    }

    void cancelRide() {
        System.out.println("Uber ride cancelled.");
    }

    void calculateFare(int distance) {
        int fare = farePerKm * distance;
        System.out.println("Uber Fare: Rs. " + fare);
    }
}


class Ola extends RideSahringApp {
    private int farePerKm = 12;

    void bookRide(String pickup, String destination) {
        System.out.println("Ola ride booked from " + pickup + " to " + destination);
    }

    void cancelRide() {
        System.out.println("Ola ride cancelled.");
    }

    void calculateFare(int distance) {
        int fare = farePerKm * distance;
        System.out.println("Ola Fare: Rs. " + fare);
    }
}
class Rapido extends RideSahringApp {
    private int farePerKm = 8;

    void bookRide(String pickup, String destination) {
        System.out.println("Rapido bike ride booked from " + pickup + " to " + destination);
    }

    void cancelRide() {
        System.out.println("Rapido ride cancelled.");
    }

    void calculateFare(int distance) {
        int fare = farePerKm * distance;
        System.out.println("Rapido Fare: Rs. " + fare);
    }
}
public class RideSharingApp {
    public static void main(String[] args) {
        RideSahringApp ride1 = new Uber();
        ride1.rideDetails("Uber");
        ride1.bookRide("Hyderabad", "Secunderabad");
        ride1.calculateFare(10);
        ride1.cancelRide();

        

        RideSahringApp ride2 = new Ola();
        ride2.rideDetails("Ola");
        ride2.bookRide("Gachibowli", "Madhapur");
        ride2.calculateFare(12);

        

        RideSahringApp ride3 = new Rapido();
        ride3.rideDetails("Rapido");
        ride3.bookRide("Ameerpet", "Kukatpally");
        ride3.calculateFare(15);
    }
}
