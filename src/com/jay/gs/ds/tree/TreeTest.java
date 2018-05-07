package com.jay.gs.ds.tree;

public class TreeTest {
	public static void main(String[] args) {
		BST<Integer> bst = new BST<>();
		bst.add(new Node<Integer>(10));
		bst.add(new Node<Integer>(15));
		bst.add(new Node<Integer>(23));
		bst.add(new Node<Integer>(41));
		bst.add(new Node<Integer>(7));
		bst.add(new Node<Integer>(3));
		bst.add(new Node<Integer>(17));
		bst.add(new Node<Integer>(36));
		bst.add(new Node<Integer>(19));
		bst.add(new Node<Integer>(11));
		bst.add(new Node<Integer>(1));
		bst.add(new Node<Integer>(13));

		bst.preporties();
		System.out.println(bst.contains(3));
		System.out.println(bst.contains(9));
		System.out.println(bst.contains(12));
		System.out.println(bst.contains(23));
	}

}
