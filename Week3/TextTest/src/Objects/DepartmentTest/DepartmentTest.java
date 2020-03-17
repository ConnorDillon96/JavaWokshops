package Objects.DepartmentTest;

/**
 * DepartmentTest
 */
public class DepartmentTest {

    public static void main(String[] args) {

        Manager m1 = new Manager("name1");

        Department d1 = new Department("d1", m1);


        System.out.println(d1);
    }
}