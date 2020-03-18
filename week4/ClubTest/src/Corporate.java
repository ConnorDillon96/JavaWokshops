
public class Corporate extends Member {

    private Integer numberOfPasses;

    public Corporate(String name,Integer numberOfPasses) {
        super(name);
        final int CORPORATE_MEMBERSHIP_FEE = 200;
        final int FEE_PER_PASS = 10;
        this.numberOfPasses = numberOfPasses;
        this.balance = CORPORATE_MEMBERSHIP_FEE + (this.numberOfPasses * FEE_PER_PASS);
    }

    public String toString() {
        String corporateDetails = new String();
        corporateDetails += super.toString();
        corporateDetails += String.format("%10d",this.numberOfPasses);
        return corporateDetails;
    }

    public String setUpInvoice() {
        return this.name+ " amount due: "+this.balance;
    }

    public void makeBooking() {
        final Integer CORPORATE_CHARGE = 4;
        this.balance += CORPORATE_CHARGE;
    }

}
