public class Garage {
    private Car[] cars;

    public Garage(Car[] cars){
        this.cars = cars;
    }

    public void printCarsOlderThan(int age){
        for(Car c:cars)
            if(c.getAge()>age)
                System.out.println(c);
    }
}
