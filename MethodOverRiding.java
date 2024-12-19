public class MethodOverRiding {
    public static void main(String[] args) {
        // method overRiding is Declaring a method in sub class which is already present
        // in parent class , done so that a child can give its own implementation.

        Dog dog = new Dog();
        dog.sound();

        Animal animal = new Animal();
        animal.sound();

    }
}

class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {

    @Override
    // over written the method it inherits from its parent class.
    void sound() {
        System.out.println("The dog got the dawg in him");
    }
}