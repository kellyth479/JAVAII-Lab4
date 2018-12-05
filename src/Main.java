public class Main {

    public static void main(String[] args){

        int[] a = {1,3,5,7,9,2,4,6,8};
        System.out.println("Merging: ");
        Functions.mergeSort(a);
        System.out.println("Merged: ");
        Functions.printMe(a);

        int[] b = {1};
        System.out.println("Merging: ");
        Functions.mergeSort(b);
        System.out.println("Merged: ");
        Functions.printMe(b);

        int[] c = {1,1,1,1,4,5,6,7,8,24,24,26,72,2,3,};
        System.out.println("Merging: ");
        Functions.mergeSort(c);
        System.out.println("Merged: ");
        Functions.printMe(c);


//        int idx = Functions.binarySearch(a,4);

    }
}
