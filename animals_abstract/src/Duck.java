public class Duck extends Animal implements IMoveable , IFlyable , ISwimmable{

    public Duck(String name){
        super(name);
    }


    @Override
    public void fly() {
        System.out.println("Ducks can fly");
    }

    @Override
    public void move() {
        System.out.println("Ducks can move");
    }

    @Override
    public void swim() {
        System.out.println("Ducks can swim");
    }
}
