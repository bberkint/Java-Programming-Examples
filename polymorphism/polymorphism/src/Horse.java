public class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println(getName() + " kişniyor.");
    }
}
