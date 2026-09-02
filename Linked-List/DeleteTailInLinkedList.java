class Node{

       int data;
       Node next;

       public Node(int data){
            this.data = data;
            this.next= null;
       }

public static Node DeleteLast(Node head){
                         
                          Node temp = head; 
                     if(head == null){
                        return null;
                     }
                     while(temp.next.next != null){
                                temp = temp.next;
                     }
                           temp.next = null;
                           return head;
                }


    public static void main(String []args){
           
            Node head = new Node(90);
            Node two = new Node(56);
            Node three = new Node(23);


           head.next = two;
               two.next = three;
               three.next = null;
 

               head =  DeleteLast(head);
                while(head != null){
                    System.out.println(head.data);
                    head = head.next;
                }
                     
    }
}