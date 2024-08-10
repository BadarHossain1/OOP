public class ManualArrayList {
    
    //Problem with custom array list is the fixed data type, where as in ArrayList you can have all data types. You can specify the data type in ArrayList like ex: ArrayList<Integer> list = new ArrayList<>(); Here, generics helps us provide a type(Parameterized type). 

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //also working an index value

    public ManualArrayList(){
        this.data = new int[DEFAULT_SIZE]; 
    }

    public void add(int value){
        if(this.isFull()){
            resize(); 
        }
        data[size++] = value;
    }

    private void resize(){
        int[] temp = new int[data.length *2 ];

        //copy the current items in the new array

        for(int i =0 ; i<data.length; i++){
            temp[i] = data[i];

        }
        data = temp;
    }



    private boolean isFull(){
        return size == data.length;

    }

    public int remove(){
        int removed = data[--size];
        return removed;

    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int value){
        data[index] = value;

    }

    


    public static void main(String[] args) {

        ManualArrayList list = new ManualArrayList();

        
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.get(0));
        
        
    }

}
