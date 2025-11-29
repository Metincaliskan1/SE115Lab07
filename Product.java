import java.util.Scanner;

public class Product {
    public Scanner scanner = new Scanner(System.in);
    private String productName;
    private int productStock;


    Product(String name,int stock){
        productName=name;
        productStock=stock;
    }

    public void buyOne(){
        System.out.print("Enter quantity to buy:");
        int productBuy=scanner.nextInt();

        if (productBuy>productStock){
            System.out.println("Not enough stock");
        }
        else {
            productStock=productStock-productBuy;
        }
    }
    public String  getName(){
        return productName;
    }

    public void printInfo(){
        System.out.println("The procut: "+productName+"\nThe stock: "+productStock);
    }



}
