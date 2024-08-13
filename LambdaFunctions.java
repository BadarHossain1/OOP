import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    
    public static void main(String[] args) {
        
        // one line functions are lambda functions

        // Sum sv(a, b) -> a + b


        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<10; i++){
            arr.add(i+1);
        }

        arr.forEach((item)-> System.out.println(item));


        Consumer<Integer> fun = (item) -> System.out.println(item*2);

        arr.forEach(fun);

        // Lambda functions are used to provide the implementation of the functional interface.

        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;


        LambdaFunctions myCalculator = new LambdaFunctions();

        System.out.println(myCalculator.operate(10, 5, sum));
        System.out.println(myCalculator.operate(10, 5, prod));
        System.out.println(myCalculator.operate(10, 5, sub));


    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    int sum(int a, int b){
        return a + b;
    }
}


interface Operation{
    int operation(int a , int b);
}
