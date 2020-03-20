package app;

public class ArrayUtility {

    public static void display(Object[] values) {
        /* can be used to output array contents where the component object has a toString method
           will output every slot in the array including empty slots which will be output as null
         */
        for (Object value : values) {
            System.out.print(value + "  ");
        }
        System.out.println();
    }

    public static Integer getNumberOfObjects(Object[] objects) {
        Integer index = 0;
        for (Object object : objects) {
            if (object == null){

            }else{
                index++;
            }
            
        }
        return index;
    }
}
