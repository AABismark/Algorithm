public class SelectionSort {
    int [] base;
    public SelectionSort(int[] base){
        this.base = base;
    }
    public int [] selectionSort(){
        for (int n =0; n < base.length -1; n++){
            int nmin = n;
            for(int k = n + 1; k < base.length; k++){
                if(base[nmin] > base[k]){
                    nmin = k;
                }
            }
            int temp = base[nmin];
            base[nmin]= base[n];
            base[n] = temp;
        }
        return  base;
    }
}
