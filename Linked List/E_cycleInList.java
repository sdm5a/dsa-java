public class E_cycleInList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static boolean cyclicNode(Node head){
        Node slow=head;
        Node fast=head;
        boolean ans=false;
        while(fast!=null){
            if(slow==fast) return ans=true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return ans;
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
        f.next=d;

        // find the node from where cycle is formed
        System.out.println(cyclicNode(a));
    }
}
