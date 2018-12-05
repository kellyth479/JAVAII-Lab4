public class Main {

    public static void main(String[] args){

        int[] a = {1,3,5,7,9,2,4,6,8};
        System.out.println("Merging A: ");
        Functions.mergeSort(a);
        System.out.println("A Merged: ");
        Functions.printMe(a);

        int idx = Functions.binarySearch(a,4);
        System.out.print("Found 4 at index: ");
        System.out.println(idx);

        int[] b = {1};
        System.out.println("Merging B:");
        Functions.mergeSort(b);
        System.out.println("B Merged: ");
        Functions.printMe(b);

        int idxb = Functions.binarySearch(b,2);
        System.out.print("Found 2 at index: ");
        System.out.println(idxb);
        System.out.println(" ");

        int[] c = {1,1,1,1,4,5,6,7,8,24,24,26,72,2,3,};
        System.out.println("Merging C: ");
        Functions.mergeSort(c);
        System.out.println("C Merged: ");
        Functions.printMe(c);

        int idx2 = Functions.binarySearch(c,7);
        System.out.print("Found 7 at index: ");
        System.out.println(idx2);
        System.out.println(" ");

        int[] d = {1,1,1,1,4,1,1,1,1,5,1,1,1,1,99,7,8,24,24,26,72,2,3,};
        System.out.println("Merging D: ");
        Functions.mergeSort(d);
        System.out.println("D Merged: ");
        Functions.printMe(d);

        int idx3 = Functions.binarySearch(d,99);
        System.out.print("Found 99 at index: ");
        System.out.println(idx3);
        System.out.println(" ");

        int[] e = {1,1,1,1,4,1,1,1,1,5,1,1,1,1,99,7,8,24,24,26,72,2,3,};
        System.out.println("Merging E: ");
        Functions.mergeSort(e);
        System.out.println("E Merged: ");
        Functions.printMe(e);

        int idx4 = Functions.binarySearch(d,100);
        System.out.print("Found 100 at index: ");
        System.out.println(idx4);
        System.out.println(" ");
    }
}
