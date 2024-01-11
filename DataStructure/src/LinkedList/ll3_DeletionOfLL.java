package LinkedList;

public class ll3_DeletionOfLL {

	private static void print(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	private static Node removesHead(Node head){
		if(head == null)
			return head;
		head=head.next;
		
		return head;
		
	}
	private static Node removesTail(Node head) {
		Node temp=head;
		if(head==null || head.next== null )
			return null;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	
	private static Node removeK(Node head, int k) {
		if(head == null ) return head;
		if(k ==1) {
			Node temp = head;
			head = head.next;
			return head;
			
		}
		int cnt = 0 ;
		Node temp = head;
		Node prev = null;
		while(temp != null) {
			cnt++;
			if(cnt == k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
	
	private static Node removeElement(Node head, int el) {
		if(head == null ) return head;
		if(head.data == el) {
			Node temp = head;
			head = head.next;
			return head;
			
		}
		
		Node temp = head;
		Node prev = null;
		while(temp != null) {
		
			if(temp.data ==el) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
	public static void main(String[] args) {
		int[] arr = {12,5,6,8};
		ll2_ArrayToLL obj = new ll2_ArrayToLL();
		Node head = obj.convertArr2LL(arr);
		
		//head=removesHead(head);
		//head=removesTail(head);
		//head=removeK(head,2);
		head=removeElement(head,12);
		print(head);
		

	}

}
