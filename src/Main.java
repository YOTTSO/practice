import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort Sorting = new BubbleSort();
        int[] RawArray = {7, 5, 3, 1, 2, 4, 6, 8, 9};
        System.out.println(Arrays.toString(Sorting.Sort(RawArray)));
    }
}