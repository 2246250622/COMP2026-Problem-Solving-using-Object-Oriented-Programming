import java.util.*;
import java.io.IOException;


public class CharFinder {
    public static void main(String[] args)throws IOException{
        int count = 0;
        String strunderscore = "_";
        char underscore = strunderscore.charAt(0);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line: ");

        String line = in.nextLine();
        char[] charline = line.toCharArray();
        System.out.print("Enter a character: ");
        char thecharacter = in.next().charAt(0);

        for(int i=0; i<charline.length; i++){
            if (charline[i]==thecharacter){
                charline[i] = underscore;
                count++;
            }
        }
        for(int k =0; k<charline.length; k++){
            System.out.print(charline[k]);
        }
        System.out.println();
        System.out.println("No. of occurrences of "+thecharacter+": "+count);
    }
}
