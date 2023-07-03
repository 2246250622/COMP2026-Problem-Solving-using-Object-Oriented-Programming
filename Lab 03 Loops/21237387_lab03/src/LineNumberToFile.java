import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class LineNumberToFile {
    public static void main(String[] args) throws FileNotFoundException {
        int i=1;
        String z="";
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the input filename: ");
        String filename = kb.next();

        File inputFile = new File(filename);

        System.out.print("Enter the output filename: ");
        String newfilename = kb.next();

        if (!inputFile.exists()) {
            System.out.println("The file " + filename + " is not found.");
            System.exit(0);
        }

        Scanner in = new Scanner(inputFile);

        while (in.hasNextLine()) {
            z+=(i+": ");
            String line = in.nextLine();
            z += line+"\n";
            i++;


        }
        in.close();
        PrintWriter out = new PrintWriter(newfilename);
        out.print(z);
        out.close();





    }
}