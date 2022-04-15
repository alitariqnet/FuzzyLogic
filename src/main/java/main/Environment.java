package main;

public class Environment {
	// use these in forming rules
		boolean low = false;
		boolean med = false;
		boolean high = false;
		
		// use these to get the calculated values
		float lowV ;
		float medV;
		float highV;
		
		public boolean isLow() {
			return low;
		}
		
		public void setLow(boolean low) {
			this.low = low;
		}
		
		public boolean isMed() {
			return med;
		}
		
		public void setMed(boolean med) {
			this.med = med;
		}
		
		public boolean isHigh() {
			return high;
		}
		
		public void setHigh(boolean high) {
			this.high = high;
		}
		
	// calculate the membership function values
	public void init(float f) {
		
		if(f>=0&&f<=4) {
			lowV=(4-f)/(4-0);
			if(f!=4)
			low=true;
			
			medV=0;
			highV=0;
		}
		if(f>=1&&f<=5) {
			medV=(f-1)/(5-1);
			if(f!=1)
			med=true;
			
			highV=0;
		}
		if(f>=5&&f<=9) {
			lowV=0;
			medV=(9-f)/(9-5);
			if(f!=9)
			med=true;
		}
		if(f>=6&&f<=10) {
			highV=(f-6)/(10-6);
			if(f!=6)
			high=true;
		}
	}

	@Override
	public String toString() {
		return "Environment [low=" + low + ", med=" + med + ", high=" + high + ", lowV=" + lowV + ", medV=" + medV
				+ ", highV=" + highV + "]";
	}
	
}
