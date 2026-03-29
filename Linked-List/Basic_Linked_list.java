
public class Basic_Linked_list{
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
        Node b = new Node (5);
         Node c = new Node (6);
          Node d = new Node (7);
           Node e = new Node (8);
            Node f = new Node (9);
 
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=f;
      
       System.out.println(a.data);
       System.out.println(a.next.data);


  }

}