package week4.people;

public class Person {
    private String fullname;
    private String address;
    private int age;
    private String country;

    public Person(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
