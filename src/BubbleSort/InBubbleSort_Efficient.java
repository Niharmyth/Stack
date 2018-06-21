package BubbleSort;

public class InBubbleSort_Efficient {
    int[] array = {9,8,5,7,2,6,0,1};

    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void sort(int[] array){
        boolean isSorted = false;
        int unSorted = array.length - 1;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < unSorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            unSorted--;
        }
    }

    @Override
    public String toString(){
        String result = "";
        for(int k = 0; k < array.length ; k++)
            result += array[k] + ",";

        return result;
    }

    public static void main(String[] args) {

        InBubbleSort_Efficient bubble = new InBubbleSort_Efficient();
        bubble.sort(bubble.array);

        System.out.println(bubble);
    }

}
