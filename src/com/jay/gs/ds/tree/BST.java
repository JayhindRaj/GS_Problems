package com.jay.gs.ds.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author jayrajpo
 *
 * @param <T>
 */
public class BST<T extends Comparable<? super T>> {
	private Node<T> root;
	private List<Node<T>> leaves = new ArrayList<>();

	public BST() {

	}

	public BST(Collection<T> collection) {
		if (collection != null) {
			Iterator<T> it = collection.iterator();
			while (it.hasNext()) {
				this.add(new Node<T>(it.next()));
			}
		}
	}

	public void add(Node<T> n) {
		if (root == null) {
			root = n;
		} else {
			add(root, n);
		}
	}

	public void add(Node<T> root, Node<T> ne) {

		int comp = ne.getData().compareTo(root.getData());

		if (comp >= 1) {
			if (root.getRight() == null) {
				root.setRight(ne);
			} else {
				add(root.getRight(), ne);
			}
		} else {
			if (root.getLeft() == null) {
				root.setLeft(ne);
			} else {
				add(root.getLeft(), ne);
			}
		}
	}

	public void preOrder() {
		preOrder(this.root);
	}

	public void inOrder() {
		inOrder(this.root);
	}

	public void postOrder() {
		postOrder(this.root);
	}

	public int getHeight() {
		return getHeight(this.root);
	}

	public List<Node<T>> getLeaves() {
		getLeaves(this.root);
		return leaves;
	}

	public void printLevelOrder() {
		int h = getHeight();

		for (int i = 1; i <= h; i++) {
			printLevel(this.root, i);
		}
	}

	public boolean contains(T t) {
		return contains(this.root, t);
	}

	public void preporties() {
		System.out.println("Pre Order: ");
		this.preOrder();

		System.out.println("\nIn Order: ");
		this.inOrder();

		System.out.println("\nPost Order: ");
		this.postOrder();

		System.out.println("\nLevel Order: ");
		this.printLevelOrder();

		System.out.println("\nHeight: " + this.getHeight());
		System.out.println("\nLeave Nodes: " + this.getLeaves());
	}

	private void preOrder(Node<T> n) {
		if (n != null) {
			System.out.print(n.getData() + ", ");
			preOrder(n.getLeft());
			preOrder(n.getRight());
		}
	}

	private void inOrder(Node<T> n) {
		if (n != null) {
			inOrder(n.getLeft());
			System.out.print(n.getData() + ", ");
			inOrder(n.getRight());
		}
	}

	private void postOrder(Node<T> n) {
		if (n != null) {
			postOrder(n.getLeft());
			postOrder(n.getRight());
			System.out.print(n.getData() + ", ");
		}
	}

	private void printLevel(Node<T> n, int level) {
		if (n == null) {
			return;
		}
		if (level == 1) {
			System.out.print(n.getData() + ", ");
		} else if (level > 1) {
			printLevel(n.getLeft(), level - 1);
			printLevel(n.getRight(), level - 1);
		}
	}

	private int getHeight(Node<T> n) {
		if (n == null) {
			return 0;
		} else {
			return Math.max(getHeight(n.getLeft()), getHeight(n.getRight())) + 1;
		}
	}

	private void getLeaves(Node<T> n) {
		if (n != null) {
			if (n.getLeft() == null && n.getRight() == null) {
				leaves.add(n);
			}
			getLeaves(n.getLeft());
			getLeaves(n.getRight());
		}
	}

	private boolean contains(Node<T> root, T t) {
		if (root == null) {
			return false;
		} else {
			int comp = root.getData().compareTo(t);
			if (comp == 0) {
				return true;
			} else if (comp == 1) {
				return contains(root.getLeft(), t);
			} else {
				return contains(root.getRight(), t);
			}
		}
	}
}

class Node<T extends Comparable<? super T>> {
	private T data;
	private Node<T> left;
	private Node<T> right;

	public Node(T i) {
		this.data = i;
		this.left = null;
		this.right = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return String.valueOf(this.data);
	}
}