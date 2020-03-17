package Objects.DepartmentTest;

/**
 * Department
 */
public class Department {
    String name;
    Manager manager;

    public Department(String name, Manager manager){
        this.name = name; 
        this.manager = manager;
    }

    @Override
    public String toString() {
        return ("Name : " + this.name + "\n"
         + "Manager : " + this.manager);
    }
}
