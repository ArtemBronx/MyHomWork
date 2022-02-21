package com.company;

public class ClassWork5 {


    public static void main(String[] args) {

        /*int[] array = new int[]{1,2,3,4,5};
        int a = sum(array);
        System.out.println(a);

    }

    public static int sum(int[]array123){
        int sum =0;
        for (int i = 0; i <array123.length ; i++) {
            sum +=array123[i];

        }
        return sum; */

      /*  int[] array = new int[]{1, 2, 3};
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{1, 2,};
        int[] array3 = new int[]{5};
        int[] array4 = new int[]{1, 2, 0, 7, 6, 9, 6, 4};
        System.out.println(Arrays.toString(concatenation(array, array1, array2, array3, array4)));
    }
    public static int [] concatenation (int[]...args){
        int lenght =0;

        for (int i = 0; i < args.length ; i++) {
            lenght += args[i].length;
        }
        int[] array= new int[lenght];

        for (int i = 0,k =0 ; i < args.length; i++) {
            for (int j = 0; j < args[i].length ; j++,k++) {
                array[k]= args[i][j];

            }
        }
        return array;
    }

       */
       /* int[] array = new int[]{1, 2, 3};
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{1, 2,};
        int[] array3 = new int[]{5};

        print(array);
        print(array1);
        print(array2);
        print(array3);
    }

    public static void print (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
        System.out.println();
    }
    */


        int[] array = new int[]{1, 2, 3};


    }
    public static void  prntl (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[0];
            int max = array[0];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];

            }
            System.out.println(min);
            System.out.println(max);
        }
    }
}

