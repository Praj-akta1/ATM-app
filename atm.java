import java.util.*;
public class atm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();

        Customer c1 = new Customer("nmarata", 23456, 7000, 30000, 6789);
        Customer c2 = new Customer("priyanka", 34567, 10000, 50000, 3456);
        Customer c3 = new Customer("prajakta", 123456, 6000, 30000, 2122);
        Customer c4 = new Customer("bhagya", 45678, 8000, 50000, 1090);

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        System.out.println("Welcome");
        Customer currentuser = new Customer();
        System.out.println("insert card no.:");
        try {
            int CardNo = sc.nextInt();
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).cardno == CardNo) {
                    currentuser = customers.get(i);
                }
            }
            if (currentuser == null) {
                System.out.println("Card not recognized. Try again");
            }
        } catch (Exception e) {
            System.out.println("Card not recognized. Try again");
        }
        System.out.println("Welcome" + currentuser.GetName());
        do {
            System.out.println("Select the option");
            System.out.println("1.Deposite");
            System.out.println("2.withdraw");
            System.out.println("3.check balance");
            System.out.println("4.Exit");
            int option = 0;
            try 
            {
                option = sc.nextInt();
            } 
            catch (Exception e) {

                System.out.println("Incorrect option.");
            }
            Transaction tc = new Transaction();
            switch (option) {
                case 1:
                    tc.Deposite(currentuser);
                    break;

                case 2:
                    tc.withdraw(currentuser);
                    break;

                case 3:
                    tc.AccountBal(currentuser);
                    break;

                case 4:
                    System.out.println("Thank you");
                    return;
            }
        } while (true);
    }
}
