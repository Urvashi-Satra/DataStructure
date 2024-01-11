package LinkedList;
class Node{
	int data;
	Node next; //self declaring data type -> Node
	
	Node(int data1,Node next1){
		this.data=data1;
		this.next=next1;
	}
	
	Node(int data1){
		this.data=data1;
		this.next=null;
	}
	
}
public class ll1_LinkedList {

	public static void main(String[] args) {
		int[] arr= {2,5,6,7};
		Node obj=new Node(arr[3]);
		System.out.println(obj.data);

	}

}
