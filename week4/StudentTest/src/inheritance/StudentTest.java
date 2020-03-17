package inheritance;

/**
 * StudentTest
 */
public class StudentTest {

    public static void main(String[] args) {
        PartTime partTime = new PartTime("Tom", 2);
        FullTime fullTime = new FullTime("Dick");
        Student student = (Student) new FullTime("Harry");

        System.out.println(partTime);
        System.out.println(fullTime);
        System.out.println(student);
        fullTime.setLoanIssued(true);
        System.out.println(fullTime);
    }
}