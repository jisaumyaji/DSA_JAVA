package testlinkedlist;

public class tester {
public static void main(String[] args) {
	operationlinkedlist list = new operationlinkedlist();
	list.addfirstnode(1);
//	list.show();
	list.addfirstnode(2);
//	list.show();
	list.addfirstnode(3);
	list.addfirstnode(23);
	list.show();
	list.insertAtEnd(43);
	list.show();
}
}
