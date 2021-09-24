public class FormattedOddNumbers {
    public static void main(String[] args){

        int q=0;

        for(int i=1; i<100; i++){

            System.out.printf("%2d  ",i);
            q++;
            i++;

            if (q==10){
                System.out.println("");
                q=0;
            }


        }

    }
}