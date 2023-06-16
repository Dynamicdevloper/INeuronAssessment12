package in.ineuron;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode ll=new LinkedListNode();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		
		LinkedListNode ll1=new LinkedListNode();
		ll1.add(10);
		ll1.add(5);
		ll1.add(100);
		ll1.add(5);
		System.out.println(nthNodeFromEnd(ll.head, 2));
		System.out.println(nthNodeFromEnd(ll1.head, 5));

	}
	
	public static int nthNodeFromEnd(Node head, int n) {
		Node temp=head;
		
		int count =0;
		
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		
		if(n>count) return -1;
		
		count=count-n;
		while(count-->0) {
			head=head.next;
		}
		return head.data;
	}

}
