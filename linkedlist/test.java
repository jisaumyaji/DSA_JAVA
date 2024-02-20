package linkedlist;

public class test {
   public static void main(String[] args) {
	   NewNode node1 = new NewNode();
	   NewNode node2 = new NewNode();
	   NewNode node3 = new NewNode();
	   node1.data=10;
	   node1.next=node2;
//	   node1.next.data=20;
	   node2.data=20;
	   node2.next=node3;
	   node3.data=30;
	   System.out.println(node1.data);
//	   System.out.println(node1.next);
	   System.out.println(node1.next.data);
//	   System.out.println(node2.data);
//	   System.out.println(node2.next);
	   System.out.println(node2.next.data);
//	   System.out.println(node3.data);
//	   System.out.println(node3.next);
//	   System.out.println(node3.next.data);
	   System.out.println(node1.next.next.data);
	   
   }
}
