public class Main{
    
    String[] arr;
    int lastIndex;
    
    public Main(int size){
        arr = new String[size+1];
        this.lastIndex =0;
        System.out.println("The BT is created "+size);
    }
    
    //isfull
    
    boolean isFull(){
        if(arr.length-1 == lastIndex){
            return true;
        }else{
            return false;
        }
    }
    // insert
    
    void insert(String value){
        if(!isFull()){
            arr[lastIndex+1]= value;
            lastIndex++;
            System.out.println("Inserted "+ value);
        }else{
            System.out.println("The bt is full");
        }
    }
    
    public static void main(String[] args){
        Main ritesh = new Main(5);
        ritesh.insert("R");
         ritesh.insert("i");
          ritesh.insert("t");
           ritesh.insert("e");
            ritesh.insert("s");
             ritesh.insert("h");
    }
}

 
    
 
