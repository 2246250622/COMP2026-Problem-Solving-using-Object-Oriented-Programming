import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class SaleAmount {
    public static void main(String[] args) {
        double dinner = 0;
        double conference = 0;
        double lodging=0;
        int line = 0;
try{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = in.next();

            File myObj = new File(filename);
             Scanner myReader = new Scanner(myObj);



        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            ++line;

            try {
                String[] parts = data.split(",");
                if (parts[1].equalsIgnoreCase("dinner")) {
                 try{
                    dinner += Double.parseDouble(parts[2]);
                }catch(Exception e){
                    System.out.println("Error: For input string: \""+parts[2]+"\"");
                }
                } else if (parts[1].equalsIgnoreCase("conference")) {
                    try{
                    conference += Double.parseDouble(parts[2]);
                    }catch(Exception e){
                        System.out.println("Error: For input string: \""+parts[2]+"\"");
                    }
                } else if (parts[1].equalsIgnoreCase("lodging")) {
                    try{
                    lodging += Double.parseDouble(parts[2]);
                    }catch(Exception e){
                        System.out.println("Error: For input string: \""+parts[2]+"\"");
                    }
                } else {
                    if (parts.length > 3) {
                        System.out.println("Error: Line " + line + ": Incorrect line format!");
                    } else
                        System.out.println("Error: Line " + line + ": Incorrect service category!");
                }
            } catch (Exception e) {
                System.out.println("Error: Line " + line + ": Incorrect line format!");
            }


        }
                myReader.close();


        System.out.println("Dinner Sale Amount: "+dinner);
        System.out.println("Conference Sale Amount: "+conference);
        System.out.println("Lodging Sale Amount: "+lodging);
    }catch(FileNotFoundException e){
    System.out.println("Error: The file sale.txt is not found.");
    }

    }}
