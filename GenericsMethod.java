public class GenericsMethod {
    
    public <T> void gMethod(T data){
        System.out.println("Data Passed: "+ data);
    }


}

class Main{
    public static void main(String[] args) {
        GenericsMethod gm = new GenericsMethod();
        gm.<String>gMethod("OOP");
    }
}
