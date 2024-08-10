public class Singleton {
    public static void main(String[] args) {
        // Test obj1 = new Test(); //private constructor you cant call it.

        Test obj1 = Test.getInstance();
        Test obj2 = Test.getInstance();
        Test obj3 = Test.getInstance();
        //only one object is created in the memory

        // all 3 reference variables are pointing to one object



    }
}

class Test {
    int num = 0;

    private Test() {

    }

    private static Test instance;

    public static Test getInstance() {
        // check whether 1 obj is created or not
        if (instance == null) {
            instance = new Test();
        }

        return instance;
    }
}