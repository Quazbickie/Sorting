public class InsertionSort {
    public static void main(String[] args) {
        int[] toSort = new int[]{23,12,7,3,2,1,5,100,54,66,77,88,57,23,90,63};

        for(int i = 1; i < toSort.length; i++){

            int currentValue = toSort[i];
            int j = i-1;

            while(j >= 0 && toSort[j] > currentValue){
                toSort[j+1] = toSort[j];
                j--;
            }

            toSort[j+1] = currentValue;
        }

        for(int i = 0; i < toSort.length; i++){
            System.out.println(toSort[i]);
        }
    }






}
