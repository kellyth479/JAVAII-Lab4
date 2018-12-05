import java.util.Arrays;

public class Functions {

    public static void mergeSort(int[] data){

        mergeSort(data, 0, data.length - 1);
    }

    public static void mergeSort(int[] data, int beginning, int ending){
        if(beginning < ending){
            int middle = (ending + beginning)/2;
            mergeSort(data, beginning, middle);
            mergeSort(data, middle + 1, ending);
            merge(data, beginning, middle, ending);
        }
    }

    private static void merge(int[] data, int beginning, int middle, int ending){

        int leftSize = middle - beginning + 1;
        int rightSize = ending - middle;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for(int i = 0;i<left.length;i++){
            left[i] = data[beginning + i];
        }

        for(int i = 0;i < right.length;i++){
            right[i] = data[middle + 1 + i];
        }

        int leftTrace = 0;
        int rightTrace = 0;
        int mergeTrace = beginning;
        //compare left and right array members, add smallest to data
        while(leftTrace < leftSize && rightTrace < rightSize){
            if (left[leftTrace] <= right[rightTrace]){
                data[mergeTrace] = left[leftTrace];
                leftTrace += 1;
            }else{
                data[mergeTrace] = right[rightTrace];
                rightTrace += 1;
            }
            mergeTrace += 1;
        }
        //move any remainder elements from left to data
        while(leftTrace < leftSize){
            data[mergeTrace] = left[leftTrace];
            leftTrace += 1;
            mergeTrace += 1;
        }
        //move any remainder elements from right to data
        while(rightTrace < rightSize){
            data[mergeTrace] = right[rightTrace];
            rightTrace +=1;
            mergeTrace += 1;
        }
    }

    public static int binarySearch(int[]data, int key){

        return binarySearch(data, key, 0, data.length-1);
    }

    public static int binarySearch(int[]data, int key, int beginning, int ending){

        if(beginning > ending){
            return -1 ;
        }

        int middle = (beginning + ending)/2;
        if(data[middle] == key){
//            System.out.print("Middle: ");
//            System.out.println(middle);
//            System.out.print("data[Middle]: ");
//            System.out.println(data[middle]);
            return middle;
        }else if(key < data[middle]){
            return binarySearch(data, key, beginning, middle - 1);
        }else{
            return binarySearch(data, key, middle + 1, ending);
        }

    }

    public static void printMe(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print("Index[" + i + "] : ");
            System.out.println(data[i]);
        }
    }


}
