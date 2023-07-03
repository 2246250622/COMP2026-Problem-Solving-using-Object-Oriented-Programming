import java.util.Scanner;


import java.util.Scanner;

    public class Diamond {
        public static void main(String[] args) {
            int n;
            int j=0;
            String empty = " ";



            Scanner in = new Scanner(System.in);

            System.out.print("n: ");
            n = in.nextInt();
            int length = n;
            if (n>0){
                for(int l=0;l<=n-2;l++ ){
                    System.out.print(" ");

                }
                System.out.println("*");
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
                 if(n>1){

                     for(int e=0; e<n-1; e++){
                         System.out.print(empty);
                         empty+=" ";
                     for(int i=0; i<(length-1)*2-1; i++) {
                         System.out.print("*");


                     }
                         length-=1;

                     System.out.println();
                     }
                 }else{
                     return;
                 }





        }
    }