public class C_findMidValue {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static Node findMidValue(Node head){
        Node slow=head;
        Node fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(8);
        Node d=new Node(6);
        Node e=new Node(3);
        Node f=new Node(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        // find middle value of linked list
        Node ans=findMidValue(a);
        System.out.println("Mid value of this linked list is: "+ans.data);
    }
}
