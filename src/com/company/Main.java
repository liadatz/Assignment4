package com.company;

public class Main {

    public static void main(String[] args) {

        BTree<Integer> generatedTree = new BTree<Integer>(2);
        generatedTree.insert(54);
        generatedTree.insert(25);
        generatedTree.insert(18);
        generatedTree.insert(68);
        generatedTree.insert(16);
        generatedTree.insert(74);
        generatedTree.insert(58);
        generatedTree.insert(30);
        generatedTree.insert(86);
        generatedTree.insert(29);
        generatedTree.insert(71);
        generatedTree.insert(70);
        generatedTree.insert(98);
        generatedTree.insert(99);
        generatedTree.insert(11);
        generatedTree.insert(60);
        generatedTree.insert(76);
        generatedTree.insert(75);
        generatedTree.insert(97);
        generatedTree.insert(21);

        System.out.println(generatedTree.toString());
        generatedTree.delete(99);
        System.out.println(generatedTree.toString());
        generatedTree.delete(30);
        System.out.println(generatedTree.toString());
        generatedTree.delete(74);
        System.out.println(generatedTree.toString());

    }
}
