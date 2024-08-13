public class Comparing {
    
    public static void main(String[] args) {
        // Create two objects of the same class

        Student s1 = new Student(1, 90);
        Student s2 = new Student(1, 90);

        // Compare the two objects

        
    }

}

class Student{
    int roll ;
    float marks;

    Student(int roll, float marks){
        this.roll = roll;
        this.marks = marks;
    }
}
