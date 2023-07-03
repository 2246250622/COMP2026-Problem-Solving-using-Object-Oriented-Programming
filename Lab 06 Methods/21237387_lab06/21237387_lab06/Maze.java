import java.io.File;
import java.util.Scanner;

public class Maze {
    public static void main(String[] args) throws Exception {
        new Maze().runApp();
    }

    void runApp() throws Exception {
        char[][] maze = readMaze(filePicking());
        int[] start = findStartPosition(maze); //starting point of the maze
        int r = start[0]; //current row no.
        int c = start[1]; //current column no.
        printMaze(maze, r, c);
        System.out.println("* is your current position.");
        System.out.println("Use a,s,d,w (a:left, s:down, d:right, w:up) to move destination (D).");

        while(!isWin(maze, r, c)){
            char m = getMove();
            int[] newPos = findNewPosition(r, c, m);
            int newR = newPos[0]; //new row no. after move
            int newC = newPos[1]; //new column no. after move
            if (isValidMove(maze, newR, newC)) {
                if (maze[r][c] != 'S') {
                    maze[r][c] = '.';
                }
                r = newR; //update the current row no.
                c = newC; //update the current column no.
            }
            System.out.println();
            printMaze(maze, r, c);
        }
    }

    String filePicking() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = sc.nextLine();
        return filename;
    }

    char[][] readMaze(String filename) throws Exception {
        File inputFile = new File(filename);
        if (!inputFile.exists()) {
            System.out.println("The file " + filename + " is not found.");
            System.exit(0);
        }
        Scanner in = new Scanner(inputFile);

        int rows = in.nextInt();
        int cols = in.nextInt();
        in.nextLine(); //absorb the newline character

        char[][] maze = new char[rows][cols];

        for (int i = 0; i < maze.length; i++) {
            String line = in.nextLine();
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = line.charAt(j);
            }
        }

        in.close();
        return maze;
    }

    void printMaze(char[][] maze, int r, int c) {
        //TODO
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if(r == i && j == c){
                    System.out.print('*');
                }else{
                    System.out.print(maze[i][j]);
                }

            }
            System.out.println();
        }
    }

    int[] findStartPosition(char[][] maze) {
        int []array = new int[2];
        for(int i = 0; i< maze.length; i++){
            for(int j = 0; j< maze[i].length; j++){
                if(maze[i][j] == 'S'){
                   array[0]=i;
                   array[1]=j;
                }

                }
            } return array;
        }

    char getMove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your move (a,s,d,w): ");
        char input = sc.next().charAt(0);
        return input;
        //TODO
    }

    int[] findNewPosition(int r, int c, char m) {
        //TODO
        switch (m){
            case 'a':
                return new int[] {r, --c};
            case 's':
                return new int[] {++r, c};
            case 'd':
                return new int[] {r, ++c};
            case 'w':
                return new int[] {--r, c};
            default:
                return new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};
        }
    }

    boolean isValidMove(char[][] maze, int r, int c) {
        boolean check = true;
        try {
            if(maze[r][c] == ('X')){
                check = false;
                System.out.println("Invalid Move!");
            }
        }
        catch(Exception e) {
            check = false;
            System.out.println("Invalid Move!");
        }
        return check;
        //TODO
    }

    boolean isWin(char[][] maze, int r, int c) {
        boolean check = false;
        if (maze[r][c] == ('D')) {
            check = true;
            System.out.println("You Win!");
        }

        return check;
        //TODO
    }
}
