# Big O Notation

### Objective
The objective of this project is to understand the Big O Notation, and define which algorithm is better than the other.

### Problem

You have two algorithms with Big O time complexity represented as **[Insertion Sort](/src/SelectionSort.java)** `O(n^2)` and **[Heapsort](/src/HeapSort.java)** `O(n log(n))`.

**Question:**
Which algorithm is better in terms of **time complexity**?
And explain why?


### Implementation
Compare the two algorithms result, and define which algorithm is better, and explain why.

```java
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
```
**Output**
```
Heap Sort
O(n log n)
4 5 6 7 8 9 11 12 13 15 23 26 31 
Selection Sort
O(n^2)
1 3 5 6 7 12 15 16 17 22 23 33 46 
```

<br>

> * **Create a new issue with title "Answer [your-username]" and write your answer.**
> * Create an issue of your questions, If you face any trouble solving the project.
