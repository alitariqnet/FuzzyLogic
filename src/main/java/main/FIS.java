package main;

public class FIS {
	
	Fuzzifier fuzz = new Fuzzifier();
	Defuzzifier defuzz = new Defuzzifier();
	
	public void initFISRules() {
		
		// for first low
		// for second low
		if(fuzz.env.low==true && fuzz.food.low==true && fuzz.serv.low==true) {
			defuzz.low = true;
			defuzz.lowV = AND(AND(fuzz.env.lowV,fuzz.food.lowV),fuzz.serv.lowV);
			System.out.println("Rule 1");
		}
		
		if(fuzz.env.low==true && fuzz.food.low==true && fuzz.serv.med==true) {
			defuzz.low = true;
			defuzz.lowV = AND(AND(fuzz.env.lowV,fuzz.food.lowV),fuzz.serv.medV);
			System.out.println("Rule 2");
		}
		
		if(fuzz.env.low==true && fuzz.food.low==true && fuzz.serv.high==true) {
			defuzz.low = true;
			defuzz.lowV = AND(AND(fuzz.env.lowV,fuzz.food.lowV),fuzz.serv.highV);
			System.out.println("Rule 3");
		}
		
		//for second medium
		if(fuzz.env.low==true && fuzz.food.med==true && fuzz.serv.low==true) {
			defuzz.low = true;
			defuzz.lowV = AND(AND(fuzz.env.lowV,fuzz.food.medV),fuzz.serv.lowV);
			System.out.println("Rule 4");
		}
		
		if(fuzz.env.low==true && fuzz.food.med==true && fuzz.serv.med==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.lowV,fuzz.food.medV),fuzz.serv.medV);
			System.out.println("Rule 5");
		}
		
		if(fuzz.env.low==true && fuzz.food.med==true && fuzz.serv.high==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.lowV,fuzz.food.medV),fuzz.serv.highV);
			System.out.println("Rule 6");
		}
		
		// for second high
		if(fuzz.env.low==true && fuzz.food.high==true && fuzz.serv.low==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.lowV,fuzz.food.highV),fuzz.serv.lowV);
			System.out.println("Rule 7");
		}
		
		if(fuzz.env.low==true && fuzz.food.high==true && fuzz.serv.med==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.lowV,fuzz.food.highV),fuzz.serv.medV);
			System.out.println("Rule 8");
		}
		
		if(fuzz.env.low==true && fuzz.food.high==true && fuzz.serv.high==true) {
			defuzz.high = true;
			defuzz.highV = AND(AND(fuzz.env.lowV,fuzz.food.highV),fuzz.serv.highV);
			System.out.println("Rule 9");
		}
		
		//for first medium
		// for second low
		if(fuzz.env.med==true && fuzz.food.low==true && fuzz.serv.low==true) {
			defuzz.low = true;
			defuzz.lowV = AND(AND(fuzz.env.medV,fuzz.food.lowV),fuzz.serv.lowV);
			System.out.println("Rule 10");
		}
		
		if(fuzz.env.med==true && fuzz.food.low==true && fuzz.serv.med==true) {
			defuzz.low = true;
			defuzz.lowV = AND(AND(fuzz.env.medV,fuzz.food.lowV),fuzz.serv.medV);
			System.out.println("Rule 11");
		}
		
		if(fuzz.env.med==true && fuzz.food.low==true && fuzz.serv.high==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.medV,fuzz.food.lowV),fuzz.serv.highV);
			System.out.println("Rule 12");
		}
		
		//for second medium
		if(fuzz.env.med==true && fuzz.food.med==true && fuzz.serv.low==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.medV,fuzz.food.medV),fuzz.serv.lowV);
			System.out.println("Rule 13");
		}
		
		if(fuzz.env.med==true && fuzz.food.med==true && fuzz.serv.med==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.medV,fuzz.food.medV),fuzz.serv.medV);
			System.out.println("Rule 14");
		}
		
		if(fuzz.env.med==true && fuzz.food.med==true && fuzz.serv.high==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.medV,fuzz.food.medV),fuzz.serv.highV);
			System.out.println("Rule 15");
		}
		
		// for second high
		if(fuzz.env.med==true && fuzz.food.high==true && fuzz.serv.low==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.medV,fuzz.food.highV),fuzz.serv.lowV);
			System.out.println("Rule 16");
		}
		
		if(fuzz.env.med==true && fuzz.food.high==true && fuzz.serv.med==true) {
			defuzz.high = true;
			defuzz.highV = AND(AND(fuzz.env.medV,fuzz.food.highV),fuzz.serv.medV);
			System.out.println("Rule 17");
		}
		
		if(fuzz.env.med==true && fuzz.food.high==true && fuzz.serv.high==true) {
			defuzz.high = true;
			defuzz.highV = AND(AND(fuzz.env.medV,fuzz.food.highV),fuzz.serv.highV);
			System.out.println("Rule 18");
		}
		
		// for first high
		// for second low
		if(fuzz.env.high==true && fuzz.food.low==true && fuzz.serv.low==true) {
			defuzz.low = true;
			defuzz.lowV = AND(AND(fuzz.env.highV,fuzz.food.lowV),fuzz.serv.lowV);
			System.out.println("Rule 19");
		}
		
		if(fuzz.env.high==true && fuzz.food.low==true && fuzz.serv.med==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.highV,fuzz.food.lowV),fuzz.serv.medV);
			System.out.println("Rule 20");
		}
		
		if(fuzz.env.high==true && fuzz.food.low==true && fuzz.serv.high==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.highV,fuzz.food.lowV),fuzz.serv.highV);
			System.out.println("Rule 21");
		}
		
		//for second medium
		if(fuzz.env.high==true && fuzz.food.med==true && fuzz.serv.low==true) {
			defuzz.med = true;
			defuzz.medV = AND(AND(fuzz.env.lowV,fuzz.food.lowV),fuzz.serv.lowV);
			System.out.println("Rule 22");
		}
		
		if(fuzz.env.high==true && fuzz.food.med==true && fuzz.serv.med==true) {
			defuzz.high = true;
			defuzz.highV = AND(AND(fuzz.env.lowV,fuzz.food.lowV),fuzz.serv.lowV);
			System.out.println("Rule 23");
		}
		
		if(fuzz.env.high==true && fuzz.food.med==true && fuzz.serv.high==true) {
			defuzz.high = true;
			defuzz.highV = AND(AND(fuzz.env.highV,fuzz.food.medV),fuzz.serv.highV);
			System.out.println("Rule 24");
		}
		
		// for second high
		if(fuzz.env.high==true && fuzz.food.high==true && fuzz.serv.low==true) {
			defuzz.high = true;
			defuzz.highV = AND(AND(fuzz.env.highV,fuzz.food.highV),fuzz.serv.lowV);
			System.out.println("Rule 25");
		}
		
		if(fuzz.env.high==true && fuzz.food.high==true && fuzz.serv.med==true) {
			defuzz.high = true;
			defuzz.highV = AND(AND(fuzz.env.highV,fuzz.food.highV),fuzz.serv.medV);
			System.out.println("Rule 26");
		}
		
		if(fuzz.env.high==true && fuzz.food.high==true && fuzz.serv.high==true) {
			defuzz.high = true;
			defuzz.highV = AND(AND(fuzz.env.highV,fuzz.food.highV),fuzz.serv.highV);
			System.out.println("Rule 27");
		}
	}

	public static float AND(float a, float b) {
		if(a<b)
			return a;
		else 
			return b;
	}
	
	public static float OR(float a, float b) {
		if(a>b)
			return a;
		else 
			return b;
	}
}
