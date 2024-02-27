public class Main {
    public static void main(String[] args) {

        int[] arrayOne = { 12, 11, 13, 5, 6, 7, 9, 15, 23, 4, 8, 26, 31 };
        int[] arrayTwo = { 15, 3, 6, 5, 22, 7, 46, 12, 23, 1, 17, 16, 33 };

        HeapSort algorithmOne = new HeapSort();

        // O(n log n)
        algorithmOne.heapSort(arrayOne);

        System.out.println("Heap Sort");
        System.out.println("O(n log n)");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " ");
        }

        SelectionSort algorithmTwo = new SelectionSort();
        // O(n^2)
        algorithmTwo.selectionSort(arrayTwo);

        System.out.println("\nSelection Sort");
        System.out.println("O(n^2)");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + " ");
        }
    }
}
