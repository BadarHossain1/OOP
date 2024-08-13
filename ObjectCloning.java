import java.util.Arrays;

public class ObjectCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Making a clone of an object
        Human human = new Human(20, "Badar");
        // Human human2 = new Human(human);

        Human twin = (Human) human.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(human.arr));
        // human object array also changes. This is shallow copy. Primitives will be
        // copied. The copy will point to the original. Not totally a copy, thats why
        // called shallow copy.

        // Deep copy is when you copy the object and all the objects it references.

    }
}

class Human implements Cloneable { // implements Cloneable tells JVM that we are using type clone.
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] { 3, 4, 5, 6, 7, 8 };
    }

    // public Human(Human other) {
    // this.age = other.age;
    // this.name = other.name;
    // }
    @Override
    public Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }

    // @Override
    // public Human clone() throws CloneNotSupportedException {
    // Deep Copy
    // Human human = (Human) super.clone();
    // human.arr = this.arr.clone(); OR
    // human.arr = new int[human.arr.length];

    // return human;
    // }

    // The throws CloneNotSupportedException clause indicates that this method might
    // throw a CloneNotSupportedException. This exception is thrown if the Human
    // class does not implement the Cloneable interface, which is required for an
    // object to be legally cloned in Java. However, since your Human class
    // implements Cloneable, this exception is unlikely to be thrown unless you
    // manually enforce it.

    // super.clone(): The super keyword refers to the parent class, which in this
    // case is Object. The clone() method of the Object class creates a shallow copy
    // of the current object. A shallow copy means that it copies the object itself
    // but does not create new copies of objects that this object references (if
    // any).

    // How It Works:
    // When you call clone() on a Human object, the JVM calls the clone() method of
    // the Object class via super.clone().
    // The Object class’s clone() method creates a new instance of the Human class
    // and copies all the fields from the original object to this new instance.
    // The result is that you get a new Human object that has the same values for
    // its fields as the original object, but it's a separate object in memory.
}
