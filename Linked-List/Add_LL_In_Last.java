
    class Add_New_Node_At_End {

    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){

        Node a = new Node(65);
        Node b = new Node(54);
        Node c = new Node(23);
        Node d = new Node(91);
        Node newnode = new Node(18);

        a.next = b;
        b.next = c;
        c.next = d;

       Node head=a;

       Node temp=head;

       while(temp.next != null){              
         temp=temp.next;
       }

        temp.next=newnode;

        Node current=head;

        while(current != null){
          System.out.println(current.data);
          current=current.next;
        }

        }
    }



