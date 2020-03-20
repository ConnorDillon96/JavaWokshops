
public class IntegerArrayTest {

    public static void main(String[] args) {
        Integer[] numbers={5, 6, 3, 7, 8};
        IntegerArray integers = new IntegerArray(numbers);
        System.out.println(integers);
        System.out.println("total: "+integers.getTotal());
    }
}
