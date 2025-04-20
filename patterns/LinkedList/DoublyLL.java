public class DoublyLL
{
	Node head;
	Node tail;
	int size;
	DoublyLL() {
		this.size=0;
	}
	class Node {
		int data;
		Node next;
		Node prev;
		Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
			size++;
		}
	}

	public void addElementAtFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
	public void addElementAtLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.prev=tail;
		tail.next=newNode;
		tail=newNode;
	}
	public Node popFront() {
		if(head==null) {
			System.out.println("list is empty");
			return null;
		}
		Node tempNode=head;
		head=head.next;
		size--;
		if(head!=null) {
			head.prev=null;
		}
		return head;
	}
	public Node popBack() {
		if(head==null) {
			System.out.println("list is empty");
			return null;
		}
		Node tempNode=tail;
		tail=tail.prev;
		size--;
		if(tail!=null) {
			tail.next=null;
		}
		return tail;
	}
	public void forwardTraversal() {
		if(head==null) {
			System.out.println("list is empty");
		}
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+"<->");
			currentNode=currentNode.next;
		}
		System.out.print("NULL");
	}
	public void backwardTraversal() {
		if(head==null) {
			System.out.println("list is empty");
		}
		Node currentNode=tail;
		while(currentNode!=null) {
			System.out.print(currentNode.data+"<->");
			currentNode=currentNode.prev;
		}
		System.out.print("NULL");
	}
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
		DoublyLL dll=new DoublyLL();
		for(int i=0; i<=50; i+=5) {
			dll.addElementAtFirst(i);
		}
		dll.addElementAtLast(100);
		dll.forwardTraversal();
		System.out.println("\n");
		dll.backwardTraversal();
		System.out.println("\nlength of DLL: "+dll.getSize());
		dll.popFront();
		dll.popBack();
		System.out.println("\n\nafter deletion:");
		dll.forwardTraversal();
		System.out.println("\n");
		dll.backwardTraversal();
		System.out.println("\nlength of DLL: "+dll.getSize());
	}
}