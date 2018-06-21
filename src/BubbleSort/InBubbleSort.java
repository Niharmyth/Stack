package BubbleSort;

import java.util.Arrays;

public class InBubbleSort {

    static int[] array = {9,8,5,7,2,6,0,1};

    public static void swap (int[] array, int i, int j){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] args) {
        for (int i = 0 ; i < array.length; i++){
            for( int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j+1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        for(int k : array){
            System.out.print(k + ", ");
        }

        System.out.println("P is : "+p);
    }



}
