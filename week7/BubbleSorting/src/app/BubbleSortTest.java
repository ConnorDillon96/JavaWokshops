package app;

public class BubbleSortTest {

    public static void main(String[] args) {
        Integer[] integers = {25, 15, 45, 5, 40, 50, 10, 20, 35, 30};
        ArrayUtility.display(integers);
        BubbleSort.sort(integers);
        ArrayUtility.display(integers);
    }
}
