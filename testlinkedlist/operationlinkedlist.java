package testlinkedlist;

public class operationlinkedlist {
  NewNode head;
  NewNode tail;
  int size;
  public operationlinkedlist() {
	this.head = null;
	this.tail = null;
	size=0;
}

public void addfirstnode(int data) {
	NewNode node= new NewNode(data);
	node.next=head;
	head=node;
	if(size==0) {
		tail=head;
	}
	size++;
}
public void insertAtEnd(int data) {
    NewNode newNode = new NewNode(data);
    if (head == null) {
        head = newNode;
        return;
    }
    NewNode current = head;
    while (current.next != null) {
        current = current.next;
    }
    current.next = newNode;
}
public void show(){
	NewNode refTemp = head;
	while(refTemp!=null) {
		System.out.println(refTemp.data);
		refTemp=refTemp.next;
	}
//	System.out.println();
	
}

}
