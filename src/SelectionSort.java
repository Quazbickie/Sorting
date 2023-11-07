public class SelectionSort {
    public static void main(String[] args) {
        int[] toSort = new int[]{23,12,7,3,2,1,5,100,54,66,77,88,57,23,90,63};

        for (int i = 0; i < toSort.length; i++){
            int lowestIdx = i;

            for(int j = i+1; j < toSort.length; j++){
                if(toSort[lowestIdx] > toSort[j]){
                    lowestIdx = j;
                }
            }

            int temp = toSort[i];
            toSort[i] = toSort[lowestIdx];
            toSort[lowestIdx] = temp;
        }

        for(int i = 0; i < toSort.length; i++){
            System.out.println(toSort[i]);
        }
    }
}
