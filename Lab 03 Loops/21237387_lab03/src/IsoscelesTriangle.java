import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        int n;
        int j=0;


        Scanner in = new Scanner(System.in);

        System.out.print("n: ");
        n = in.nextInt();
        if (n>0){
            System.out.println("    *");
        }else{
            return;
        }


        for (int y=1; y<n; y++) {
            for (int k=n-2; k>j; k--){
                System.out.print(" ");
            }

                 System.out.print("*");
            for (int x=0; x<y; x++) {



                System.out.print("**");


            }
            System.out.println();
            j++;
        }




    }
}