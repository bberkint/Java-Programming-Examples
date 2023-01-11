public class Zoo {
    public Animal[] animals;
    public Zoo(Animal[] animals){
        this.animals = animals;
    }

    public void printAnimals(){
        for (Animal animal:animals ) {
            System.out.println(animal);
        }
    }
}
