package week4.people;

public class Teacher extends Person {

    private int salary;

    public Teacher(String fullname, String address, int salary) {
        super(fullname, address);
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return this.getFullname() + "\n" + "  " + this.getAddress() + "\n" + "  " + this.salary + "euros/month";
    }
}
