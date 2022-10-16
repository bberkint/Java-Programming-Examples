public class student {
    String name;
    String surame;
    int id;
    float mid;
    float fin;

    void displayNameAndScore(student student){
        System.out.println(student.name +"  Mid : " +student.mid + "  Fin : " + student.fin);
    }

     static double getScore(float mid, float fin){
        double average = (mid*0.4) + (fin*0.6);

        return average;
    }
}
