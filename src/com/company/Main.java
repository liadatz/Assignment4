package com.company;

public class Main {

    public static void main(String[] args) {
        BTree<Integer> generatedTree = new BTree<Integer>(2);
//        for (int i = 1; i <= 10; i++) {
//            generatedTree.insert2pass(i);
//        }
        generatedTree.insert2pass(19);
        generatedTree.insert2pass(31);
        generatedTree.insert2pass(91);
        generatedTree.insert2pass(35);
        generatedTree.insert2pass(46);
        generatedTree.insert2pass(92);
        generatedTree.insert2pass(61);
        generatedTree.insert2pass(83);
        generatedTree.insert2pass(48);
        generatedTree.insert2pass(52);

        System.out.println(generatedTree.toString());


        //        System.out.println(generatedTree.validate());
    }
}
