package app;
public abstract class Member {

    protected String name;
    protected Integer balance;

    public Member(String name) {
        this.name = name;
        this.balance = 0;
    }

    public String toString() {
        String memberDetails = new String();
        memberDetails += "name: "+this.name+"\tbalance: "+this.balance;
        return memberDetails;
    }

    public abstract void makeBooking();

    public void makePayment() {
        this.balance = 0;
    }
}
