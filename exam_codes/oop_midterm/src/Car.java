public class Car {
    private int id;
    private int productionYear;
    private int power;
    public static int counter;

    public Car(int id, int productionYear){
        this.id = id;
        this.productionYear = productionYear;
        counter ++;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getProductionYear(){
        return productionYear;
    }

    public int getAge(){
        return 2022 - productionYear;
    }

    public void startAndMove(){
        System.out.println("Car should Start and move!");
    }
    public void stop(){
        System.out.println("Car should Stop!");
    }

    public String toString(){
        return  "id :"+id+"production year:"+productionYear+" Power: "+power;

    }
}
