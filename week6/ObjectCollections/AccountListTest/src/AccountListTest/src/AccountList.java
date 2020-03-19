package AccountListTest.src;

/**
 * AccountList
 */
public class AccountList {

    Account[] accountList;
    int count = 0;

    AccountList(int size){
        this.accountList = new Account[size];

    }

    public void addAccount(Account otherAccount){
        accountList[count] = otherAccount;
        count ++;
    }

    @Override
    public String toString() {
        String accountDetails = "NUMBER\tNAME\t\t\tBALANCE\n";
        for (Account account : accountList) {
            if (account != null){
                accountDetails += account.toString();
            }
            
        }
        return accountDetails;
    }
}