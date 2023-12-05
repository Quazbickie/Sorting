public class BinarySearchAgain {


    public static void main(String[] args) {
        int[] array = new int[]{2,4,6,8,9,12,13,14,16,16,17,22,33,44,55,66,77,88,99,100};
        boolean result = bs(array, 0, array.length, 3);
        System.out.println(result);



    }

    public static boolean bs(int[] array, int low, int high, int key){
        boolean result = false;

        if (high < low){
            result = false;
        }

        else {
            int midPoint = (high + low) / 2;

            if (array[midPoint] == key) {
                result = true;
            } else if (array[midPoint] > key) {
                result = bs(array, 0, midPoint - 1, key);
            } else if (array[midPoint] < key) {
                result = bs(array, midPoint + 1, high, key);
            }
        }

        return result;
    }


}
