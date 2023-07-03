import java.util.*;


public class RightTriangle {
    public static void main(String[] args) {
        int n;


        Scanner in = new Scanner(System.in);

        System.out.print("n: ");
        n = in.nextInt();



        for (int y=1; y<=n; y++) {

            for (int x=0; x<y; x++) {

                System.out.print("*");


            }
            System.out.println();
        }




    }
}