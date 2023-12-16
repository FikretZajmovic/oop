package week11;

record Student (int studentID, String name, String university, String department, double GPA) {
    @Override
    public String toString()
    {
        return  this.name;
    }
}

class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String message)
    {
        super(message);
    }
}

class EmptyStudentListException extends RuntimeException{
    public EmptyStudentListException(String message)
    {
        super(message);
    }
}