package uebungstest2.org.campus02.oop;

import java.util.ArrayList;

public abstract class PersonAnalyzer  {

    private ArrayList<Person> persons;

    public PersonAnalyzer() {
        persons = new ArrayList<>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public abstract void analyze();
}
