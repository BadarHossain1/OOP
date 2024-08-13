public class Interface {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.stop();
        car.acc();
        car.drake();

        Engine car2 = new Car();

        // car2.drake(); // cant recognize

        // Two classes unrelated to each other can also implement same interfaces

        // Happens at run time, do not use in performance critical code


        NiceCar car3 = new NiceCar(); //By default Power Engine

        car3.start();
        car3.StartMusic();





        

    }
}


class NiceCar{
    private Engine engine;

    private Media player = new CDPlayer();


    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void StartMusic(){
        player.start();
    }

    public void StopMusic(){
        player.stop();
    }

    public void ChangeEngine(){
        this.engine = new ElectricEngine();
    }

}

class Car implements Engine, brake {

    @Override
    public void start() {
        System.out.println("Start the engine baby!!!");
    }

    @Override
    public void stop() {
        System.out.println("Stop you sherlock");
    }

    @Override
    public void acc() {
        System.out.println("Broom Broom mandem");
    }

    @Override
    public void drake() {
        System.out.println("I brake unlike drake");
    }

}

class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("CD Player is playing");
    }

    @Override
    public void stop() {
        System.out.println("CD Player is stopped");
    }

}

class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start the Power engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop!!!! The Power engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the Power engine");
    }

}

class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start the Electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop!!!! The Electric engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the Electric engine");
    }

}

interface Engine {

    static final int PRICE = 780000;

    void start();

    void stop();

    void acc();
}

interface brake {
    void drake();
}

interface Media {
    void start();

    void stop();
}



//Extend Interfaces


interface A{
    // void a();
    
    default void a(){
        System.out.println("A");

    } // with default you do not need overriding
}

interface B extends A{
    void b();
}

class C implements B{

    // @Override
    // public void a() {
    //     System.out.println("A");
    // } with default you don t need this

    @Override //internally over ride is an interface .
    // Access modifiers for the overridden method should be same or better, it cannot be more restrictive.
    // Like lets say b is public, so here overridden method should be public or better than public(Not available).
    public void b() {
        System.out.println("B");
    }

}


// Static interface methods always have a body, because they only be used from the interface only and cannot be overridden.


interface D{

    static void greet(){
        System.out.println("Hello");
    }

    // Then call them by the interface name

    // D.greet();

}



// Nested Interface

class Nested{
    interface NestedInterface{
        boolean isOdd(int num);
    }
}

class E implements Nested.NestedInterface{
    
        @Override
        public boolean isOdd(int num) {
            return num % 2 != 0;
        }
}


