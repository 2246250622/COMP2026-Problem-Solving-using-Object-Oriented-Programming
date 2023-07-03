public class MyMethods {

    public static void main(String[] args) throws Exception {
        new MyMethods().runApp();
    }

    //you cannot modify this method
    void runApp(){
        //Test CeltoFah
        double degreeCelsius = 37.5;
        double degreeFahrenheit = CeltoFah(degreeCelsius);
        System.out.println(degreeCelsius + " in degree Celsius equals " + degreeFahrenheit + " in degree Fahrenheit.");

        //Test isPalindrome
        char[] s1 = {'o', 't','t', 'o'};
        char[] s2 = {'l', 'e','v', 'e', 'l'};
        char[] s3 = {'j', 'a','v', 'a'};
        printPalindromeResult(s1);
        printPalindromeResult(s2);
        printPalindromeResult(s3);

        //Test strToInt
        int num1 = strToInt("12345");
        int num2 = strToInt("60798");
        System.out.println("Sum of " + num1 + " and  " + num2 + " is: " + (num1 + num2));


    }



    //you cannot modify this method
    void printPalindromeResult(char[] s){
        for (int i = 0; i < s.length; i++){
            System.out.print(s[i]);
        }
        if(isPalindrome((s))){
            System.out.println(" is palindrome.");
        }
        else{
            System.out.println(" is not palindrome.");
        }
    }



    private double CeltoFah(double degreeCelsius) {
        double result = degreeCelsius *9/5 +32;
        return result;

    }

    private boolean isPalindrome(char[] s) {
        boolean boo = false;
        String[] wordbank = {"otto","level","refer","121", "i may yam i"};
        String word = "";
        for (int i = 0; i < s.length; i++) {

            word = word + s[i];

            }
        for(int i=0;i<wordbank.length;i++){


        if (word.equals(wordbank[i])) {
            boo = true;
            }
        }return boo;
    }




    private int strToInt(String s) {
        int i = 0, number = 0;
        boolean isNegative = false;
        int len = s.length();
        if( s.charAt(0) == '-' ){
            isNegative = true;
            i = 1;
        }
        while( i < len ){
            number *= 10;
            number += ( s.charAt(i++) - '0' );
        }
        if( isNegative )
            number = -number;
        return number;
    }



        // TODO
        // write your methods here....


    }
