public class LinearSearch {
    int[] array;
    public LinearSearch(int[] array){
        this.array = array;
    }
    public int linearSearch(int key){
        for(int i =0; i < array.length; i++){
            if(array[i] == key){
                return  i;
            }
        }
        return  -1;
    }
}
