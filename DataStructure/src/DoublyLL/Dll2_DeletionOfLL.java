package DoublyLL;

public class Dll2_DeletionOfLL {
	private static Node deleteHead(Node head) {
		if(head == null || head.next==null) return null;
		Node prev = head;
		head=head.next;
		head.back=null;
		prev.next=null;
		System.out.println(head.data);
		return head;
	}
	private static Node deleteTail(Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		Node tail=head;
		while(tail.next !=null) {
			tail=tail.next;
		}
		Node newTail=tail.back;
		newTail.next=null;
		tail.back=null;
		return head;
	}
	
	private static Node removeKthElement(Node head,int k) {
		if(head == null) return null;
		int cnt=0;
		Node kNode=head;
		while(kNode != null) {
			cnt++;
			if(cnt == k ) break;
			kNode = kNode.next;
		}
		
		Node prev=kNode.back;
		Node front = kNode.next;
		
		if(prev == null && front == null) return null;
		
		else if(prev == null) {
			return deleteHead(head);
		}
		else if(front == null) {
			return deleteTail(head);
		}
		prev.next = front;
		front.back=prev;
		
		kNode.next =null;
		kNode.back=null;
		
		return head;
	}
	static void deleteNode(Node temp) {
		//Parameter Node cant be head
		Node prev = temp.back;
		Node nextNode=temp.next;
		
		if(nextNode == null) {
			prev.next=null;
			temp.back=null;
			return;
		}
		prev.next = nextNode;
		nextNode.back=prev;
		temp.next=temp.back=null;
	}
	static void print(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void main(String[] args) {
		int[] arr= {12,5,6,8};
		DLL1_Array2LinkedList obj = new DLL1_Array2LinkedList();
		
		Node head=obj.convertArr2Dll(arr);
//		head=deleteHead(head);
//		head=deleteTail(head);
//		head=removeKthElement(head,2);
		deleteNode(head.next);
		
		print(head);

	}
	

	

}
