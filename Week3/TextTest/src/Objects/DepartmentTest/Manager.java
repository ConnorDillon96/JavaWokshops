package Objects.DepartmentTest;

/**
 * Manager
 */
public class Manager {
    String name;

    public Manager(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}