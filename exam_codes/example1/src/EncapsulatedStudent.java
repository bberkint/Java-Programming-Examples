import java.util.concurrent.RecursiveTask;

public class EncapsulatedStudent {
    private int midterm;
    private int finExam;

    public void setMidterm(int midterm){
        if (midterm >  0 && midterm < 100 )
            this.midterm = midterm;
    }

    public void setFinExam(int finExam){
        if (finExam >  0 && finExam < 100 )
            this.finExam = finExam;
    }

    public int getMidterm(){
        return midterm;
    }

    public double getAverage(){
        double avg = midterm *0.4 + finExam *0.6;
        return avg;
    }

    public String toString(){
        return "Midterm : " + midterm + " Final : " + finExam;
    }
}
