
package oop8incihaftadersinheritance;


public class Cat extends Animal{
    int age;

    public Cat(String color, int age) {
        super(color);
        this.age = age;
    }
    
    public void meuww(){      
        System.out.println("Meuuuuuwww!");
    }
    
    void test(){
        super.eat();
        super.color = "purple";
    }
    
}
