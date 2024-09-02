public class Class1 {
    public static void main(String[] args) {
        Batch batch = new Batch(1, "Ali", "Computer Science", "A", 2020);
        System.out.println(batch.id);
        System.out.println(batch.name);
        System.out.println(batch.Department);
        System.out.println(batch.Section);
        System.out.println(batch.batchNo);


        // when we declare an object, its takes place in a stack memory as an object. We keep attributes created with the object in heap memory bcz the stack memory is less. 
    }
}


class Batch{
    int id;
    String name;
    String Department;
    String Section;
    int batchNo;


    Batch(int id, String name, String Department, String Section, int batchNo){
        this.id = id;
        this.name = name;
        this.Department = Department;
        this.Section = Section;
        this.batchNo = batchNo;
    }

}