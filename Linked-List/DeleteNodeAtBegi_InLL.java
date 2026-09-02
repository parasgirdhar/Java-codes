class Node{

       int data;
       Node next;

       public Node(int data){
            this.data = data;
            this.next= null;
       }


       public static Node DeleteNode(Node head){
                     if(head == null){
                         return head;
                     }
                Node temp = head;
               head = head.next ;
               return head;
       }

    public static void main(String []args){
           
            Node head = new Node(90);
            Node two = new Node(56);
            Node three = new Node(23);


           head.next = two;
               two.next = three;
               three.next = null;
 
               
                 head = DeleteNode(head);
                while(head != null){
                    System.out.println(head.data);
                    head = head.next;
                }
                
               
    }
}