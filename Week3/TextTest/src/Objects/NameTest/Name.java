package Objects.NameTest;

/**
 * Name
 */
public class Name implements Comparable<Name>{

    String forename;
    String surname;

    public Name(String forename, String surname){
        this.forename =  forename;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object otherObject) {
        return (this.forename.equals(((Name) otherObject).forename) && this.surname.equals(((Name)otherObject).surname));
    }

    @Override
    public int compareTo(Name o) {
        int result = this.surname.compareToIgnoreCase(o.surname);
        if (result == 0) {
            result = this.forename.compareToIgnoreCase(o.forename);
        }
        return result;
    }

    @Override
    public String toString() {
        return (this.forename + " " + this.surname);
    }
}