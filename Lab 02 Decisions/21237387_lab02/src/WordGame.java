import java.util.*;

public class WordGame {
    public static void main (String[] agrs){

    Scanner in = new Scanner(System.in);
    System.out.print("Enter your name: ");
        String NAME = in.next();
    System.out.print("Enter your age: ");
        int AGE = in.nextInt();
    System.out.print("Enter the name of a city: ");
        in.nextLine();
        String CITY = in.nextLine();
    System.out.print("Enter the name of a collage: ");
        String COLLEGE = in.next();
    System.out.print("Enter a profession:");
        String PROFESSION = in.next();
    System.out.print("Enter a type of animal: ");
        String ANIMAL = in.next();
    System.out.print("Enter a pet's name: ");
        String PETNAME = in.next();

    System.out.println("There once was a person named "+NAME +" who lived in "+CITY+".\n" +
            "At the age of "+AGE+", "+NAME+" went to college at "+COLLEGE+".\n" +
            NAME+" graduated and went to work as a(n) "+PROFESSION+".\n" +
            "Then, "+NAME+" adopted a(n) "+ANIMAL+" named "+PETNAME+".\n" +
            "They both lived happily ever after!\n");

    }
}
