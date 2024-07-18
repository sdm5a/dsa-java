public class F_returnCyclicNode {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static Node cyclicNode(Node head){
        Node slow=head;
        Node fast=head;
        
        while(fast!=null){
           
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }

        Node temp=head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }

        return temp;
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
        f.next=b;

        // cyclic node
        Node ans=cyclicNode(a);
        System.out.println(ans.data);
    }
}
