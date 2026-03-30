
class LL{

    public static void display(Node Head){
       
 while(Head!=null){
    System.out.println(Head.data);
    Head=Head.next;

 }
    }

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

                //    display(a);
                //    System.out.println();    // use this two lines if want to print list two times...
                  
                display(a);
    }


}