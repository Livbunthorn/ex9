package ex9;




import java.text.ParseException;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) throws ParseException, DOBException, DOBException {
        Scanner s = new Scanner(System.in);
        Student student = Student.dataInput();
        System.out.println("\nStudent information:");

        System.out.println(student.Display());







    }
}