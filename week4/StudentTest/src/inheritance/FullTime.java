package inheritance;
/**
 * FullTime
 */
public class FullTime extends Student{
    
    boolean loanIssued;

    public FullTime(String name){
        super(name);
        loanIssued = false;
    }

	/**
     * @param loanIssued the loanIssued to set
     */
    public void setLoanIssued(boolean loanIssued) {
        this.loanIssued = true;
    }

    @Override
    public String toString() {
        return "Name : " + name +
        "\nLoan issued :" + this.loanIssued;
    }


    
}