package in.ineuron;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode ll= new LinkedListNode();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.tail.next=ll.head.next;
		System.out.println(checkLoop(ll.head));
	}
	
	public static int checkLoop(Node head) {
		
		Node slow =head;
		Node fast=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			
			if(fast==slow) return 1;
		}
		return 0;
	}

}
