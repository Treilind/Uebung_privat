package uebungstest2.org.campus02.oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer {

    private ArrayList<Pair<Person, Double>> result;

    public BMIAnalyzer() {
        result = new ArrayList<>();
    }

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    private double calcBMI(Person p){
        return p.getWeight() / ((p.getSize() / 100.0) * (p.getSize() / 100.0));
    }


    @Override
    public void analyze() {
        for (Person p : super.getPersons()) {
            double bmi = calcBMI(p);
            Pair<Person, Double> bmiPair = new Pair<>(p, bmi);
            result.add(bmiPair);
        }
    }
}
