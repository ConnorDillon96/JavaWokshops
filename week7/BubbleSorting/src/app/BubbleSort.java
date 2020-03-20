package app;

import java.util.Arrays;

public class BubbleSort{
    Integer[] integers;


    BubbleSort(Integer[] integers){
        this.integers = integers;
    }

    public static void sort(Integer[] arr){
        int i, j, temp; 
        int n = arr.length;
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = true; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        } 
    }
}