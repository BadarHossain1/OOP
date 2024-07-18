public class WrapperClass {
    public static void main(String[] args){

        int a = 10;
        int b = 20;

        swap(a,b);

        System.out.println(a + " " + b); // swapping wont happen because in java there is no pass by reference in primitives, everything is pass by value;

        //use it as an object
        Integer num = 45;
        Integer num2 = 65;
        //Integer value wont change as well after swapping because of final keyword in built of Integer data type

        
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
