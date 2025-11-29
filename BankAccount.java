import java.util.Scanner;

public class BankAccount {
    private int accountID;
    private int balance;
    public Scanner scanner= new Scanner(System.in);

    BankAccount(int ID,int balance){
        accountID=ID;
        this.balance=balance;
    }
    public int setAccountID(int ID){
        return accountID=ID;
    }
    public int setBalance(int balance){
        return this.balance=balance;
    }
    public int getAccountID(){
        return accountID;
    }
    public int getBalance(){
        return balance;
    }
    public void accountDetails(){
        System.out.println("Your ID is:"+accountID);
        System.out.println("Your balance:"+balance);
    }
    public int editID(int ıd){
        return accountID=ıd;
    }
    public int deposit(int num){
        return balance =num+balance;
    }
    public void withdraw(int num){
        if (num>balance){
            System.out.println("You dont have enough money.");
            System.out.println("Do you want to borrow(Y/N)");
            String resp= scanner.next();
            if (resp.equals("Y")) {
                 balance = balance - num;
            } else  {
                System.out.println("The procces was canceled");
            }
        }
        else {
            balance=balance-num;
        }
    }


}
