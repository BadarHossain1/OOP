public class ExceptionHandling {

    // Error is un recoverable and the program cant handle it

    // Exception is that you divide by zero. Arithmetic exception

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int c = a/b;
            System.out.println(c);

            if(c == 0){
                throw new MyException("My Exception");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){ //strict rule exception should be above
            System.out.println(e.getMessage());
        }
        catch(Exception error){ //after this executes, other catch wont execute, so strict exceptions all should written above
            System.out.println("Error");
        }
        finally{ //One finally block only, not more than one
            System.out.println("Finally block");
        }

        System.out.println("Hello");

       

    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }

}


class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
