package besinciHaftaNestedClasses;

public class Main {
	
	enum Day{
		MON, 
		TUE,
		WED,
		THU,
		FRI,
		SAT,
		SUN
	}

	public static void main(String[] args) {
		      
		Day[] days = Day.values();
		for (Day d : days) {
			System.out.println(d);
		}

	}

}
