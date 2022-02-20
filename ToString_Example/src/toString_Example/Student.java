package altinciHaftaDers2;

public class Student {
	
	int id;
	String name;
	int midTerm , finalExam;
	
	public Student(int id, String name, int midTerm, int finalExam) {
	
		this.id = id;
		this.name = name;
		this.midTerm = midTerm;
		this.finalExam = finalExam;
	}
	
	public String toString() {
		return name;
	}
	

}
