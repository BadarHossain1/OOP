import java.util.ArrayList;

public class AccessControl { 
    public static void main(String[] args) {

        //Private is for sensitive data that you do not want anyone to access too. You can access using getter and setter methods.

        //No modifier is used for those variables that you wont want to be used outside that particular package.

        //Protected is used when you do not want your variables to be accessed outside the package but you can access when it is in sub class. Only the sub class can access the members in the base class when its in different package. 

        //Public can be used everywhere.....which is dangerous.


        A obj = new A(10, "Badar");
        // obj.num; //data hiding

        System.out.println(obj.getNum()); //Here I am getting the value via a method

        obj.setNum(0);

        System.out.println(obj.getNum());


        //need to a few things

        //1: Access the data members
        //2: Modify the data members

        ArrayList<Integer> list = new ArrayList<>();
        // list.DEFAULT_CAPACITY; //Private, so cant access

    }
}

class A{
    private int num;
    String name;
    protected int[] arr; //access everywhere except world(different package and not sub class)

    public A (int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }
}