package com.company;

public class Main {

    public static void main(String[] args) {
	    BTree tree = new BTree();
		tree.insert(35);
		tree.insert(31);
		tree.insert(58);
		tree.insert(16);
		tree.insert(61);
		tree.insert(25);
		tree.insert(47);
		tree.insert(30);
		tree.insert(54);
		tree.insert(92);
		tree.insert(53);
		tree.insert(94);
		tree.insert(20);
		System.out.println(tree.toString());
		tree.delete(54);
		System.out.println(tree.toString());
    }
}
