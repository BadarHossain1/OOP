public class Inheritance {
    public static void main(String[] args){
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.go();
        car.stop();

        bicycle.go();
        bicycle.stop();
        System.out.println(bicycle.wheels);
    }
}

class Vehicle{ //vehicle class is super class or ancestor
    double speed;
    void go(){
        System.out.println("This vehicle is broom broom");
    }

    void stop(){
        System.out.println("This vehicle is stopped");
    }
}

class Car extends Vehicle{
    //Inherits from Vehicle

    int wheels = 4;
    int doors = 4;

}

class Bicycle extends Vehicle{
    //Inherits from Bicycle

    int wheels = 2;
    int pedals = 2;
}