public class Inheritance {
    public static void main(String[] args){

        //Types of Inheritance

        //1: Single Inheritance = One class extends another class.

        //2: Multi-Level Inheritance = The child class or sub class can be a parent of another sub class.

        //3: Multiple Inheritance = The child class extends more than one super class. Lets say two parent have a same named variable, so the child cant decide which value to pick, thats why multiple inheritance is not allowed in java. We will do this in interfaces. 

        //4: Hierarchial Inheritance: One class is inherited by many classes. 

        //5: Hybrid Inheritance: Combination of single and multiple inheritance. Since we do not have multiple inheritance , we do not have hybrid inheritance in java as well. 



        

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.go();
        car.stop();

        bicycle.go();
        bicycle.stop();
        System.out.println(bicycle.wheels);


        System.out.println(bicycle instanceof Vehicle); // checks if it is an instance of a class. 
        System.out.println(car instanceof Vehicle); // checks if it is an instance of a class. 
    }
}

class Vehicle { // vehicle class is super class or ancestor
    double speed;

    void go() {
        System.out.println("This vehicle is broom broom");
    }

    void stop() {
        System.out.println("This vehicle is stopped");
    }
}

class Car extends Vehicle {
    // Inherits from Vehicle

    int wheels = 4;
    int doors = 4;

}

class Bicycle extends Vehicle {
    // Inherits from Bicycle

    int wheels = 2;
    int pedals = 2;

    
}