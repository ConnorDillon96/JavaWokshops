package EmployeeListTest.src;

/**
 * EmployeeList
 */
public class EmployeeList {
    Employee[] employees;
    int count = 0;

    public EmployeeList(int size) {
        this.employees = new Employee[size];
    }

    public void addEmployee(int number, String name, String location, int salary) {
        Employee otherEmployee = new Employee(number, name, location, salary);
        employees[count] = otherEmployee;
        count++;
    }

    public void increaseEmployeeSalary(int number, int salarayIncrease) {
        for (Employee employee : employees) {
            if (employee == (null)) {
            } else {
                if (employee.getNumber().equals(number)) {
                    employee.increaseSalary(salarayIncrease);
                }
            }
        }
    }

    public String getFromLocation(String location) {
        String locationAll = "";
        for (Employee employee : employees) {
            if (employee == null) {

            } else {
                if (employee.getLocation().equals(location)) {
                    locationAll += employee;
                }
            }
        }
        return locationAll;

    }

    @Override
    public String toString() {
        String details = "";
        for (Employee employee : employees) {
            if (employee == null){

            }else{
                details += employee.toString() + "\n";

            }
            
        }
        return details;
    }

}