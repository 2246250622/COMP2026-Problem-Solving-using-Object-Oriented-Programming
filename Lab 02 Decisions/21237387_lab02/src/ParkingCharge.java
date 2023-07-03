import java.util.Scanner;public class ParkingCharge {
    public static void main(String[] args){
    int car = 38;
    int bus = 56;
    int truck = 63;
    int result = 0;
    Scanner in = new Scanner(System.in);
    System.out.print("Type of vehicle:");
        String type = in.next();
        System.out.print("Hours the vehicle spent:");
        int hour = in.nextInt();
        switch(type)
        {
            case "c" :
                result = car * hour;
                System.out.println("Parking Charge: " +result);
                break;
            case "b" :
                result = bus * hour;
                System.out.println("Parking Charge: " +result);
                break;
            case "t" :
                result = truck * hour;
                System.out.println("Parking Charge: " +result);
                break;




    }


    }}
