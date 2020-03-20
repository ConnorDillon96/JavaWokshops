package app;

/**
 * Name
 */
public class Name implements Comparable<Name>{

    String name;

    Name(String name){
        this.name = name;
    }

    public int compareTo(Name o){
        if (this.name.compareTo(o.getName()) == 0){
            return 0;
        }else if (this.name.compareTo(o.getName()) > 0){
            return 1;
        }else{
            return -1;
        }
        
    }



    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}