import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// System That Student Attendance
// It Shows Attend Details
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Attendance System");

        Scanner read = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        do
        {
            System.out.println("Select Your Choice: \n 1. New Registration.\n " +
                    "2. Attend Details.\n 3. Exit");
            int choice = read.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Your Name: ");
                    String name = read.next();
                    students.add(new Student(name));
                    System.out.println("Registered " + name + " for Attendance");
                }
                case 2 -> {
                    System.out.println("Attendance Details");
                    for (Student s : students) {
                        System.out.println(s.studentName + " : " + (s.isPresent ? " Present" : "Absent"));
                    }
                }
                case 3 -> System.out.println("Existing");
                default -> System.out.println("Invalid Choice. Please Select 1, 2, or 3");
            }
        }while (true);
        


////        String id;
////        String name;
////        System.out.println("Please Enter Your ID: ");
////        id = read.next();
////        System.out.println("Enter Your Name: ");
//
//        Student s = new Student("11","mm");
//        if(choice == 1)
//        {
//            s.studentEntry();
//            List<Student> students = new ArrayList<>();
//            students.add(s);
//
//        } else if (choice == 2) {
//            s.displayAttend();
//        }


    }
}
class Student{
    String studentName;
    boolean isPresent;
    Student( String n){
        studentName = n;
        isPresent = false;
    }
//    void studentEntry(){
//        Scanner read = new Scanner(System.in);
//
//        System.out.println("New Registration");
//        System.out.println("Enter Your Name: ");
//        studentID = read.next();
//        System.out.println("Enter Your Name: ");
//        //studentName = read.next();
//
//    }
//
//    void displayAttend(){
//
//        for (String name : studentName) {
//            System.out.println("Student :"+studentID+" is Attended");
//        }
//    }

}