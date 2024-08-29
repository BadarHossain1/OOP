import java.util.List;
import java.util.Vector;

public class VectorAndEnum {
    

    // ArrayList can be accessed by multiple threads because it is not synchronized. But in Vector not all threads can access it at the same time, you have to wait. ArrayList is faster. 


    List<Integer> vector = new Vector<>();

    vector.add(32);

    // Enums

    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are Enum constants
        // public, static and final
        // since its final, you can create child enums

        Week(){
            System.out.println("Constructor called for " + this);
        } 
        // this is not public or protected, only private or default
        // why? we do not want to create new objects
        // if you want fixed group of objects, you use enums. Like 12 months for example


        // Internally: public static final Week Monday = new Week();

        // Enum extends java.enum and not anything else

        // Enum can implement as many interfaces as it wants, but not extend. 
    }

    public static void main(String[] args) {
        

        Week week = Week.Monday;

        for(Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal()); // Position. For Monday position 0.
        System.out.println(week.valueOf("Monday")); // monday


    }

}
