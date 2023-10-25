package week4.people;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printDepartment(List<Person> people) {
        for(Person person: people)
        {
            System.out.println(person.getFullname());
        }
    }

    public static void main(String[] args) {

        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa"); // Person class
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);


        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"); // Student class
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits " + olli.credits());


        Teacher Pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200); // Teacher class
        Teacher Esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( Pekka );
        System.out.println( Esko );
        Student Olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            Olli.study();
        }
        System.out.println( olli );
        System.out.println("  credits " + olli.credits());


        List<Person> people = new ArrayList<Person>(); // printDepartment method
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
        printDepartment(people);

    }
}
