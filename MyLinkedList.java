package seminars.seminar4.MyLinkedList;
import seminars.seminar4.MyLinkedList.PrivateFiles.*;

public class MyLinkedList<T> implements MyList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void addFirst(T elem) {
        if (head == null) {
            this.head = new Node<T>(elem);
            size++;
        }
        else {
            Node<T> newHead = new Node<T>(elem);
            newHead.setNext(head);
            this.head = newHead;
            size++;
        }
    }

    @Override
    public void addLast(T elem) {
        if (head == null) {
            this.head = new Node<T>(elem);
            size++;
        }
        else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<T>(elem));
            size++;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int ind) {
        int index = 0;
        T res = null;
        Node<T> temp = head;
        while (temp != null) {
            if (index == ind) {
                return temp.getData();
            }
            temp = temp.getNext();
            index++;
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        Node<T> temp = head;

        while (temp != null) {
            sb.append(temp.getData()).append(", ");
            temp = temp.getNext();
        }
        if (sb.length() == 1) return "{}";
        sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1).append("}");
        return sb.toString();
    }
}
