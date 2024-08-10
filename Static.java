public class Static {

    public static void main(String[] args) {
        //Main is declared as static because java runs main first and if you dont put it static you have to create an object of that class to access something of that class. But how can you create an object if main is the first thing that is running
        Human wow = new Human(20, 3.90);
        System.out.println(Human.population);
        // Say there is a property like population which is same and static and for
        // everyone, those are static variables

        greeting(); //a static method can only access static data. We know that something which is not static, belongs to an object. 
    }

    static void fun(){
        Static obj = new Static(); //Static instead of Main bcz its in "Static" class.
        obj.hello(); //Without object u cant use the non static method. So create an object first to use hello() function or method.
    }

    void hello(){
        System.out.println("Hello");
    }

    static void greeting(){
        System.out.println("Hello world");


    }

}

class Human {
    int age;
    double grade;
    static long population;

    Human(int age, double grade) {
        this.age = age;
        this.grade = grade;
        Human.population += 1; //This is not an instance variable, its a static one. Its common to the class. When a member is declared static, it can be accessed before any object of the class is being created and without referencing to that object, you can access to the static variables cz they are not dependent on objects, you can use it. You can make static methods and variables
    }

}