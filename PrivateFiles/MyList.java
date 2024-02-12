package seminars.seminar4.MyLinkedList.PrivateFiles;

public interface MyList<T> {
    void addFirst(T elem);
    void addLast(T elem);
    int size();
    T get(int ind);
}