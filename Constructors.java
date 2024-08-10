public class Constructors {
    public static void main(String[] args) {
        Human man1 = new Human("Badar", 21, 88);
        Human man2 = new Human();

        Human random = new Human(man1);

        System.out.println(random.name);

        // System.out.println(man1.name);

        man1.eat();

    }
}

class Human {
    String name;
    int age;
    double weight;

    Human(Human other) {

        this.name = other.name;
        this.age = other.age;
        this.weight = other.weight;
    }

    Human() {
        this("Badar", 21, 88);
        // here this is basically Human. Calling a constructor from another constructor
        // Internally its like new Human("Badar", 21, 88);
    }

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void eat() {
        System.out.println(this.name + "is khaitese");
    }
}