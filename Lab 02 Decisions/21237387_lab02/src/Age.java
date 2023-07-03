import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        int age=0;
        int number = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter today's date:");
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        System.out.print("Enter a persion's birth date:");
        int year1 = in.nextInt();
        int month1 = in.nextInt();
        int day1 = in.nextInt();

        if(month-month1 < 0){
            number++;
        }else if(month-month1 >= 0){
            if(day-day1 < 0){
                number++;
            }else{

            }
        }

        age = year - year1 - number;
        //2000 1 15
        System.out.print("The person's age is "+age);
    }
}
