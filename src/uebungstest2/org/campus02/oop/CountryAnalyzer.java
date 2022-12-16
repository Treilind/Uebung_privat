package uebungstest2.org.campus02.oop;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer{

    private HashMap<String, Integer> result = new HashMap<>();

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public void analyze() {

        for (Person p : super.getPersons()) {
            if(this.result.containsKey(p.getCountry())){
                int newAnzahl = this.result.get(p.getCountry());
                newAnzahl++;
                this.result.put(p.getCountry(), newAnzahl);
            }
            else {
                this.result.put(p.getCountry(), 1);
            }
        }
    }
}
