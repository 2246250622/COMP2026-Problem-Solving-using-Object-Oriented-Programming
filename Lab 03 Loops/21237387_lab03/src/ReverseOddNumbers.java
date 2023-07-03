public class ReverseOddNumbers {
    public static void main(String[] args){

        int q=0;

        for(int i=100; i>0; i--){
            i--;
            System.out.printf("%2d  ",i);
            q++;


            if (q==10){
                System.out.println("");
                q=0;
            }


        }

    }
}
