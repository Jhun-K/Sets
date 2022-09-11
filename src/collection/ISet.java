package collection;

import java.util.List;

public interface ISet<T> {

    public boolean addNode( Node<T> node );
    public boolean deleteNode( Node<T> node );
    public Node<T> searchNode( Node<T> node );
    public List<Node<T>> joinSet( Set<T> set );
    public List<Node<T>> interceptSet( Set<T> set );

}
