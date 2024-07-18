
import java.util.Scanner;

public class A_deleteANode{

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void deleteANode(Node t){
        t.data=t.next.data;
        t.next=t.next.next;
    }

    public static Node findNode(Node head,int n){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        Node t=head;
        for(int i=1;i<size-n+1;i++){
            t=t.next;
        }
        return t;
        
    }

    public static Node findNodeOneTraversal(Node head,int n){
        Node fast=head;
        Node slow=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }

    public static Node deleteNodeOneTraversal(Node head,int n){
        Node fast=head;
        Node slow=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
        
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Node a=new Node(1);
        Node b=new Node(6);
        Node c=new Node(12);
        Node d=new Node(7);
        Node e=new Node(5);
        Node f=new Node(8);
        Node g=new Node(2);
        Node h=new Node(11);
        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;


        // print linked list
        System.out.print("Linked List: ");
        display(a);

        //  Q1--> delete a node without using privious you have only node argument
        // deleteANode(c);
        // display(a);

        // Q2--> find nth node from the last
        // System.out.println("Enter value of n: ");
        // int n=sc.nextInt();
        // Node t=findNode(a,n);
        // System.out.println("The give nth node from last is: "+t.data);

        // Q3-->  find nth node from the last in one traversal
        // System.out.print("Enter value of n: ");
        // int n=sc.nextInt();
        // Node t=findNodeOneTraversal(a,n);
        // System.out.println("The give nth node from last in one traversal: "+t.data);

        // Q4--> remove nth node from the end in one traversal
        // Node t=deleteNodeOneTraversal(a, 8);
        // System.out.print("After deleting nth node: ");
        // display(t);

        
        sc.close();
    }
}