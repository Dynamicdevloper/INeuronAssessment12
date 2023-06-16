package in.ineuron;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode ll =new LinkedListNode();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		
		ll.head=nDeletion(ll.head, 2,2);
		
		
		LinkedListNode ll1 =new LinkedListNode();
		ll1.add(1);
		ll1.add(2);
		ll1.add(3);
		ll1.add(4);
		ll1.add(5);
		ll1.add(6);
		ll1.add(7);
		ll1.add(8);
		ll1.add(9);
		ll1.add(10);
		
		ll1.head=nDeletion(ll1.head, 3,2);
		
		
		LinkedListNode ll2 =new LinkedListNode();
		ll2.add(1);
		ll2.add(2);
		ll2.add(3);
		ll2.add(4);
		ll2.add(5);
		ll2.add(6);
		ll2.add(7);
		ll2.add(8);
		ll2.add(9);
		ll2.add(10);
		
		ll2.head=nDeletion(ll2.head, 1,1);
		
		while(ll.head!=null) {
			System.out.print(ll.head.data+"--->");
			ll.head=ll.head.next;
		}
		
		System.out.println();
		
		while(ll1.head!=null) {
			System.out.print(ll1.head.data+"--->");
			ll1.head=ll1.head.next;
		}
		
		System.out.println();
		
		while(ll2.head!=null) {
			System.out.print(ll2.head.data+"--->");
			ll2.head=ll2.head.next;
		}
		

	}
	
	public static Node nDeletion(Node head, int m, int n) {
		if(head ==null || m==0) return head;
		
		Node temp= head;
		int t=m;
		while(t-->1 && temp!=null) {
			temp=temp.next;
		}
		
		Node head2=null;
		if(temp!=null) {
			head2= temp.next;
			temp.next=null;
		}
		t=n;
		while(t-->1 && head2!=null) {
			head2=head2.next;
		}
		
		Node head3=null; 
		if(head2!=null)
			head3= head2.next;
		if(temp!=null)
			temp.next= nDeletion(head3, m, n);
		
		return head;
	}

}
