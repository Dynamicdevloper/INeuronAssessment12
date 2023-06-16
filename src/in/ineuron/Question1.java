package in.ineuron;

public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode ll=new LinkedListNode();
		ll.add(2);
		ll.add(4);
		ll.add(6);
		ll.add(7);
		ll.add(5);
		ll.add(1);
		
		Node n=deleteMiddle(ll.head);
		
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static Node deleteMiddle(Node head) {
		
		if(head==null || head.next==null) return null;
		Node slow= head;
		Node fast=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		
		
		slow.next=slow.next.next;
		return head;
	}
	
	

}


