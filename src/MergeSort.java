public class MergeSort {


    public static void main(String[] args) {
        int[] array = new int[]{23,12,7,3,2,1,5,100,54,66,77,88,57,23,90,63};

        MergeSort(array);
    }

    public static void MergeSort(int[] array){

        int inputLength = array.length;

        if(inputLength < 2) return;

        int midIndex = inputLength / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[inputLength - midIndex];

        for(int i = 0; i < midIndex; i++){
            leftArray[i] = array[i];
        }
        for(int i = midIndex; i < inputLength; i++){
            rightArray[i-midIndex] = array[i];
        }

        MergeSort(leftArray);
        MergeSort(rightArray);

        merge(array, leftArray, rightArray);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray){

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < rightSize){
            array[k] = rightArray[j];
            j++;
            k++;
        }




        for(int l = 0; l < array.length; l++){
            System.out.println(array[l]);
        }


    }









}
