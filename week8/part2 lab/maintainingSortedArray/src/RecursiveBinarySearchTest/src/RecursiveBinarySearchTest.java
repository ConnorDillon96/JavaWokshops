package RecursiveBinarySearchTest.src;

public class RecursiveBinarySearchTest {

    public static void main(String[] args) {
        Integer arraySize=Input.getInteger("array size: ");
        SortedADT sorted = new SortedArray(arraySize);
        Integer value;
        Integer option;
        do {
            System.out.println("0: quit");
            System.out.println("1: insert");
            System.out.println("2: remove");
            System.out.println("3: find");
            System.out.println("4: display");
            option = Input.getInteger("option: ");
            switch (option) {
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    value=Input.getInteger("value: ");
                    try{
                        sorted.insert(value);
                        System.out.println("inserted");
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("insert invalid - array full");
                    }
                    catch(SortedADT.NotUniqueException e){
                        System.out.println("insert invalid - value not unique");
                    }
                   break;
                case 2:
                    value=Input.getInteger("value: ");
                    try{
                        value=(Integer)sorted.remove(value);
                        System.out.println(value+" removed");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("remove invalid - value not found");
                    }
                    break;
                case 3:
                    value=Input.getInteger("value: ");
                    try{
                        value=(Integer)sorted.find(value);
                        System.out.println(value+" found");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("value not found");
                    }
                    break;
               case 4:
                    System.out.println(sorted);
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 0);
    }
}
