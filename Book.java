import java.util.Scanner;

public class Book {
    public Scanner scanner = new Scanner(System.in);
    public String title;
    public int pages;


    Book(String name,int pageNum){
        title=name;
        pages=pageNum;
    }

    public int addPages(){
        System.out.print("Enter page number you want to add:");
        int Num=scanner.nextInt();

        return pages=Num+pages;
    }
    public void printBook(){
        System.out.println("The book name: "+title);
        System.out.println("The book pages: "+pages);
    }




}
