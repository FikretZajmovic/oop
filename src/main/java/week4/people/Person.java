package week4.people;

public class Person {
    private String fullname;
    private String address;

    public Person(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString()
    {
        return this.getFullname() + "\n" + "  " + this.getAddress();
    }
}
