public class BubbleSort {
    public int[] Sort(int[] Array){
        for (int i = 0; i < Array.length - 1; i++){
            for (int j = 0; j < Array.length - 1 - i; j++) {
                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j + 1];
                    Array[j + 1] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        return Array;
    }
    public static int[] BubblesortOnce(int[] RawArray){
        int[] SortedArray = RawArray.clone();
        for (int j = 0; j < SortedArray.length - 1; j++) {
            if (SortedArray[j] > SortedArray[j + 1]) {
                int temp = SortedArray[j + 1];
                SortedArray[j + 1] = SortedArray[j];
                SortedArray[j] = temp;
            }
        }
        return SortedArray;
    }
}
