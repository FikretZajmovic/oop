package week4.people;

public class Student extends Person{

    private int credit = 0;
    public Student(String fullname, String address) {
        super(fullname, address);
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
}
