import java.util.*;

public class CalendarMonth {
    public static void main(String[] args){
        int y = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the start day: ");
        int start = in.nextInt();
        System.out.print("Enter the number of days: ");
        int number = in.nextInt();


        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        System.out.println("--- --- --- --- --- --- ---");

        for(int x=0; x<start; x++){
            System.out.print("    ");
        }

        for(y=1; y<=7-start; y++) {
            System.out.printf("%2d  ", y);
        }
        System.out.print("\n");
        int q=0;

        for(int i=y; i<=number; i++){
            System.out.printf("%2d  ",i);
            q++;


            if (q==7){
                System.out.println("");
                q=0;
            }


        }
        System.out.println("\n--- --- --- --- --- --- ---");
    }
}