package week4.people;

import java.util.ArrayList;

public class Student extends Person{
    private int credit = 0;
    private int studentID;
    private ArrayList<Integer> grades;

    public Student(String fullname, String address) {
        super(fullname, address);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void study()
    {
        credit++;
    }
    public int credits()
    {
        return credit;
    }
    @Override
    public String toString()
    {
        return this.getFullname() + "\n" + "  " + this.getAddress();
    }

    public void addGrade(int grade)
    {
        grades.add(grade);
    }
}
