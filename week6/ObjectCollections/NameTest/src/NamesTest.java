public class NamesTest{
    public static void main(String[] args){
        // values hard-coded to facilitate testing
        String[] names={"john","mary","andy","beth","chris",
                        "frank","carol","bob","sue","joe"};
        System.out.println("first: "+ getFirstAlphabetically(names));
        System.out.println("last: " + getLastAlphabetically(names));
    }

    public static String getFirstAlphabetically(String[] names) {
        String first = names[0];
        for (String name : names) {
            if (first.compareTo(name) < 0) {
                first = name;
            }
        }
        return first;
    }

    public static String getLastAlphabetically(String[] names) {
        String last = names[0];
        for (String x : names) {
            if(last.compareTo(x) > 0){
                last = x;
            }
        }
        return last;
    }
}
