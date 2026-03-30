
public class Best_Method_LL{
    public static class Node{

       int data;
        Node next;
       
        Node(int data){
            this.data=data;
            this.next=null;
        }
      
    }

public static void main(String []args){

       Node a = new Node (3);
        Node b = new Node (76);
         Node c = new Node (45);
          Node d = new Node (34);
           Node e = new Node (32);
            Node f = new Node (54);
 
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=f;
      

    Node temp = a;

while(temp!=null){
    System.out.print(temp.data+ " ");     // best print statement is used here...
    temp=temp.next; 
}

}
  }







