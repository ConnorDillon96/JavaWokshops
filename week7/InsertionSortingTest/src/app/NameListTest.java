package app;

/**
 * NameListTest
 */
public class NameListTest {

    public static void main(String[] args) {
        int size = Input.getInteger("how many? ");
        NameList nl = new NameList(size);

        do{
            int input = Input.getInteger("1. Add name \n2. sort\n3. display");
            if (input == 1){
                String name = Input.getString("name?");
                nl.addNewName(name);
            }else if(input == 2){
                nl.sort();
                System.out.println("sorted");
            }else if(input == 3){
                System.out.println(nl);
            }else{
                System.out.println("invalid");
            }
        }while(true);
    }
}