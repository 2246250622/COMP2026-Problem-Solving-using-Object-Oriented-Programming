public class IntegerAdder {
    public static void main(String[] args) {
        int []array = new int[9];
        for(int k = 0; k < args.length; k++) {
           array[k] = Integer. parseInt(args[k]);
        }
        int sum=0;
        for (int i = 0; i < array.length; i++){
           sum += array[i];
        }
        System.out.println("Sum: "+sum);
    }
}
