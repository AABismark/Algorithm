import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        System.out.println("\n Before :");
        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            int number = rand.nextInt(100);
            array[i] = number;
            System.out.println(number);
        }
        HeapSort heapsort = new HeapSort();
        heapsort.sort(array);
        //BubbleSort bubblesort = new BubbleSort();
        //bubblesort.bubbleSort(array);
        //QuickSort quickSort = new QuickSort();
        //quickSort.sort(array, 0, array.length - 1);
        //LinearSearch linearSearch = new LinearSearch(array);
        //int key = linearSearch.linearSearch(8);
        // System.out.println(key);
        // BinarySearch binarySearch = new BinarySearch(array);
        //int key = binarySearch.binarySearch(3, 0, array.length -1);
        //System.out.println(key);
        //System.out.println("\n After:");
        //MergeSort mergeSort = new MergeSort();
        //mergeSort.partition(array);
        for (int i = 0; array.length > i; i++) {

            System.out.println(array[i]);
        }
    }
}