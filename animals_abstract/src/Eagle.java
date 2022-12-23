public class Eagle extends Animal implements IFlyable{

public Eagle(String name){
    super(name);
}
    @Override
    public void fly() {
        System.out.println("Eagles can fly");
    }
}
