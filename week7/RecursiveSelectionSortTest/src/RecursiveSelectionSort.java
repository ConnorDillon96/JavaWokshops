
public class RecursiveSelectionSort {

    public static void sort(Comparable[] values) {
        // add code here
        Comparable insertValue;
        Integer size = ArrayUtility.getNumberOfObjects(values);
        int insertion = 0;
        int current = 1 ;
        return sorterHelper(,insertion,current);
    }

    // add private methods here
    public static void sorterHelper(Compareable[] values, int insertion,int current){
        boolean insertionFound = false;
        if(values[current].compareTo(values[insertion]) < 0 ){
            insertionFound = true;
            insertion = values[current];
            return sort(values);
        }
    }
    
}
