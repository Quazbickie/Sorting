public class SelectionAgain {


    public static void main(String[] args) {


        int[] array = new int[]{23,12,7,3,2,1,5,100,54,66,77,88,57,23,90,63};

        for(int i = 0; i < array.length; i++){

            int minIdx = i;

            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[minIdx]){
                    minIdx = j;
                }
            }

            int smallest = array[minIdx];
            array[minIdx] = array[i];
            array[i] = smallest;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }



        for(int i = 0; i < array.length; i++){
            int minIdx = i;

            for(int j = i +1; j < array.length; j++){
                if(array[j] < array[minIdx]){
                    minIdx = j;
                }
            }

            int smallest = array[minIdx];
            array[minIdx] = array[i];
            array[i] = smallest;


        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }




}
