public class AssignmentAbstraction {
    public static void main(String[] args) {
        AB r = new AB();
        r.displayA();
        r.displayB();
    }
}
interface InterfaceA  {
    void displayA();
}
interface InterfaceB{
    void displayB();
}
class AB implements InterfaceA,InterfaceB{
    public void displayA() {
        System.out.println("This is interface A");
    }
    public void displayB() {
        System.out.println("This is interface B");
    }
}