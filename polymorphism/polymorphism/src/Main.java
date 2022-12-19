public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Hayvan");
        Animal bird = new Bird("Limon");
        Animal dog = new Dog("Karabaş");
        Animal horse = new Horse("Beyazıt");

        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();

    }
}