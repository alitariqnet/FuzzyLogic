package main;

public class Runner {

	@SuppressWarnings({ "null", "static-access" })
	public static void main(String[] args) {
		
		// create new instance of FIS
		FIS fis = new FIS();
		
		// set values for service, food and environment
		fis.fuzz.env.init(1.27f);
		fis.fuzz.food.init(9.5f);
		fis.fuzz.serv.init(1.14f);
		
		// fire rule-base
		fis.initFISRules();
		
		System.out.println(fis.defuzz.toString());
		System.out.println("crisp value is "+fis.defuzz.defuzzification());
	}

}
