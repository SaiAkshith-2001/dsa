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
	public void pushElementAtNthIndex(int data,int index) {
		if(index<=0) throw new IllegalArgumentException("Index must be greater than zero");
		System.out.println("\n\nafter insertion at index: "+index);
		Node newNode=new Node(data);
		if(index==1) {  //inserting at head
			newNode.next=head;
			if(head!=null) {
				head.prev=newNode;
			}
			head=newNode;
			if(tail==null) {
				tail=newNode;
			}
			return;
		}
		Node currentNode=head;
		int currentIndex=1;
		while(currentNode!=null&&currentIndex<index-1) {
			currentNode=currentNode.next;
			currentIndex++;
		}
		if(currentIndex==index-1) {
			newNode.prev=currentNode;
			newNode.next=currentNode.next;
			if(currentNode.next!=null) {
				currentNode.next.prev=newNode;
			}
			else {
				tail=newNode;
			}
			currentNode.next=newNode;
		} else {
			throw new IndexOutOfBoundsException("Index exceeds size of the linkedlist");
		}
	}
	public Node popFront() {
		if(head==null) {
			System.out.println("list is empty!");
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
			System.out.println("list is empty!");
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
	public void popElementAtNthIndex(int index) {
		if (index <= 0) {
			throw new IllegalArgumentException("Index must be greater than zero");
		}
		System.out.println("\n\nafter deletion at index: " + index);
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}
		if (index == 1) {
			head = head.next;
			if (head != null) {
				head.prev = null;
			} else {
				tail = null;
			}
			size--;
			return;
		}

		Node currentNode = head;
		int currentIndex = 1; // Start with 1-based indexing

		while (currentNode != null && currentIndex < index - 1) {
			currentNode = currentNode.next;
			currentIndex++;
		}

		if (currentNode == null || currentNode.next == null) {
			throw new IndexOutOfBoundsException("Index exceeds the size of the linked list");
		}

		Node nodeToDelete = currentNode.next;
		currentNode.next = nodeToDelete.next;

		if (nodeToDelete.next != null) {
			nodeToDelete.next.prev = currentNode;
		} else {
			tail = currentNode;
		}

		size--;
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
		dll.pushElementAtNthIndex(1000,11);
		dll.forwardTraversal();
		System.out.println("\n");
		dll.backwardTraversal();
		System.out.println("\nlength of DLL: "+dll.getSize());
		dll.popElementAtNthIndex(11);
		dll.forwardTraversal();
		System.out.println("\n");
		dll.backwardTraversal();
		System.out.println("\nlength of DLL: "+dll.getSize());
	}
}