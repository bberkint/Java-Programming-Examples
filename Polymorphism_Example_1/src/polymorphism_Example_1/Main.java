
package oop9uncuhaftapolymorphism1;


public class Main {

    
    public static void main(String[] args) {
        
        Animal h = new Horse();
        ((Horse)h).walk();
        Animal c = new Cat();
        Animal d = new Dog();
        
        Animal[] animals = {h,c,d};
        for(Animal a : animals)
            a.eat();
        
        
        System.out.println(animals.length);
    }
    
}
