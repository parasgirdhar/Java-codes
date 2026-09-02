class Node{

     int data;
     Node next;

        public Node(int data1){
            this.data = data1;
            this.next= null;
        }
        
          class Linkedlist{
              public static Node Convertarr(int []arr){
                   Node head = new Node (arr[0]);
                   Node mover = head;
                    
                     for(int i=1;i<arr.length;i++){
                        Node temp = new Node(arr[i]);
                           mover.next=temp; 
                              mover = temp;           
                     }
                         return head;
     }
          }

    public static void main(String []args){
          int arr[]={3,4,5,6};

                    Node head = Linkedlist.Convertarr(arr); 
           // System.out.println(head.data);   // it helps to print    head of the Linkedlist ...

           // in below it helps to print whole linked list...
             Node temp = head;

             while(temp != null){
                System.out.println(temp.data);
                temp=temp.next;
             }

    }
}