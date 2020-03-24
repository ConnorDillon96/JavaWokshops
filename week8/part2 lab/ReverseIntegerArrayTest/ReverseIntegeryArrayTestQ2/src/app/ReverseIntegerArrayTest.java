package app;

public class ReverseIntegerArrayTest {

    public static void main(String[] args) throws Exception{
        ReversedADT sorted = new ReversedArray(5);
        sorted.insert(3);
        sorted.insert(5);
        sorted.insert(6);
        sorted.insert(7);
        sorted.insert(8);
        ReversedADT reversed=sorted.reverse();
        System.out.println("sorted\n"+sorted);
        System.out.println("reversed\n"+reversed);
    }
}
