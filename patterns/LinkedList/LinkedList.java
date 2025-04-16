public class LinkedList
{
	int size;
	Node head;
	LinkedList() {
		this.size=0;
	}
	class Node {
		int data;
		Node next;
		Node(int data) {
			this.data=data;
			this.next=null;
			size++;
		}
	}
	public void addElementAtFirst(int data) {
		Node newNodeFirst=new Node(data);
		if(head==null) {
			head=newNodeFirst;
			return;
		}
		newNodeFirst.next=head;
		head=newNodeFirst;
	}
	public void addElementAtLast(int data) {
		Node newNodeLast=new Node(data);
		if(head==null) {
			head=newNodeLast;
			return;
		}
		Node currentNode=head;
		while(currentNode.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=newNodeLast;
	}
	public void deleteNodeAtFirst() {

		if(head==null) {
			System.out.println("no elements in list");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		head=head.next;
	}
	public void deleteNodeAtLast() {
		Node currentNode=head;
		Node lastNode=head.next;
		if(head==null) {
			System.out.println("no elements in list");
			return;
		}
		size--;
		if(currentNode.next==null) {
			head=null;
			return;
		}
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
			currentNode=currentNode.next;
		}
		currentNode.next=null;
	}
	public void displayLinkedList() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+"->");
			currentNode=currentNode.next;
		}
		System.out.println("Null");
	}
	public int getSize() {
		return size;
	}
// 	iterative approach
// 	public void reverseLL() {
// 		if(head==null||head.next==null) {
// 			return;
// 		}
// 		Node prevNode=head;
// 		Node currentNode=head.next;
// 		while(currentNode!=null) {
// 			Node nextNode=currentNode.next;
// 			currentNode.next=prevNode;
// 			//update
// 			prevNode=currentNode;
// 			currentNode=nextNode;
// 		}
// 		head.next=null;
// 		head=prevNode;
// 	}
// 	recursive approach
	public Node reverseRecursive(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node newHead=reverseRecursive(head.next);
		head.next.next=head;
		head.next=null;
		return newHead;
	}
	public static void main (String[] args) {
		LinkedList ll=new LinkedList();
		ll.addElementAtFirst(5);
		ll.addElementAtFirst(10);
		ll.addElementAtLast(15);
		ll.displayLinkedList();
// 		System.out.println("length: "+ll.getSize());
// 		System.out.print("after deletion\n");
// 		ll.deleteNodeAtFirst();
// 		ll.deleteNodeAtLast();
// 		ll.reverseLL();
		ll.head=ll.reverseRecursive(ll.head);
		ll.displayLinkedList();
// 		System.out.println("length: "+ll.getSize());
	}
}