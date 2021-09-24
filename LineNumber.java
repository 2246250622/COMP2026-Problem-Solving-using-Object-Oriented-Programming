import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class LineNumber {
    public static void main(String[] args) throws FileNotFoundException {
        int i=1;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the filename: ");

        String filename = kb.next();
        File inputFile = new File(filename);


        if (!inputFile.exists()) {
            System.out.println("The file " + filename + " is not found.");
            System.exit(0);
        }

        Scanner in = new Scanner(inputFile);

        while (in.hasNextLine()) {
            System.out.print(i+": ");
            String line = in.nextLine();
            System.out.println(line);
            i++;
        }
        in.close();

    }
}