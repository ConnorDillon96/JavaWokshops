package EmpoyeeTest;

import java.lang.reflect.Constructor;

/**
 * employee
 */
public class employee {
    int number;
    String name;
    String location;
    int salary;

    public employee(int number, String name, String location, int salary){
        this.number = number;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    /**
     * @param salary the salary to set increase
     */
    public void salaryIncrease(int salary) {
        this.salary += salary;
    }

    /**
     * @param location the location to set
     */
    public Boolean checkLocation(String location) {
        if (this.location.equals(location)){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("number \t:\t" + this.number + "\n" 
        + "name \t:\t" + this.name + "\n"
        + "location \t:\t" + this.salary + "\n"
        + "salary \t:\t" + this.location);
    }

}