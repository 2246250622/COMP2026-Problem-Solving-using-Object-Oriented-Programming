public class OddNumbers {
    public static void main(String[] args) {
        int x = 100;
        int num=0;

        for (int i = 1; i < x; i++) {
            System.out.printf("%d ", i);
            i++;
           num++;


            if(num==10){
                System.out.println("");
                num=0;
            }
        }

        }
    }

