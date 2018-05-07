package com.jay.gs.ds;

public class LinkedListImpl {
	private Node head;
	
	public LinkedListImpl() {
		
	}
	
	public void add(int i) {
		Node n = new Node(i);
		if(head == null) {
			head = n;
		} else {
			n.setNext(head);
			head = n;
		}
	}
	
	public void print() {
		if(head!=null) {
			Node t = head;
			while(t!=null) {
				System.out.println(t.getData() + ", ");
				t = t.getNext();
			}	
		}
	}
	
	public void print(Node n) {
			while(n!=null) {
				System.out.println(n.getData() + ", ");
				n = n.getNext();
			}	
	}
	
	public 	Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
	
	public static void main(String[] args) {
		LinkedListImpl impl = new LinkedListImpl();
		
		impl.add(12);
		impl.add(15);
		impl.add(30);
		
		impl.add(130);
		impl.add(3);
		impl.add(7);
		impl.add(63);
		impl.add(11);
		
		impl.print();
		
		Node n =impl.head;
		
	Node rn=	impl.reverse(n);
	System.out.println("reversed:");
		impl.print(rn);
		
	}
}

 class Node {
	 private int data;
	 private Node next;
	 
	public Node(int i) {
		this.data = i;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
 }
