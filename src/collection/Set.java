package collection;

import java.util.ArrayList;

public class Set<T> implements ISet<T>{

    private ArrayList<Node<T>> nodes;

    public Set() {
        nodes = new ArrayList<>();
    }

    public Set( Node<T> newNode ) {
        nodes = new ArrayList<>();
        nodes.add(newNode);
    }

    public ArrayList<Node<T>> getNodes() {
        return nodes;
    }

    @Override
    public boolean addNode(Node<T> newNode) {
        boolean added = false;
        if (newNode != null) {
            nodes.add(newNode);
            added = true;
        }
        return added;
    }

    @Override
    public boolean deleteNode(Node<T> node) {
        boolean deleted = false;
        for (int i = 0; i < nodes.size() ; i++) {
            Node<T> temp = nodes.get(i);
            if( temp.getData().equals(node.getData()) ) {
                nodes.remove(i);
                deleted = true;
            }
        }
        return deleted;
    }

    @Override
    public Node<T> searchNode(Node<T> node) {
        Node<T> temp = null;
        boolean stop = false;
        for( int i = 0; i < nodes.size() && !stop ; i++ ) {
            temp = nodes.get(i);
            if( temp.getData().equals(node.getData()) ) {
                stop = true;
            }
        }
        return temp;
    }

    @Override
    public ArrayList<Node<T>> joinSet(Set<T> set) {
        for( int i = 0 ; i < set.getNodes().size() ; i++ ) {
            Node<T> temp = set.getNodes().get(i);
            nodes.add(temp);
        }
        return nodes;
    }

    @Override
    public ArrayList<Node<T>> interceptSet(Set<T> set) {
        ArrayList<Node<T>> myList = new ArrayList<>();
        ArrayList<Node<T>> temp = set.getNodes();

        for( int i = 0; i < nodes.size() ; i++ ) {
            Node<T> myNode = nodes.get(i);
            for( int j = 0 ; j < temp.size() ; j++ ) {
                Node<T> myOtherNode = temp.get(j);
                if( myNode.getData().equals(myOtherNode.getData()) ) {
                    myList.add(myNode);
                }
            }
        }
        return myList;
    }
}
