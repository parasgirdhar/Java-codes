
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node RemoveHead(Node head, int k) {

        if (head == null) {
            return head;
        }

        if (k == 1) {
            Node temp = head;
            head = head.next;
            return head;
        }

        int cnt = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {

            cnt++;

            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
                         // this one is else block ....
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {

        Node first = new Node(67);
        Node second = new Node(78);
        Node third = new Node(32);
        Node fourth = new Node(15);

        first.next = second;
        second.next = third;
        third.next = fourth;

        Node head = first;

        System.out.println("Before:");

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        head = RemoveHead(head, 2);

        System.out.println("After:");

        temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
