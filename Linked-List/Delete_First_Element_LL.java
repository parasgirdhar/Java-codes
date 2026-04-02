class Delete_First_Element_LL{

public static void call(Node head){

    Node temp=head;
    if( temp == null){
           return;    
    }
else{
     System.out.println(temp.data);
       call(temp.next);
     
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

Node a=new Node(67);
Node b=new Node(78);
Node c=new Node(93);
Node d=new Node(23);
 
 a.next=b;
 b.next=c;
 c.next=d;

call(a.next);

}
}