
public abstract class Member {

    protected String name;
    protected Integer balance;

    public Member(String name) {
        this.name = name;
        this.balance = 0;
    }
    
    public String toString() {
        String memberDetails = new String();
        if (this instanceof Corporate) {
            memberDetails += String.format("%-15s","Corporate");
        } else {
            memberDetails += String.format("%-15s","Individual");
        }
        memberDetails += String.format("%-20s",this.name);
        memberDetails += String.format("%10d",this.balance);
        return memberDetails;
    }

    public abstract void makeBooking();

    public void makePayment() {
        this.balance = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
}
