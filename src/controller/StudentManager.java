package controller;

import java.util.ArrayList;
import model.Book;
import model.Student;
import model.Admin;

public class StudentManager {

    private static StudentManager studentManager;
    public static ArrayList<Student> listStudents = new ArrayList<>();

    private StudentManager() {
    }

    public static StudentManager getStudentManager() {
        if (studentManager == null) {
            studentManager = new StudentManager();
        }
        return studentManager;
    }

    public boolean addStudent(Student student) {
        if (student == null) {
            return false;
        }
        listStudents.add(student);
        return true;
    }

    public ArrayList<String> getBorrowedBookOfStudent(String studentID) {
        for (Student student : listStudents) {
            if (student.getID().equalsIgnoreCase(studentID)) {
                return student.getBorrowBooks();
            }
        }
        return null;
    }

    public boolean isStudentExist(String studentID) {
        for (Student student : listStudents) {
            if (student.getID().equalsIgnoreCase(studentID)) {
                return true;
            }
        }
        return false;
    }

    public boolean borrowBook(String studentID, String bookName) {
        for (Student student : listStudents) {
            if (student.getID().equalsIgnoreCase(studentID)) {
                return student.borrowBook(bookName);

            }
        }
        return false;
    }

    public boolean giveBackBook(String studentID, String bookName) {
        for (Student student : listStudents) {
            if (student.getID().equalsIgnoreCase(studentID)) {
                return student.giveBackBook(bookName);
            }
        }
        return false;
    }

}
