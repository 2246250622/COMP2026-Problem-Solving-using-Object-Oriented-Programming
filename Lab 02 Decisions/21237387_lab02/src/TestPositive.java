import java.util.*;


public class TestPositive {
    public static void main(String[] args){
        String message ="Good Bye !";
        Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer value:");
    int value = in.nextInt();

    if(value > 0){
        System.out.println("The value is postitive. \n"+message);
    }else if (value < 0){
        System.out.println("The value is negative. \n"+message);
    }else{
        System.out.println("The value is zero. \n"+message);
    }

    }
}
