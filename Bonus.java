import java.util.Scanner;

public class Bonus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isContinue=true;
        String productName;
        int productStock;



        System.out.print("How many products the store has:");
        int storeNum= scanner.nextInt();


        Product[] store = new Product[storeNum];

        for (int i=0;i<store.length;i++){

            System.out.print("Enter product name:");
            productName=scanner.next();

            System.out.print("Enter product stock:");
            productStock= scanner.nextInt();

            store[i]=new Product(productName,productStock);
        }
        System.out.println("-------------------------------------");

        while (isContinue){
            System.out.println("1-See the store");
            System.out.println("2-Choose 1 item to buy it");
            System.out.println("3-Exit");

            System.out.print("Choose the one option:(1/2/3)");
            int choice= scanner.nextInt();

            switch (choice){
                case 1:
                    for (int i=0;i<store.length;i++){
                        store[i].printInfo();
                    }
                    break;
                case 2:
                    System.out.print("Which product that you want?:");
                    String c=scanner.next();
                    for (int i=0;i<store.length;i++){
                        if (store[i].getName().equals(c)){
                            System.out.println("The item is found");
                            store[i].buyOne();
                        }else{
                            System.out.println("No such product!");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < store.length; i++) {
                         store[i].printInfo();}
                    System.out.println("Program is closing...............");
                    isContinue=false;
                    break;
                default:
                    System.out.println("Enter valid number");
                    break;
            }




        }




    }
}
