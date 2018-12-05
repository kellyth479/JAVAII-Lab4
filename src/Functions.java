public class Functions {

    public static void mergeSort(int[] data){
        if (data.length <= 1){
            return;
        }

        int middle = data.length/2;
        int [] left = new int[middle];
        int [] right;

        if(data.length % 2 == 0){
            right = new int[middle];
        }else{
            right = new int[middle + 1];
        }

        for(int i = 0; i < middle; i++){
            left[i] = data[i];
        }

        for(int i = 0; i < middle; i++){
            right[i] = data[middle + i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right);
    }

    public static int binarySearch(int[]data, int key){


        return key;
    }

    private static int[] merge(int[] left, int[] right){

        int [] mergedArray = new int[left.length + right.length];

        int leftTrace = 0;
        int rightTrace = 0;
        int mergeTrace = 0;

        while(leftTrace < left.length && rightTrace < right.length){

            if(left[leftTrace] <= right[rightTrace]){
                mergedArray[mergeTrace] = left[leftTrace];
                mergeTrace =+ mergeTrace;
                leftTrace =+ leftTrace;
            }else{
                mergedArray[mergeTrace] = right[rightTrace];
                mergeTrace =+ mergeTrace;
                rightTrace =+ rightTrace;
            }


        }



        return mergedArray;
    }


}
