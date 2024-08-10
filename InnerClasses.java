public class InnerClasses {
    //outside classes cannot be static, because it itself not dependent on any other class

    static class Test{ 
        //Test class is now dependent on the class its inside of.

         String name;

         Test(String name){
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Test a = new Test("Badar"); //without static here gives error
        Test b = new Test("Kunal"); //without static here gives error

        System.out.println(a.name);
        System.out.println(b.name);

        //both will have different identities. The static internally can have objects, it just doesnt need to depend on "InnerClasses" class. zzzzzzzzzz 
    }
}
