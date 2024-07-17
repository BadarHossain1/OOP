public class SUPER {

    public static void main(String[] args){
        //super() is used to call the constructor of the parent class or keyword refers to the superclass (parent) of an object very similar to "this" keyword.
        SuperHero superman = new SuperHero("Batman", 42, "Rich AF");
        System.out.println(superman.toString());




    }
    
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    
    }

    public String toString(){
        return name + " " + age;
    
    }
    
}

class SuperHero extends Person{
    String power;

    SuperHero(String name, int age, String power){
         //constructor
        super(name, age);
        this.power = power;
       
    }

    public String toString(){
        return super.toString()+this.power;
    }
}
