package week10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int ID;
    private List<Integer> grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void printInfo()
    {
        System.out.println(this.getName() + ", " + this.getID() + ", " + this.getGrades());
    }
}

class GradeAnalyzer{
    private List <Integer> grades;
    public GradeAnalyzer(List<Integer> grades)
    {
        this.grades = grades;
    }

    public double calculateAverage(List<Integer> grades)
    {
        if(grades.isEmpty())
        {
            return 0.0;
        }

        double sum = 0;
        for(Double grade : grades)
        {
            sum += grade;
        }
        return (double) sum/grades.size();
    }

    public void printSummary() {
        System.out.println("Grade Summary:");
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage(grades));
    }
}

class Start {
    public static void main(String[] args) {
        // Instantiate a GradeAnalyzer object with a list of grades
        List<Integer> gradesList = new ArrayList<>();
        gradesList.add(90);
        gradesList.add(85);
        gradesList.add(92);

        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(gradesList);

        // Use reflection to access and print field names and values of the GradeAnalyzer class
        Class<?> gradeAnalyzerClass = gradeAnalyzer.getClass();
        Field[] fields = gradeAnalyzerClass.getDeclaredFields();

        System.out.println("GradeAnalyzer Fields:");
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ": " + field.get(gradeAnalyzer));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        // Iterate through declared methods and invoke those whose names start with "calculate" or "print"
        Method[] methods = gradeAnalyzerClass.getDeclaredMethods();

        System.out.println("\nInvoking relevant methods:");
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                method.setAccessible(true);
                try {
                    Object result = method.invoke(gradeAnalyzer);
                    System.out.println(method.getName() + ": " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



