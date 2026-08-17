 import java.util.Scanner;

public class CabBooking {

    String passengerName;
    String cabType;
    int distance;
    int fare;

    public CabBooking(String passengerName, String cabType, int distance) {
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.distance = distance;
    }

    public void displayBooking(int choice) {

        if (choice == 1) {

            cabType = "mini";
            distance = 5;
            fare = 75;

            System.out.println("Passenger Name: " + passengerName);
            System.out.println("Cab Type: " + cabType);
            System.out.println("Distance: " + distance + " KM");
            System.out.println("Fare: " + fare + " RS");
        }

        else if (choice == 2) {

            fare = distance * 15;

            System.out.println("Passenger Name: " + passengerName);
            System.out.println("Cab Type: " + cabType);
            System.out.println("Distance: " + distance + " KM");
            System.out.println("Fare: " + fare + " RS");
        }

        else {
            System.out.println("Invalid choice");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name:");
        String name = sc.nextLine();

        String cab = "";
        int distance = 0;

        if (choice == 2) {

            System.out.println("Enter cab type:");
            cab = sc.nextLine();

            System.out.println("Enter distance:");
            distance = sc.nextInt();
        }

        CabBooking cb = new CabBooking(name, cab, distance);

        cb.displayBooking(choice);

        sc.close();
    }
}