import java.sql.SQLOutput;

public class Car {

    public static void main(String[] args){
        Car myCar = new Car();
        myCar.drive();
        myCar.light();
        myCar.mirror();
        myCar.speed();

    }
    public void drive(){
        System.out.println("This is my car.");
    }
    public void light(){
        System.out.println("My car has a New Light.");
    }
    public void mirror(){
        System.out.println("I have a rear view mirror.");
    }
    public void speed(){
        System.out.println("My car is super fast.");
        System.out.println("How about going a long drive?");
    }
}
