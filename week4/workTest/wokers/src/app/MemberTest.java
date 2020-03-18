package app;
public class MemberTest {

    public static void main(String[] args) {
        Member member=new Corporate("Apple",5);
        Corporate corporate=new Corporate("IBM", 10);
        Individual individual=new Individual("Jones", "5/2/1980");
        System.out.println("after initial set up");
        System.out.println("\t"+member);
        System.out.println("\t"+corporate);
        System.out.println("\t"+individual);
        member.makeBooking();
        corporate.makeBooking();
        individual.makeBooking();
        System.out.println("after make booking");
        System.out.println("\t"+member);
        System.out.println("\t"+corporate);
        System.out.println("\t"+individual);
        System.out.println("setup invoice");
        System.out.println("\t"+((Corporate)member).setUpInvoice());
        System.out.println("\t"+corporate.setUpInvoice());
        member.makePayment();
        corporate.makePayment();
        individual.makePayment();
        System.out.println("after make payment");
        System.out.println("\t"+member);
        System.out.println("\t"+corporate);
        System.out.println("\t"+individual);
    }
}
