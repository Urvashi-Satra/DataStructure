package DoublyLL;

public class DLL3_Insertion {

	static void print(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	private static Node insertBeforeHead(Node head,int val) {
		Node newHead=new Node(val,head,null);
		head.back=newHead;
		return newHead;
	}
	private static Node insertBeforeTail(Node head,int val) {

		if(head.next == null) return insertBeforeHead(head,val);
		
		Node tail = head;
		
		while(tail.next != null) {
			tail=tail.next;
		}
		Node prev =tail.back;
		Node newNode = new Node(val,tail,prev);
		prev.next=newNode;
		tail.back=newNode;
		return head;
	}
	
	private static Node insertBeforeKthElement(Node head, int k , int val) {
		if(k==1) return insertBeforeHead(head,val);
		Node temp = head;
		int cnt=0;
		while(temp != null) {
			cnt++;
			if(cnt == k ) break;
			temp=temp.next;
		}
		
		Node prev=temp.back;
		Node newNode=new Node(val,temp,prev);
		prev.next=newNode;
		temp.back = newNode;
		return head;
		
	}
	static void insertBeforeNode(Node node,int val) {
		Node prev=node.back;
		Node newNode=new Node(val, node,prev);
		prev.next=newNode;
		node.back=newNode;
	}
	 public static int sum(Node head, int k){
	      int cnt=0;
	      int sum=0;
	      
	      Node temp=head;
	      while(temp!=null){
	          cnt++;
	          temp=temp.next;
	      }
	        
	      int fin = cnt-k;
	      temp = head;
	      for(int i = 1 ; i <= cnt ; i++){
	          if(i>fin){
	              sum += temp.data;
	          }
	          temp = temp.next;
	      }
	      
	      return sum;
	    }
	
	public static void main(String[] args) {
		int[] arr= {12,5,6,8};
		DLL1_Array2LinkedList obj = new DLL1_Array2LinkedList();
		
		Node head=obj.convertArr2Dll(arr);
		head = insertBeforeHead(head,1);
		head=insertBeforeTail(head,2);
		head =insertBeforeKthElement(head,3,3);
		insertBeforeNode(head.next.next.next,500);
		print(head);
		System.out.println("\n"+sum(head,4));
		
	}
}
