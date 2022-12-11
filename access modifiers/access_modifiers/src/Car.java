public class Car {

    private int engine;
    private int model;
    int enginePower;

    protected String color;
    public int speed;

    Car(){
        this.model = 2020;
        this.enginePower = 300;
        this.speed = 255;
        this.color = "yellow";
    }

    private void print(){
        System.out.println(model);
    }
    public void run(){
        print();
    }
}
