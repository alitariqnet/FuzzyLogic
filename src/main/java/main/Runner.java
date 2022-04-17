package main;

public class Runner {

	@SuppressWarnings({ "null", "static-access" })
	public static void main(String[] args) {

		FIS fis = new FIS();
		fis.fuzz.input.env.init(1.27f);
		fis.fuzz.input.food.init(9.5f);
		fis.fuzz.input.serv.init(1.14f);
		
		fis.initFISRules(fis.fuzz,fis.defuzz.output);
		
		System.out.println(fis.defuzz.output.toString());
		System.out.println("crisp value is "+fis.defuzz.defuzzification());
	}

}
