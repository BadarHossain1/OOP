public class Constructors {
    public static void main(String[] args){
        Human man1 = new Human("Badar", 21, 88);

        System.out.println(man1.name);

        man1.eat();


    }
}

class Human{
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void eat(){
        System.out.println(this.name + "is khaitese");
    }
}