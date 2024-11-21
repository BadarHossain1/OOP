public class GenericsClass<T> {

    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }
    
    public T getData() {
        return this.data;
    }

   


}

class Main{
    public static void main(String[] args) {
        GenericsClass<Integer> a = new GenericsClass<>(59);
        System.out.println(a.getData());
    }
}