package com.company;

public class Main {

    public static void main(String[] args) {
        BTree<Integer> generatedTree = new BTree<Integer>(2);
        generatedTree.insert(93);
        generatedTree.insert(89);
        generatedTree.insert(67);
        generatedTree.insert(32);
        generatedTree.insert(57);
        generatedTree.insert(33);
        generatedTree.insert(78);
        generatedTree.insert(92);
        generatedTree.insert(54);
        generatedTree.insert(55);
        generatedTree.insert(21);

        System.out.println(generatedTree.toString());
        generatedTree.delete(57);
        generatedTree.delete(78);
        generatedTree.delete(33);

        System.out.println(generatedTree.toString());

    }
}
