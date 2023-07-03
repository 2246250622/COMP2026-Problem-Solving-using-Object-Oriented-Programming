import java.util.Scanner;


import java.util.*;


public class InvertedTriangle {
        public static void main(String[] args) {
            int m;



            Scanner in = new Scanner(System.in);

            System.out.print("n: ");
            m = in.nextInt();
            int g=m;



            for (int y=1; y<=m; y++) {
g--;
                for (int x=0; x<=g; x++) {

                    System.out.print("*");

                }
                System.out.println();
            }




        }
    }