public class Object {
    public static void main(String[] args) {

        Car car = new Car();
        car.drive();
        car.stop();

        System.out.println(car.make);

    }

}
class Car {
   String make = "Chevrolet";
   String model = "Camaro";
   int year = 2020;
   String color = "Red";
   double price = 500000000;

   public void drive() {
       System.out.println("You are driving a " + year + " " + make + " " + model);
   }

   public void stop() {
       System.out.println("You have stopped the " + make + " " + model);
   }

}