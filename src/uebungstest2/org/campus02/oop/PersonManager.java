package uebungstest2.org.campus02.oop;

import java.util.ArrayList;

public class PersonManager {

    private ArrayList<Person> persons;

    public PersonManager() {
        persons = new ArrayList<>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void add(Person p) {
        persons.add(p);
    }

    public void doAnalysis(PersonAnalyzer a) {
        a.setPersons(persons);
        a.analyze();
    }
}
