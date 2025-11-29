public class Student {
    public String studentName;
    public int studentAge;

    Student(String name,int age){
        studentName=name;
        studentAge=age;
    }
    public void printStudentInfo(){
        System.out.println(studentName+" "+studentAge);
    }
}
