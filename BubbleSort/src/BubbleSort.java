public class BubbleSort {
    public static void main(String[] args) {
    int[] array = {38, 65, 3, 17, 2};
    System.out.println("Array before sorting:");
     printArray(array);

     bubbleSort(array);

     System.out.println("\nArray after sorting:");
     printArray(array);
 }
    public static void bubbleSort(int[] array) {
    int n = array.length;
            for (int i = 0; i < n-1; i++) {
                   for (int j = 0; j < n-i-1; j++) {
                          if (array[j] > array[j+1]) {
                                System.out.println("i value is"+ i + " and j value is " + j);
                                  int temp = array[j];
                                  array[j] = array[j+1];
                                  array[j+1] = temp;
                   }
                   }
            }
}
 
 public static void printArray(int[] array) {
     System.out.println();
 }
}