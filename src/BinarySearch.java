public class BinarySearch {


    public static void main(String[] args) {
        int[] array = new int[]{2,4,6,8,9,12,13,14,16,16,17,22,33,44,55,66,77,88,99,100};

        int result = binarySearch(array, 0, array.length, 4);
        System.out.println(array[result]);

        result = binarySearchIterative(array, 4);
        System.out.println(array[result]);


    }


    public static int binarySearch(int[] array, int first, int last, int key){
        int result = 0;
        if(last < first){
            result = -1;
        }

        else {
            int midPos = (first + last) / 2;

            if(array[midPos] == key){
                result = midPos;
            }
            else if (array[midPos] > key){
                result = binarySearch(array, first, midPos-1, key);
            }
            else if (array[midPos] < key){
                result = binarySearch(array, midPos + 1, last, key);
            }
        }
        return result;
    }

    public static int binarySearchIterative(int[] array, int key){

        int low = 0;
        int high = array.length-1;

        while(low <= high){

            int midPos = (low+high)/2;
            int midNum = array[midPos];

            if (midNum == key){
                return midPos;
            }
            else if(midNum > key){
                high = midPos - 1;
            }
            else if(midNum < key){
                low = midPos + 1;
            }
        }

        return -1;






    }
}
