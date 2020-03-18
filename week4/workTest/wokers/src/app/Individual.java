package app;
public class Individual extends Member {

    private String dateOfBirth;

    public Individual(String name,String dateOfBirth) {
        super(name);
        final Integer INDIVIDUAL_MEMBERSHIP_FEE = 50;
        this.balance = INDIVIDUAL_MEMBERSHIP_FEE;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        String individualDetails = new String();
        individualDetails += super.toString();
        individualDetails += "\tdate of birth: "+this.dateOfBirth;
        return individualDetails;
    }

    public void makeBooking() {
        final Integer INDIVIDUAL_CHARGE = 2;
        this.balance += INDIVIDUAL_CHARGE;
    }
}
