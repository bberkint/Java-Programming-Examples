public class Cat extends Animal implements ISwimmable,IMoveable{

    public Cat(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Cats can move");
    }

    @Override
    public void swim() {
        System.out.println("Cats can swim");
    }
}
