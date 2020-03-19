package AccountListTest.src;

public class AccountListTest {
    public static void main(String[] args){
        Integer accountListSize=Input.getInteger("account list size: ");
        AccountList accounts=new AccountList(accountListSize);
        Integer number;
        String name;
        Double balance;
        Integer option;
        do{
            System.out.println("0: quit");
            System.out.println("1: add account");
            System.out.println("2: display");
            option=Input.getInteger("option: ");
            switch(option){
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    // add code here
                    number = Input.getInteger("number");
                    name = Input.getString("name");
                    balance = Input.getDouble("balance");
                    Account temp = new Account(number, name, balance);
                    accounts.addAccount(temp);
                   break;
                case 2:
                    System.out.println(accounts);
                    break;
                default:
                    System.out.println("invalid option");
            }
        }while(option!=0);
    }

}
