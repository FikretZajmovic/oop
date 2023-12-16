package week11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

class StudentSystemTest {
    private StudentSystem studentSystem;

    @BeforeEach
    void setUp() {
        studentSystem = new StudentSystem("students.csv");
    }

    @Test
    void testifStudentisPresent() {
        List<Student> students = studentSystem.readStudents("students.csv");
        assertFalse(students.isEmpty(), "There should be at least one student in the file.");
    }

    @Test
    void testStudentWithId100() {
        int studentIdToFind = 100;
        Optional<Student> foundStudent = studentSystem.getStudentByID(studentIdToFind);
        assertFalse(foundStudent.isPresent(), "Student with ID 100 should be present.");
    }

    @Test
    void testStudentNull() {
        Student student = new Student(1, "John", "University", "Department", 3.5);
        assertNotNull(student, "Student should not be null.");
    }

    @Test
    void testHighestGPAStudent() {
        Student highestGPAStudent = studentSystem.getHighestGPAStudent();
        assertNotNull(highestGPAStudent, "There should be a student with the highest GPA.");
    }

    @Test
    void testExceptionForEmptyStudentList() {
        StudentSystem emptyStudentSystem = new StudentSystem("empty.csv");
        assertThrows(EmptyStudentListException.class, () -> emptyStudentSystem.getHighestGPAStudent(),
                "Exception should be thrown for an empty student list.");
    }

    @Test
    void testNamesArray() {
        String[] expectedNames = {"Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson"};
        String[] actualNames = studentSystem.students.stream()
                .limit(5)
                .map(Student::name)
                .toArray(String[]::new);
        assertArrayEquals(expectedNames, actualNames, "First five names should match expected names.");
    }

    @Test
    void testSize() {
        List<Student> students = studentSystem.readStudents("students.csv");
        assertEquals(70, students.size(), "The size of the file should be equal to 70.");
    }

    @Test
    void testLargestName() {
        List<Student> students = studentSystem.readStudents("students.csv");
        Student studentWithLargestName = students.stream()
                .max((s1, s2) -> Integer.compare(s1.name().length(), s2.name().length()))
                .orElse(null);

        assertNotEquals("Ava White", studentWithLargestName.name(), "Largest name should not be Ava White.");
    }

    @Test
    void testStudents() {
        Student studentWithHighestGPA = studentSystem.getHighestGPAStudent();
        Student studentWithLongestName = studentSystem.getLongestNameStudent();

        assertNotSame(studentWithHighestGPA, studentWithLongestName,
                "Student with the highest GPA should not be the same as the student with the longest name.");
    }

    @Test
    void testSameStudent() {
        int studentIdToFind = 12;
        Optional<Student> studentById = studentSystem.getStudentByID(studentIdToFind);
        Student studentWithHighestGPA = studentSystem.getHighestGPAStudent();

        assertTrue(studentById.isPresent(), "Student with ID 12 should be present.");
        assertSame(studentById.get(), studentWithHighestGPA,
                "Student with the highest GPA should be the same as the student with ID 12.");
    }
}