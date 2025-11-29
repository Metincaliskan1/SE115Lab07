public class Scenerio3 {
    public static void main(String[] args) {
        Book book1= new Book("BOOK1",20);

       Book book2 =book1;

       book2.addPages();

       book1.printBook();
       book2.printBook();
       //The two book is updated because we didnt create new object.
        Book book3= new Book("BOOK1",40);

        if(book1 ==book3){
            System.out.println("Same objects");
        }else {
            System.out.println("Different objects");
        }

        if (book1.pages==book3.pages&&book1.title==book3.title){
            System.out.println("Field values are true.");
        }else {
            System.out.println("Field values are false.");
        }








    }
}
