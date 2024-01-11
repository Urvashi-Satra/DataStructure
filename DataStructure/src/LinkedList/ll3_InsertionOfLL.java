package LinkedList;

public class ll3_InsertionOfLL {
	private static void print(Node head){
		while(head != null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	private static Node insertHead(Node head, int val) {
		return new Node(val,head);
	}
	
	private static Node insertTail(Node head, int val) {
		if(head == null) {
			return new Node(val);
		}
		
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		Node newNode = new Node(val);
		temp.next=newNode;
		return head;
	}
	
	private static Node insertPosition(Node head, int el, int k) {
		//if head is null
		if(head == null) {
			if(k==1) return new Node(el);
			else return head;
		}
		
		if(k==1) {
			return new Node(el,head);
			
		}
		int cnt = 0;
		Node temp = head;
		while(temp!=null) {
			cnt++;
			if(cnt == (k-1)) {
				Node x=new Node(el,temp.next);
				temp.next=x;
				break;
			}
			temp=temp.next;
		}
		return head;
	}
	private static Node insertBeforeValue(Node head, int el , int val) {
		if(head == null) {
			return null;
		}
		if(head.data == val) {
			return new Node(el, head);
			
		}
		
		Node temp = head;
		while(temp.next != null) {
			if(temp.next.data == val) {
				Node x = new Node(el,temp.next);
				temp.next = x;
				break;
			}
			temp=temp.next;
		}
		return head;
		
	}
	public static void main(String[] args) {
		int[] arr = {12,5,6,8};
		ll2_ArrayToLL obj = new ll2_ArrayToLL();
		Node head = obj.convertArr2LL(arr);

//		head = insertHead(head,100);
		//head = insertTail(head,100);
		//head = insertPosition(head,100,5);
		head = insertBeforeValue(head,100,8);
		print(head);
	}

}
