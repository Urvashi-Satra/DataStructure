package DoublyLL;

public class Node {
	int data;
	Node next; //self declaring data type -> Node
	Node back;
	Node(int data1,Node next1,Node back1){
		this.data=data1;
		this.next=next1;
		this.back=back1;
	}
	
	Node(int data1){
		this.data=data1;
		this.next=null;
		this.back=null;
	}
	
}
