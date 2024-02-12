package seminars.seminar4.MyLinkedList.PrivateFiles;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T elem) {
        this.data = elem;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
