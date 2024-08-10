public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() { // It basically gives a number representation of an object. Not an address!!!!
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        // TODO Auto-generated method stub

        // return super.equals(obj);

        // modify

        return this.num == ((ObjectDemo) obj).num; // typecasting

    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(0);
        System.out.println(obj.hashCode());

        ObjectDemo obj2 = new ObjectDemo(0);

        if (obj == obj2) {

            // checks if they are pointing to the same thing basically checking the
            // addresses.
            System.out.println("obj is equal to obj2");

        }

        if (obj.equals(obj2)) {

            // .equals checks the content
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj.getClass().getName()); // getClass().[a lot of options]

    }
}
