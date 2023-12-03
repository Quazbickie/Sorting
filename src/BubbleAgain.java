public class BubbleAgain {

    public static void main(String[] args) {
        int[] array = new int[]{23,12,7,3,2,1,5,100,54,66,77,88,57,23,90,63};

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - (i+1); j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }



        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - (i+1); j++){
                if(array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }



    }


}
