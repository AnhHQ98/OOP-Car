class Car{
    private String name;
    private Engine engine;
    private Wheel wheel;
    Car(String name, Engine engine, Wheel wheel){
        this.name = name;
        this.engine = engine;
        this.wheel = wheel;
    }
    public void display(){
        System.out.println("Car: " + this.name);
            this.engine.display();
            this.wheel.display();
    }
}
class Engine{
    private String name;
    Engine(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Engine: " + name);
    }
}
class Wheel{
    private String name;
    Wheel(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Wheel: " + name);
    }
}
public class Car{
    public static void main(String[] args){
        Car superCar = new Car("Volvo", new Engine("Diesel"), new Wheel("Circle"));
        superCar.display();
    }
}
