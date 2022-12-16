package uebungstest2.org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer {


    @Override
    public void analyze() {
        int countM = 0;
        int countF = 0;
        int heightM = 0;
        int heightF = 0;
        int averageM = 0;
        int averageF = 0;


        for (Person p : super.getPersons()) {
            if(p.getGender() == 'M') {
                countM++;
                heightM += p.getSize();
            }
            if(p.getGender() == 'F') {
                countF++;
                heightF += p.getSize();
            }
        }

        averageM = heightM / countM;
        averageF = heightF / countF;

        System.out.println("In der Lister existieren "
                + countM +
                " Männer mit einer durchschnittlichen Körpergröße von "
                + averageM + " cm");

        System.out.println("In der Lister existieren "
                + countF +
                " Frauen mit einer durchschnittlichen Körpergröße von "
                + averageF + " cm");
    }
}
