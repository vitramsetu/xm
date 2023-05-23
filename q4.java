import java.util.Scanner;

interface Vehicle {
    void move();
}

class Helicopter implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}

class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "helicopter":
                return new Helicopter();
            case "car":
                return new Car();
            case "train":
                return new Train();
            default:
                return null;
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of vehicle (Helicopter/Car/Train): ");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType);

        if (vehicle != null) {
            vehicle.move();
        } else {
            System.out.println("Invalid vehicle type. Please enter Helicopter, Car, or Train.");
        }
    }
}
