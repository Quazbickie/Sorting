public class InsertionAgain {

    public static void main(String[] args) {


        int[] array = new int[]{23,12,7,3,2,1,5,100,54,66,77,88,57,23,90,63};

        for(int i = 1; i < array.length; i++){
            int currentValue = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > currentValue){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = currentValue;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }



        for(int i = 1; i < array.length; i ++){

            int cur = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > cur){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = cur;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


    }

}
