package LinkedList;

public class ll2_ArrayToLL {

	/**
	 * We declare head with first arr value
	 * we take one mover which we assign as head
	 * We then loop complete array 
	 * and create object of node where we declare movers next as the object
	 * and then assign mover as temp.
	 * @param arr
	 * @return
	 */
	 static Node convertArr2LL(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
		}
		return head;
	}
	
	/**
	 * Calculates length of Linked List
	 * 1)declare variable to count
	 * 2)traverse LL and increase count n return it
	 * 
	 * @param head
	 * @return count
	 */
	private static int lengthofLL(Node head) {
		int count=0;
		Node temp = head;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	
	static boolean checkIfPresent(Node head,int val) {
		Node temp=head;
		while(temp != null) {
			if(temp.data==val) 
				return true;
			temp=temp.next;
		}
		
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {2,5,6,7};
		Node head=convertArr2LL(arr);
		System.out.println("Converting Array to LL : " +head.data);
		//traversal of LL
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" "+"\n");
			temp=temp.next;
		}
		
		System.out.println("Length of LL : " +lengthofLL(head));
		
		System.out.println("Element is present : " +checkIfPresent(head,7) );
	}

}
