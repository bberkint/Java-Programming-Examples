package yenipaket;

public class Student {
  public   String name;
  public   int id;
   public int midTerm;
   public int finExam;

   public Student(){
       System.out.println("Hello from constructor");
   }

   public Student(String name, int id, int midTerm , int finExam){
        this.name = name;
        this.id = id;
        this.midTerm = midTerm;
        this.finExam = finExam;
   }



    public float getResult(){
        return midTerm*0.4f + finExam*0.6f;
    }
}
