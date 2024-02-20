package linkedlist;

public class testlinkedlist {
      int data;
      testlinkedlist next;
      public testlinkedlist(int data) {
    	  this.data = data;
    	  this.next=null;
      }
      public static void main(String[] args) {
    	  testlinkedlist node = new testlinkedlist(13);
    	  node.data=10;
//    	  node.next=null;
    	  System.out.println(node.data);
      }
}
