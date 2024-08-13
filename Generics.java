public class Generics<T> {

    // Generics<T extends Number> Here only you can take Number, more type checking
    // Check Java Documentation

    // Problem with custom array list is the fixed data type, whereas in ArrayList,
    // you can have all data types.
    // You can specify the data type in ArrayList like: ArrayList<Integer> list =
    // new ArrayList<>();
    // Generics help us provide a type (Parameterized type).

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as an index value

    public Generics() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) { // wild card example
        // do something
    }

    public void add(T value) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = (Object) value;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // Copy the current items into the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        @SuppressWarnings("unchecked")
        T removed = (T) data[--size];
        return removed;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T value) {
        data[index] = (Object) value;
    }

    public static void main(String[] args) {
        // Specify the type when creating an instance of Generics
        Generics<Integer> list = new Generics<>();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.get(1)); // Output: 3
    }
}
