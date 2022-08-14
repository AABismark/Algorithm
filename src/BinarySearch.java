public class BinarySearch {
    int [] array;
    public BinarySearch(int[] array){
        this.array = array;
    }
    public int binarySearch(int key, int left, int right){
        int midIndex = left + (right-left) / 2;
        if(right >= left){
            if(array[midIndex] == key ){
                return midIndex;
            }else if(array[midIndex] < key){
                return binarySearch(key, midIndex + 1, right);
            }else  if(array[midIndex] > key ){
                return binarySearch(key, left, midIndex -1);
            }
        }
        return -1;
    }
}
