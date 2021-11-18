package Assignments.Assignment10;

public class Node<T> {
    T object;
    Node<T> next=null;
     Node(T object)
    {
        this.object=object;

    }

    public T getObject() {
        return object;
    }

    public Node<T> getNext() {
        return next;
    }
}
