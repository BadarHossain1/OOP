public class StaticBlock {
    static int a = 4;
    static int b;

    //will run only once , when the first obj is created i.e. when the class is loaded for the first time
    static{
        System.out.println("I m in a static block here");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock(); // when the class is called here the static block statement comes out first bcz of the priority. That is the concept of static block. Class ta run hoilei ar kono kotha nai dada. 6
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        
        StaticBlock.b+=3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
