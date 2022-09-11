package main;

import collection.Node;
import collection.Set;

import java.util.ArrayList;

public class Main {

    // Uncomment the lines to test the functionality of the methods.
    public static void main(String[] args) {
        Set<Integer> mySet1 = new Set<>();
        Set<Integer> mySet2 = new Set<>();

        mySet1.addNode(new Node<Integer>(2));
        mySet1.addNode(new Node<Integer>(4));
        mySet1.addNode(new Node<Integer>(5));
        mySet1.addNode(new Node<Integer>(8));
        mySet1.addNode(new Node<Integer>(10));
        mySet1.addNode(new Node<Integer>(12));

        mySet2.addNode(new Node<Integer>(1));
        mySet2.addNode(new Node<Integer>(3));
        mySet2.addNode(new Node<Integer>(5));
        mySet2.addNode(new Node<Integer>(7));
        mySet2.addNode(new Node<Integer>(9));
        mySet2.addNode(new Node<Integer>(12));

        // showNodes(mySet1.getNodes());
        // showNodes(mySet2.getNodes());

        mySet1.deleteNode(new Node<Integer>(2));
        mySet2.deleteNode(new Node<Integer>(9));

        // showNodes(mySet1.getNodes());
        // showNodes(mySet2.getNodes());

        // System.out.println(mySet1.searchNode(new Node<>(10)).getData());
        // System.out.println(mySet2.searchNode(new Node<>(3)).getData());

        // showNodes(mySet1.joinSet(mySet2));

        // showNodes(mySet1.interceptSet(mySet2));
    }

    public static void showNodes(ArrayList<Node<Integer>> list) {
        for( int i = 0 ; i < list.size() ; i++ ) {
            System.out.println("(" + list.get(i).getData() + ")");
        }
    }

}
