public class MergeSort {

    public void partition(int [] array){
        if(array.length < 2){
            return;}
        int midIndex = array.length / 2;
        int [] leftHand = new int[midIndex];
        int [] rightHand = new int[array.length - midIndex];
        for(int i = 0; i < midIndex; i++){
            leftHand[i] = array[i];
        }
        for(int i = midIndex; i < array.length; i++){
            rightHand[i - midIndex] = array[i];
        }
        partition(leftHand);
        partition(rightHand);
        merge(array, leftHand, rightHand);
    }
    public  void merge(int[] array, int[] leftHand, int[] rightHand){
        int i = 0;
        int j = 0;
        int k= 0;
        while (j < leftHand.length && k < rightHand.length){
            if(leftHand[j] >= rightHand[k]){
                array[i] = rightHand[k];
                k++;
            }else if(leftHand[j] < rightHand[k]) {
                array[i] = leftHand[j];
                j++;
            }
            i++;
        }
        while (j < leftHand.length){
            array[i] = leftHand[j];
            j++;
            i++;
        }
        while (k < rightHand.length){
            array[i] = rightHand[k];
            k++;
            i++;
        }
    }
}
