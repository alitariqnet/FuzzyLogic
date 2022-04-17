package main;

//import java.text.DateFormat.Field;
//import java.util.List;

public class FIS {

//	public int inputParameters;
//	public int maxNumberOfRules=1;
//	List<String> namesOfInputParameters;
//	
//	public int getInputParameters() {
//		return inputParameters;
//	}
//	public void setInputParameters(int inputParameters) {
//		this.inputParameters = inputParameters;
//	}
//	public int getMaxNumberOfRules() {
//		return maxNumberOfRules;
//	}
//	public void setMaxNumberOfRules(int maxNumberOfRules) {
//		this.maxNumberOfRules = maxNumberOfRules;
//	}
//	public List<String> getNamesOfInputParameters() {
//		return namesOfInputParameters;
//	}
//	public void setNamesOfInputParameters(List<String> namesOfInputParameters) {
//		this.namesOfInputParameters = namesOfInputParameters;
//	}
//	
//	public void generateRules() {
//		for(int i =0;i<inputParameters;i++) {
//			maxNumberOfRules = 3 * maxNumberOfRules;
//		}
//		System.out.println("Number of rules is: "+maxNumberOfRules);
//		
//		
//	}
	
	Fuzzifier fuzz = new Fuzzifier();
	Defuzzifier defuzz = new Defuzzifier();
	
	public static void main(String[] args) {
		
//		fuzz.input.env.init(3);
//		fuzz.input.food.init(8);
//		fuzz.input.serv.init(5);
//		Output o = new Output();
		
//		initFISRules(f,dF.o);
//		System.out.println(dF.o.toString());
//		System.out.println("crisp value is "+dF.defuzzification());
	}
	
