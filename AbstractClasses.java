public abstract class AbstractClasses{

    public static void main(String[] args) {
        
        Son son = new Son() {
            
        };

        son.career("Programmer");
    }
    
}


abstract class Parent{
    abstract void career(String name);
    abstract void Partner(String name, int age);
    // if you want this overridden, use abstract.

    

    
}


abstract class Son extends Parent{

    @Override
    void career(String name) {
        

        System.out.println("I am going to be a " + name);
        
    }

    @Override
    void Partner(String name, int age) {
       

        System.out.println("I love " + name + " She is " + age + " years old ");
        
    }

}
