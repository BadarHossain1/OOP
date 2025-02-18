public class New {
    public static void main(String[] args){
        Student student1 = new Student("Badar", "125", "3.90"); // new keyword decides the memory allocation in heap memory and returns the reference to the object through the operating system.
        Student copy = student1;

        student1.name = "Badar Hossain"; // change in student1 changes the copy instance

        System.out.println(copy.name); //doesnt make a copy, makes a copy of reference


    }

    
}

class Student{
    String name;
    String id;
    String cgpa;

    Student(String name, String id, String cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    
}