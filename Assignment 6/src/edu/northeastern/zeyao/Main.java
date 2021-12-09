package edu.northeastern.zeyao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Student Tom  = new Student(001,"Tom",3.14);
        Student Bill = new Student(002,"Bill",3.5);
        Student Lily  = new Student(003,"Lily",2.89);
        Student Mark  = new Student(004,"Mark",3.68);
        Student John  = new Student(005,"John",1.79);
        Student Amy  = new Student(006,"Amy",2.88);
        Student Crystal  = new Student(007,"Crystal",3.8);
        Student Fan  = new Student(101,"Fan",1.3);
        Student Mike  = new Student(102,"Mike",2.5);

        Date dateOfBirthTom = new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-23");
        Date dateOfBirthBill = new SimpleDateFormat("yyyy-MM-dd").parse("1987-05-10");
        Date dateOfBirthLily = new SimpleDateFormat("yyyy-MM-dd").parse("1994-03-05");
        Date dateOfBirthMark = new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-22");
        Date dateOfBirthJohn = new SimpleDateFormat("yyyy-MM-dd").parse("2000-07-08");
        Date dateOfBirthAmy = new SimpleDateFormat("yyyy-MM-dd").parse("2001-04-14");
        Date dateOfBirthCrystal = new SimpleDateFormat("yyyy-MM-dd").parse("1995-11-23");
        Date dateOfBirthFan = new SimpleDateFormat("yyyy-MM-dd").parse("1992-10-10");
        Date dateOfBirthMike = new SimpleDateFormat("yyyy-MM-dd").parse("1993-12-12");

        Tom.setDateOfBirth(dateOfBirthTom);
        Bill.setDateOfBirth(dateOfBirthBill);
        Lily.setDateOfBirth(dateOfBirthLily);
        Mark.setDateOfBirth(dateOfBirthMark);
        John.setDateOfBirth(dateOfBirthJohn);
        Amy.setDateOfBirth(dateOfBirthAmy);
        Crystal.setDateOfBirth(dateOfBirthCrystal);
        Fan.setDateOfBirth(dateOfBirthFan);
        Mike.setDateOfBirth(dateOfBirthMike);

        ArrayList<Student> students = new ArrayList<>();
        students.add(Tom);
        students.add(Bill);
        students.add(Lily);
        students.add(Mark);
        students.add(John);
        students.add(Amy);
        students.add(Crystal);
        students.add(Fan);
        students.add(Mike);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        System.out.println("**************** Name : Ascending **************");
        for (Student student: students) {
            System.out.println(student.getName());
        }

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getGpa().compareTo(s1.getGpa());
            }
        });

        System.out.println("**************** GPA : Descending **************");
        for (Student student: students) {
            System.out.println(student.getName() + "'s GPA : " + student.getGpa());
        }

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getDateOfBirth().compareTo(s2.getDateOfBirth());
            }
        });

        System.out.println("**************** Date of Birth : ascending **************");
        for (Student student: students) {
            System.out.printf(student.getName() + "'s date of birth : " + "%tF%n", student.getDateOfBirth());
        }
    }
}
