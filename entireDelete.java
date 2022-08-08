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
     
     public void insert(String value){
         if(!isFull()){
             arr[lastIndex+1]=value;
             lastIndex++;
             System.out.println("Inserted " + value);
         }else{
             System.out.println("Full");
         }
     }
     
     //Traversals Preorder
     
     public void preOrder(int index){
         if(index > lastIndex){
             return;
         }
         System.out.print(arr[index]+" ");
         preOrder(index*2);
         preOrder(index*2+1);
          
         
     }
     
     public void inOrder(int index){
         if(index > lastIndex){
             return;
         }
         inOrder(index*2);
         System.out.print(arr[index]+" ");
         inOrder(index*2+1);
          
     }
     
     // postorder
     public void postOrder(int index){
         if(index > lastIndex){
             return;
         }
         postOrder(index*2);
         postOrder(index*2+1);
         System.out.print(arr[index]+" ");
          
     }
     //level order 
     
     public void levelOrder(){
         for(int i = 1; i <= lastIndex;i++){
             System.out.print(arr[i]+" ");
         }
     }
     
     // search 
     
     public int search(String value){
         for(int i =1; i <= lastIndex;i++){
             if(arr[i] == value){
                 System.out.print("Found at" + i);
                 return i;
             }
         }
         System.out.println("The value does not exists");
         return -1;
     }
     
     //delete
     
     public void delete(String value){
         int location = search(value);
         if(location == -1){
             return;
         }else{
             arr[location]= arr[lastIndex];
             lastIndex--;
             System.out.println("The node is deleted");
         }
     }
     
     //Delete BT
     
     public void entiredelete(){
         try{
             arr=null;
             System.out.println("Deleted Sucessfully");
             
         }catch(Exception e){
             System.out.println("Error in deleting");
         }
     }
     
    public static void main(String[] args){
        Main ritesh = new Main(6);
        ritesh.insert("R");
         ritesh.insert("i");
          ritesh.insert("t");
           ritesh.insert("e");
            ritesh.insert("s");
             ritesh.insert("h");
             ritesh.preOrder(1);
             System.out.println("");
             ritesh.inOrder(1);
             System.out.println("");
             ritesh.postOrder(1);
             System.out.println("");
             ritesh.levelOrder();
             ritesh.search("R");
             ritesh.delete("s");
             ritesh.levelOrder();
             ritesh.entiredelete();
    }
}

 
    
 
