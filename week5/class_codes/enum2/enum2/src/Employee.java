public class Employee {
    private int id;
    private String name;

    Employee(int id , String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public int getId(){
        return id;
    }
}
