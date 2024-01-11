package DoublyLL;

public class DLL1_Array2LinkedList {

	static Node convertArr2Dll(int[] arr) {
		Node head = new Node(arr[0]);
		Node prev = head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i],null,prev);
			prev.next=temp;
			prev=temp;
		}
		return head;
	}
	
	static void print(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void main(String[] args) {
		int[] arr= {12,5,8,7};
		Node head=convertArr2Dll(arr);
		print(head);
		

	}

}
