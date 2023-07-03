import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MapFlooding {
    public static void main(String[] args) throws FileNotFoundException {
        new MapFlooding().runApp();
    }

    void runApp() throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String filename = in.nextLine();

        System.out.print("Enter the water level: ");
        int input = in.nextInt();
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][]map = new int[row][col];

        for(int i=0; i < row; i++){
            for(int j=0; j < col; j++){
                map[i][j] =  sc.nextInt();
    }

}
        String newmap[][] = new String[map.length][map[0].length];
        for(int i=0; i < row; i++){
            for(int j=0; j < col; j++){
                if (map[i][j] > input ){
                    newmap[i][j] = (" ");
                }else{
                    newmap[i][j] = ("*");
                }
            }
        }

        for(int i=0; i < row; i++){
            for(int j=0; j < col; j++){
                System.out.print(newmap[i][j]);
            }
            System.out.println();
        }



    }}



