public class Merging {

    public static void main(String[] args) {

        new Merging().runApp();
    }


    void runApp() {

        int[] a = {1, 6, 11, 12};
        int[] b = {3, 5, 7, 9, 10};
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int z = 0;


        while (i<a.length && j<b.length){
            if(a[i]< b[j]){
                c[z] = a[i];
                i++;
                z++;
            }else{
                c[z] = b[j];
            z++;
            j++;

        }}
        for (int k = i;k < a.length; k++){
            c[z++] = a[k];
            i++;
        }
        for (int k = j;k < b.length; k++){
            c[z++] = a[k];
            j++;
        }

        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k]+" ");
        }





    }

    }
