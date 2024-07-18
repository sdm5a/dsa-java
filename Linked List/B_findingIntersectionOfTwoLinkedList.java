public class B_findingIntersectionOfTwoLinkedList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }


    public static Node intersection(Node a,Node x){
        // find the length of list 1
        int count1=0;
        Node temp1=a;
        while(temp1!=null){
            temp1=temp1.next;
            count1++;
        }
        // System.out.println(count1);

        // find the length of list 2
        int count2=0;
        Node temp2=x;
        while(temp2!=null){
            temp2=temp2.next;
            count2++;
        }

        // System.out.println(count2);

        temp1=a;
        temp2=x;
        int m=Math.abs(count1-count2);
        // System.out.println(m);
        
        if(count1>count2){
            for(int i=1;i<=m;i++){
                temp1=temp1.next;
            }
        }
        else{
            for(int i=1;i<=m;i++){
                temp2=temp2.next;
            }
        }

        while(temp1!=temp2){
            // if(temp1!=temp2){
            //     return temp1;
            // }
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return temp1;
    }
    public static void main(String[] args) {
        // creat list 1
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

        // creat list 2
        Node x=new Node(10);
        Node y=new Node(15);

        x.next=y;
        y.next=d;

        // find intrrsection point of list using function
        Node ans=intersection(a, x);
        System.out.println("Intersection node is: "+ans.data);
        
    }
}
