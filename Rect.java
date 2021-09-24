import java.util.*;


public class Rect {
    public static void main(String[] args) {
        int m=0;
        int n=0;
        Scanner in = new Scanner(System.in);

        System.out.print("m: ");
        m = in.nextInt();

        System.out.print("n: ");
        n = in.nextInt();

        for (int y=0; y<n; y++) {
            for (int i = 0; i < m; i++) {

                System.out.print("*");


            }
            System.out.println();
        }




    }
}