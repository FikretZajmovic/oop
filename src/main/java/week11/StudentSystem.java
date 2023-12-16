package week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class StudentSystem {
    List<Student> students;
    public StudentSystem(String filename) {
        this.students = readStudents(filename);
    }
    @Override
    public String toString()
    {
        return "Filename: " + "students.csv";
    }
    public List<Student> readStudents(String filename)
    {
        List<Student> students = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());
            for(String line : lines)
            {
                String[] studentParts = line.split(",");
                int ID = Integer.parseInt(studentParts[0]);
                String name = studentParts[1];
                String university = studentParts[2];
                String department = studentParts[3];
                double GPA = Double.parseDouble(studentParts[4]);
                Student student = new Student(ID, name, university, department, GPA);
                students.add(student);
            }
        }
        catch(IOException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
        return students;
    }
    public Optional<Student> getStudentByID(int ID)
    {
        return students.stream()
                .filter(student -> student.studentID() == ID)
                .findFirst();
    }
    public Student getHighestGPAStudent()
    {
        if(students.isEmpty())
        {
            throw new EmptyStudentListException("List is empty");
        }
        return students.stream()
                .max((s1, s2) -> Double.compare(s1.GPA(), s2.GPA()))
                .orElseThrow();
    }
    public Student getLongestNameStudent()
    {
        if(students.isEmpty())
        {
            throw new EmptyStudentListException("List is empty");
        }
        return students.stream()
                .max((s1, s2) -> Integer.compare(s1.name().length(), s2.name().length()))
                .orElseThrow();
    }
    public static void main(String[] args) {
        StudentSystem studentSystem = new StudentSystem("students.csv");
        System.out.println(studentSystem);

        try{
            Optional<Student> findStudent = studentSystem.getStudentByID(10);
            if(findStudent.isPresent())
            {
                System.out.println("This is the student with ID " + 10 + " : " + findStudent.get());
            }
            else{
                throw new StudentNotFoundException("That student is not found");
            }
        }
        catch (StudentNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try{
            Student studentWithHighestGPA = studentSystem.getHighestGPAStudent();
            System.out.println("This students has highest GPA: " + studentWithHighestGPA);
        }
        catch (EmptyStudentListException e)
        {
            System.out.println(e.getMessage());
        }

        try{
            Student studentWithLongestName = studentSystem.getLongestNameStudent();
            System.out.println("This students has longest name: " + studentWithLongestName);
        }
        catch (EmptyStudentListException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
