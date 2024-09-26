public class SUPER {

    public static void main(String[] args) {
        // super() is used to call the constructor of the parent class or keyword refers
        // to the superclass (parent) of an object very similar to "this" keyword.
        SuperHero superman = new SuperHero("Batman", 42, "Rich AF");
        System.out.println(superman.toString());

        Person man = new SuperHero("Thor", 115, "Thunder");
        
                // System.out.println(man.power); Here you are creating a reference variable of
                // Person type which is the super class and you will have access to stuff in the
                // super class, but calling the SuperHero constructor. So you cant access power.
                // You are referencing a parent to a child.

        // There are many variables in both parent and child classes.
        // You are given access to variables that are in the ref. type that is SuperHero
        // Hence, you should have access to Power variable
        // This also means, that the ones you are trying to access should be initialized
        // But here, when the obj itself is of type parent class, how will you call the constructor of the child class
        //This is why error
        //You cant have a child reference variable and a parent object
        // SuperHero man2 = new Person("Badar", 20);

    }

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        super(); //Refers to the object class as per how java says. ctrl+backspace to see
        this.name = name;
        this.age = age;
        

    }

    public String toString() {
        return name + " " + age;

    }

    Person(Person old){
        //Here Person old is like Person old = other
        //Its exactly same as Person man = new SuperHero("Thor", 115, "Thunder");
        //old will have access to the Person class variables, not to the sub class variable like power variable.
        this.name = old.name;
        this.age = old.age;
    }

    //Super class will have no knowledge of the sub class.  

}

class SuperHero extends Person {
    String power;


    SuperHero(SuperHero other){
        super(other);
        power = other.power;
    }

    SuperHero(String name, int age, String power) {
        // constructor
        super(name, age); // calls the constructor of the parent class "Person". Even if variables of
                          // Person class are private , it can still initialize but not access those
                          // because the super keyword calls the constructor of the Person class.
                          // also super keyword should be used first to initialize the values in the parent class, then initialize the sub class values. super should be called first and at top or otherwise you get error.
        System.out.println(super.name); // or use this and access variables
        this.power = power;

    }

    public String toString() {
        return super.toString() + this.power;
    }
}
