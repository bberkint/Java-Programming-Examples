
package oop8incihaftadersinheritance;


public class Dog extends Animal{
    String breed; 

    public Dog(String color, String breed) {
        super(color);
        this.breed = breed;
    }
        
    public void bark(){
        System.out.println("Hav hav hav !");
    } 
    
}
