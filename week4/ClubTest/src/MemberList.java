
public class MemberList {

    private Member[] members;
    private Integer numberOfMembers;

    public MemberList(Integer memberListSize) {
        this.members = new Member[memberListSize];
        this.numberOfMembers=0;
    }
    
    public String toString() {
        String memberListDetails = new String();
        if(this.numberOfMembers!=0){
            memberListDetails+=String.format("%-15s%-20s%10s%10s%15s\n","TYPE","NAME","BALANCE","PASSES","DATE OF BIRTH");
            for (Integer member = 0; member < this.numberOfMembers; member++)
                memberListDetails += this.members[member]+"\n";
        }
        else
            memberListDetails+="member list is empty";
        return memberListDetails;
    }

    public void addCorporate(String name, Integer numberOfPasses){
        this.members[this.numberOfMembers]=new Corporate(name,numberOfPasses);
        this.numberOfMembers++;
    }

    public void addIndividual(String name, String dateOfBirth){
        this.members[this.numberOfMembers]=new Individual(name,dateOfBirth);
        this.numberOfMembers++;
    }

    public void makePayment(String name) {
        Member member=this.getMember(name);
        member.makePayment();
    }

    public void makeBooking(String name) {
        Member member=this.getMember(name);
        member.makeBooking();
    }
    
    private Member getMember(String name){
        Member member=null;
        Integer index=0;
        while(member==null)
            if(name.equals(this.members[index].getName()))
                member=this.members[index];
            else
                index++;
        return member;
    }

    public String setUpInvoices() {
        String invoicesString=new String();
        for (Integer member = 0; member < this.numberOfMembers; member++) {
            if (this.members[member] instanceof Corporate) {
                invoicesString+=((Corporate) this.members[member]).setUpInvoice()+"\n";
            }
        }
        if (invoicesString.length()==0)
            invoicesString+="no corporate members";
        return invoicesString;
    }

}
