package Polymorphism;

public class Circle extends Shapes {

    // this will run when obj of Circle is created
    // hence it is overriding the parent method

    @Override //this is called annotation and it is used to check if its overriding something or not like area is overriding the parent area. But when final keyword is used , it cant be overridden. And it helps the compiler to run things faster when final is used. This is called Early Binding. Late binding is when at run time the compiler does dynamic method resolution when the program is running and choosing which to run. Btw, you cant Override a static method.
    


    public void area() {
        System.out.println("I am in Circle");
    }
}
