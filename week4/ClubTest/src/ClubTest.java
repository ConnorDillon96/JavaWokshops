
public class ClubTest {

    public static void main(String[] args) {
        Integer memberListSize=Input.getInteger("member list size: ");
        MemberList members = new MemberList(memberListSize);
        String memberName;
        Integer option;
        do {
            System.out.println("0: quit");
            System.out.println("1: add member");
            System.out.println("2: make booking");
            System.out.println("3: make payment");
            System.out.println("4: print invoices");
            System.out.println("5: display");
            option = Input.getInteger("option: ");
            switch (option) {
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    System.out.println("1: corporate");
                    System.out.println("2: individual");
                    Integer type = Input.getInteger("membership type: ");
                    String name = Input.getString("name: ");
                    if (type == 1) {
                        Integer numberOfPasses = Input.getInteger("number of passes: ");
                        members.addCorporate(name, numberOfPasses);
                    } else {
                        String dateOfBirth = Input.getString("date of birth: ");
                        members.addIndividual(name, dateOfBirth);
                    }
                    break;
                case 2:
                    memberName=selectMember(members);
                    members.makeBooking(memberName);
                    break;
                case 3:
                    memberName=selectMember(members);
                    members.makePayment(memberName);
                    break;
                case 4:
                    System.out.println(members.setUpInvoices());
                    break;
                case 5:
                    System.out.println(members);
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 0);
    }

    private static String selectMember(MemberList members) {
        String name;
        System.out.println(members);
        name = Input.getString("name: ");
        return name;
    }

}
