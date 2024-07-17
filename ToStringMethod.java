public class ToStringMethod {
    public static void main(String[] args){
        Car car = new Car();
        

        // System.out.println(car.toString()); //output: gives memory address normally
        System.out.println(car); //output: gives memory address normally
    }
}

class Car{
    String make = "ford";
    String model = "Mustang";
    String color = "red";

    // overwrite the toString method
    public String toString(){
        return make + " " + model + " " + color;
    }
    

    public void startEngine(){
        System.out.println("The engine of the " + make + " " + model + " is now running.");
    }

}
