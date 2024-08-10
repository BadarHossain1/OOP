package Polymorphism;

public class Main {
    public static void main(String[] args) {

        //Parent obj = new child(); here which method will be called depends on child();. This is known as UpCasting, and this is how overriding works

        Shapes shape = new Shapes();

        Shapes circle = new Circle();

        //Here as we are calling area of Circle, we can say why we need the area is shapes. BUT, we know parent reference type can access only those methods that it has, it does not know whats there in the child. As there is area in the Shapes as well, we are able to access although because during run time java uses dynamic method dispatch to run area of Circle. Btw, when you use static in parent and child, the parent method is not overridden, however it can be inherited. Overriding depends on objects, static does not depend on objects, hence you can not override a static method. You can inherit but you cannot override.

        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