	public void initFISRules(Fuzzifier f, Output o) {
		System.out.println(fuzz.input.env.toString());
		System.out.println(fuzz.input.food.toString());
		System.out.println(fuzz.input.serv.toString());
		
		// for first low
		// for second low
		if(fuzz.input.env.low==true && fuzz.input.food.low==true && fuzz.input.serv.low==true) {
			o.low = true;
			o.lowV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.lowV),fuzz.input.serv.lowV);
			System.out.println("inside 1");
		}
		
		if(fuzz.input.env.low==true && fuzz.input.food.low==true && fuzz.input.serv.med==true) {
			o.low = true;
			o.lowV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.lowV),fuzz.input.serv.medV);
			System.out.println("inside 2");
		}
		
		if(fuzz.input.env.low==true && fuzz.input.food.low==true && fuzz.input.serv.high==true) {
			o.low = true;
			o.lowV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.lowV),fuzz.input.serv.highV);
			System.out.println("inside 3");
		}
		
		//for second medium
		if(fuzz.input.env.low==true && fuzz.input.food.med==true && fuzz.input.serv.low==true) {
			o.low = true;
			o.lowV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.medV),fuzz.input.serv.lowV);
			System.out.println("inside 4");
		}
		
		if(fuzz.input.env.low==true && fuzz.input.food.med==true && fuzz.input.serv.med==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.medV),fuzz.input.serv.medV);
			System.out.println("inside 5");
		}
		
		if(fuzz.input.env.low==true && fuzz.input.food.med==true && fuzz.input.serv.high==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.medV),fuzz.input.serv.highV);
			System.out.println("inside 6");
		}
		
		// for second high
		if(fuzz.input.env.low==true && fuzz.input.food.high==true && fuzz.input.serv.low==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.highV),fuzz.input.serv.lowV);
			System.out.println("inside 7");
		}
		
		if(fuzz.input.env.low==true && fuzz.input.food.high==true && fuzz.input.serv.med==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.highV),fuzz.input.serv.medV);
			System.out.println("inside 8");
		}
		
		if(fuzz.input.env.low==true && fuzz.input.food.high==true && fuzz.input.serv.high==true) {
			o.high = true;
			o.highV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.highV),fuzz.input.serv.highV);
			System.out.println("inside 9");
		}
		
		//for first medium
		// for second low
		if(fuzz.input.env.med==true && fuzz.input.food.low==true && fuzz.input.serv.low==true) {
			o.low = true;
			o.lowV = AND(AND(fuzz.input.env.medV,fuzz.input.food.lowV),fuzz.input.serv.lowV);
			System.out.println("inside 10");
		}
		
		if(fuzz.input.env.med==true && fuzz.input.food.low==true && fuzz.input.serv.med==true) {
			o.low = true;
			o.lowV = AND(AND(fuzz.input.env.medV,fuzz.input.food.lowV),fuzz.input.serv.medV);
			System.out.println("inside 11");
		}
		
		if(fuzz.input.env.med==true && fuzz.input.food.low==true && fuzz.input.serv.high==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.medV,fuzz.input.food.lowV),fuzz.input.serv.highV);
			System.out.println("inside 12");
		}
		
		//for second medium
		if(fuzz.input.env.med==true && fuzz.input.food.med==true && fuzz.input.serv.low==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.medV,fuzz.input.food.medV),fuzz.input.serv.lowV);
			System.out.println("inside 13");
		}
		
		if(fuzz.input.env.med==true && fuzz.input.food.med==true && fuzz.input.serv.med==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.medV,fuzz.input.food.medV),fuzz.input.serv.medV);
			System.out.println("inside 14");
		}
		
		if(fuzz.input.env.med==true && fuzz.input.food.med==true && fuzz.input.serv.high==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.medV,fuzz.input.food.medV),fuzz.input.serv.highV);
			System.out.println("inside 15");
		}
		
		// for second high
		if(fuzz.input.env.med==true && fuzz.input.food.high==true && fuzz.input.serv.low==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.medV,fuzz.input.food.highV),fuzz.input.serv.lowV);
			System.out.println("inside 16");
		}
		
		if(fuzz.input.env.med==true && fuzz.input.food.high==true && fuzz.input.serv.med==true) {
			o.high = true;
			o.highV = AND(AND(fuzz.input.env.medV,fuzz.input.food.highV),fuzz.input.serv.medV);
			System.out.println("inside 17");
		}
		
		if(fuzz.input.env.med==true && fuzz.input.food.high==true && fuzz.input.serv.high==true) {
			o.high = true;
			o.highV = AND(AND(fuzz.input.env.medV,fuzz.input.food.highV),fuzz.input.serv.highV);
			System.out.println("inside 18");
		}
		
		// for first high
		// for second low
		if(fuzz.input.env.high==true && fuzz.input.food.low==true && fuzz.input.serv.low==true) {
			o.low = true;
			o.lowV = AND(AND(fuzz.input.env.highV,fuzz.input.food.lowV),fuzz.input.serv.lowV);
			System.out.println("inside 19");
		}
		
		if(fuzz.input.env.high==true && fuzz.input.food.low==true && fuzz.input.serv.med==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.highV,fuzz.input.food.lowV),fuzz.input.serv.medV);
			System.out.println("inside 20");
		}
		
		if(fuzz.input.env.high==true && fuzz.input.food.low==true && fuzz.input.serv.high==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.highV,fuzz.input.food.lowV),fuzz.input.serv.highV);
			System.out.println("inside 21");
		}
		
		//for second medium
		if(fuzz.input.env.high==true && fuzz.input.food.med==true && fuzz.input.serv.low==true) {
			o.med = true;
			o.medV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.lowV),fuzz.input.serv.lowV);
			System.out.println("inside 22");
		}
		
		if(fuzz.input.env.high==true && fuzz.input.food.med==true && fuzz.input.serv.med==true) {
			o.high = true;
			o.highV = AND(AND(fuzz.input.env.lowV,fuzz.input.food.lowV),fuzz.input.serv.lowV);
			System.out.println("inside 23");
		}
		
		if(fuzz.input.env.high==true && fuzz.input.food.med==true && fuzz.input.serv.high==true) {
			o.high = true;
			o.highV = AND(AND(fuzz.input.env.highV,fuzz.input.food.medV),fuzz.input.serv.highV);
			System.out.println("inside 24");
		}
		
		// for second high
		if(fuzz.input.env.high==true && fuzz.input.food.high==true && fuzz.input.serv.low==true) {
			o.high = true;
			o.highV = AND(AND(fuzz.input.env.highV,fuzz.input.food.highV),fuzz.input.serv.lowV);
			System.out.println("inside 25");
		}
		
		if(fuzz.input.env.high==true && fuzz.input.food.high==true && fuzz.input.serv.med==true) {
			o.high = true;
			o.highV = AND(AND(fuzz.input.env.highV,fuzz.input.food.highV),fuzz.input.serv.medV);
			System.out.println("inside 26");
		}
		
		if(fuzz.input.env.high==true && fuzz.input.food.high==true && fuzz.input.serv.high==true) {
			o.high = true;
			o.highV = AND(AND(fuzz.input.env.highV,fuzz.input.food.highV),fuzz.input.serv.highV);
			System.out.println("inside 27");
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
