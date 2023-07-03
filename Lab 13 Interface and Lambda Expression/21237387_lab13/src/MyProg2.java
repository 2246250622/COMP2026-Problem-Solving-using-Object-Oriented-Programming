public class MyProg2 {
    public static void main(String[] args){
        new MyProg2().runApp();
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
        printElements(intAry, new NumChecker() {  //Anonymous class
            @Override
            public boolean check(int n) {
                return n > 0;
            }
        });

        System.out.print("Even Elements: ");
        printElements(intAry, new NumChecker() { //Anonymous class
            @Override
            public boolean check(int n) {
                return n %2 == 0;
            }
        });

    }

}

