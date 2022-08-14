public class InsertionSort {
    int [] array;
    public  InsertionSort(int [] array){
        this.array= array;
    }
    public  int [] insertionSort(){
        for(int i = 1; i < array.length; i++){
            int holeIndex = i;
            int holeValue = array[i];
            while(holeIndex > 0 && holeValue < array[holeIndex - 1 ] ){
                array[holeIndex] = array[holeIndex -1];
                holeIndex --;
            }
            array[holeIndex] = holeValue;
        }
        return array;
    }
}
