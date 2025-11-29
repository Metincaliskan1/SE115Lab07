import java.util.Scanner;

public class Scenerio2 {


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1234, 0);
        BankAccount account2 = new BankAccount(5678, 0);

        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isContinue = true;
        BankAccount activeAccount = null;

        System.out.println("Banking Program");
        while (isContinue) {

            System.out.print("Which account do you want to enter:(1/2)");
            int c = scanner.nextInt();

            if (c == 1) {
                activeAccount = account1;
            } else if (c == 2) {
                activeAccount = account2;
            }




            System.out.println("1 → Deposit");
            System.out.println("2 → Withdraw");
            System.out.println("3 → Account Details");
            System.out.println("4 → Exit\n");
            System.out.print("Enter your choice:(press Number)");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit:");
                    int deposit = scanner.nextInt();
                    if (deposit < 1) {
                        System.out.println("Enter greater than 0.");
                    } else{
                        activeAccount.deposit(deposit);
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:");
                    int withdraw = scanner.nextInt();

                    activeAccount.withdraw(withdraw);



                    break;
                case 3:
                    activeAccount.accountDetails();

                    System.out.print("Do you want to change the account ıd:(Y/N)");
                    String response = scanner.next().toUpperCase();

                    if (response.equals("Y")) {
                        System.out.println("Enter new ID:");
                        int ıd = scanner.nextInt();
                        activeAccount.editID(ıd);
                        System.out.println("ID has been changed....");
                    }
                    else {continue;};

                    break;
                case 4:
                    System.out.println("Program is closing");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;

            }
        }
    }}





