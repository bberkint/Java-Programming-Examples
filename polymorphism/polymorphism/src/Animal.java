public class Animal {
    private  String name;
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println("Hayvan konuşuyor");
    }
}
