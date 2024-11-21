public class Final {
    public static void main(String[] args){
        final int a = 10;
        // a = 20; // cant change the value of a because of final keyword and also a is primitive data type

        // @Override //this is called annotation and it is used to check if its overriding something or not like area is overriding the parent area. But when final keyword is used , it cant be overridden. And it helps the compiler to run things faster when final is used. This is called Early Binding. Late binding is when at run time the compiler does dynamic method resolution when the program is running and choosing which to run. Also when you use final in a class, inclusively it makes the methods in it final too, thats why you cant extend that class. You can inherit the methods but cant override them because of using final. Also final classes cannot be inherited. 
        

        final Student student = new Student(null, null, null);
        student.name = "Badar"; // you can change the value, but cannot re assign it
        // student = new Student("Habu") ---> you cant reassign it
    }
}

class Student{
    String name;
    String id;
    String cgpa;

    Student(String name, String id, String cgpa){
        System.out.println("Object is created");
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    //object gets destroyed by java without any manual need. When a lot of object is created and it takes a toll on the memory, java destroys objects.

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Object is obliterated from the very existence");
    }
}
