package uebungstest2.org.campus02.oop;

public class MaxSalaryAnalyzer extends PersonAnalyzer{
    @Override
    public void analyze() {
        int highestSalary = 0;

        for (Person p : super.getPersons()) {
            if (p.getSalary() > highestSalary) {
                highestSalary = p.getSalary();
            }
        }

        for (Person p : super.getPersons()) {
            if (p.getSalary() == highestSalary){
                System.out.println(p + "with the salary " + highestSalary);
            }
        }

    }
}
