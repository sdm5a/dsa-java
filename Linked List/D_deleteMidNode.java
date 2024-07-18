public class D_deleteMidNode {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void deleteMidNode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(8);
        Node d=new Node(6);
        Node e=new Node(3);
        // Node f=new Node(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // e.next=f;

        display(a);
        deleteMidNode(a);
        System.out.println("After deleting middle node:");
        display(a);
    }
}
