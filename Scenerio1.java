import java.util.Scanner;

public class Scenerio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name:");
        String name= scanner.nextLine();

        System.out.print("Enter student age:");
        int age= scanner.nextInt();



        Student student1= new Student(name,age);
        student1.printStudentInfo();




    }
}
