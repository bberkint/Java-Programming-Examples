public class Main {
    public static void main(String[] args) {
        Animal eagle = new Eagle("Black Eagle");
        //((Eagle) eagle).fly();
        Animal duck = new Duck("Duffy Duck");
        //((Duck)duck).swim();
        Animal cat = new Cat("Tom");

        Animal[] animals = {eagle , cat , duck};

        for (Animal animal:animals) {
            if (animal instanceof IFlyable){
                ((IFlyable)animal).fly();
            }
        }
    }
}