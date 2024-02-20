package linkedlist;

public class Completelinkedlist {
	int data;
	Completelinkedlist next;
     public Completelinkedlist(int data) {
    	 this.data=data;
    	 this.next=null;
     }
     public static void main(String[] args) {
    	 Completelinkedlist node1 =new Completelinkedlist(11);
    	 Completelinkedlist node2 =new Completelinkedlist(12);
    	 Completelinkedlist node3 =new Completelinkedlist(13);
    	 node1.next= node2;
    	 node2.next=node3;
//    	 System.out.println(node1.data);
//    	 System.out.println(node1.next.data);
//    	 System.out.println(node1.next.next.data);
    	 
//    	 System.out.println(node1.data);
//    	 System.out.println(node2.data);
//    	 System.out.println(node3.data);
    	 
    	 System.out.println(node2.next.data);
     }
}
