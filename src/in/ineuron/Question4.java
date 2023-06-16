package in.ineuron;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode ll=new LinkedListNode();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		//ll.add(4);
		ll.add(4);
		ll.add(3);
		ll.add(2);
		ll.add(1);
		
		System.out.println(checkPalindrome(ll.head));
	}
	
	public static boolean checkPalindrome(Node head) {
		
		if(head==null || head.next==null) return true;
		
		Node slow=head;
		Node fast=head;
		Node head2=null;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		head2= slow.next;
		slow.next= null;
		
		head2= reverse(head2);
		
		while(head!=null && head2!=null) {
			if(head.data!=head2.data) return false;
			head=head.next;
			head2=head2.next;
		}
		
		return true;
		
	}

	private static Node reverse(Node head2) {
		
		Node prev=null;
		Node post=head2;
		
		while(post!=null) {
			Node curr=post;
			post=post.next;
			curr.next=prev;
			prev=curr;
		}
		return prev;
	}

}
