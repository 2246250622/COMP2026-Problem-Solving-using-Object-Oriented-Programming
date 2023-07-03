import java.util.*;
public class ArrayEx {
    public static void main(String[] args){
        int []input = new int[9];
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 9 integers: ");
        for(int i = 0; i < 9; i++){
            input[i] = in.nextInt();
        }

        System.out.print("Every element at an even index: ");
        for(int k = 0; k < input.length; k++){
            if(k%2 == 0){
                System.out.print(input[k]+" ");
            }
        }
        System.out.println();
        System.out.print("Every even element : ");
        for(int j = 0; j < input.length; j++){
            if(input[j]%2 == 0){
                System.out.print(input[j]+" ");
            }
        }


        System.out.println();
        System.out.print("At all elements in reverse order: ");
        for(int h = input.length - 1; h >= 0; h--){

                System.out.print(input[h]+" ");
            }


        System.out.println();
        System.out.print("Alternating sum: ");
        for(int g = 0; g < input.length; g++){
            if (g%2==0){
                sum += input[g];
            }
            if (g%2!= 0 ){
                sum -= input[g];
            }
        }
        System.out.print(sum);
    }

        }

