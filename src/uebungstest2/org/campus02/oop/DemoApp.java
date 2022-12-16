package uebungstest2.org.campus02.oop;

public class DemoApp {

	public static void main(String[] args) {
		PersonManager pM = new PersonManager();


		for (int i = 0; i < 100; i++) {
			pM.add(createTestPerson());
		}


		GenderAnalyzer gA = new GenderAnalyzer();
		CountryAnalyzer cA = new CountryAnalyzer();
		MaxSalaryAnalyzer mSA = new MaxSalaryAnalyzer();
		BMIAnalyzer bmiA = new BMIAnalyzer();

		gA.setPersons(pM.getPersons());
		cA.setPersons(pM.getPersons());
		mSA.setPersons(pM.getPersons());
		bmiA.setPersons(pM.getPersons());

		gA.analyze();
		System.out.println();
		cA.analyze();
		System.out.println(cA.getResult());
		System.out.println();
		mSA.analyze();
		System.out.println();
		bmiA.analyze();
		System.out.println(bmiA.getResult());



	}
	
	
	public static Person createTestPerson()
	{
		String[] firstnames = new String[] {"John", "Max", "Susi", "Georg", "Gerald", "Michael", "Steve", "J�rg", "Sebastian", "Louis", "Thomas", "Tom", "Sandra", "Beate", "Birgit"};
		String[] lastnames = new String[] {"Muster", "Doe", "Schultz", "Cuevas", "Rhodes", "Mckenzie", "Taylor", "Glenn", "Reilly", "Morris", "Herman", "Beltran", "Swanson", "Roth"};
		String[] eyeColors = new String[] {"blau", "braun", "grün", "gelb"};
		String[] countries = new String[] {"AT", "DE", "CH", "SI"};
		char[] genders = new char[] {'M', 'F'};
		
		Person p = new Person(
				getRandom(firstnames), getRandom(lastnames), 
				getRandom(genders), 
				(int) (Math.random()* 100.0), 
				getRandom(countries), (int) (Math.random() * 5900) + 1000, 
				getRandom(eyeColors), (int) (Math.random() * 50) + 50,
				(int)(Math.random() * 50) + 160);
		
		
	
		return p;
	}
	
	public static String getRandom(String[] arr)
	{
		return arr[(int) (Math.random() * 100.0) % arr.length];
	}
	
	public static char getRandom(char[] arr)
	{
		return arr[(int) (Math.random() * 100) % arr.length];		
	}
	
}
