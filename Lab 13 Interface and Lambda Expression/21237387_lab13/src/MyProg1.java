public class MyProg1 {
    public static void main(String[] args){
        new MyProg1().runApp();
    }

    /**
     * Print all the elements in the given integer array that pass the check
     *
     * @param a - an integer array
     * @param c - a NumberChecker
     */
    public void printElements(int[] a, NumChecker c){
        for (int i = 0; i < a.length; i++){
            if(c.check(a[i])){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public void runApp(){
        int[] intAry = {34, 6, 21, -1, -32, 24, -97, 76, 9};

        System.out.print("Positive Elements: ");
        NumChecker pc = new PositiveChecker();
        printElements(intAry, pc);

        System.out.print("Even Elements: ");
        NumChecker ec = new EvenChecker();
        printElements(intAry, ec);
    }
}

