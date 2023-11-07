public class BubbleSort {

    public static void main(String[] args) {
        int[] toSort = new int[]{23,12,7,3,2,1,5,100,54,66,77,88,57,23,90,63};

        for(int i = 0; i < toSort.length-1; i++){
            for(int j = 0; j < toSort.length-1 - i; j++){
                if(toSort[j+1] < toSort[j]){
                    int temp = toSort[j];
                    toSort[j] = toSort[j+1];
                    toSort[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < toSort.length; i++){
            System.out.println(toSort[i]);
        }

    }

}
