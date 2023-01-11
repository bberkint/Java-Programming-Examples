public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(1,2022);
        Car car2 = new Car(2,2006);
        Car car3 = new Car(3,2007);
        Car car4 = new Car(4,2008);
        Car[] cars = {car1 , car2 , car3, car4};
        Garage garage = new Garage(cars);
        car2.setPower(500);
        garage.printCarsOlderThan(1);
        System.out.println(Car.counter);


    }
}