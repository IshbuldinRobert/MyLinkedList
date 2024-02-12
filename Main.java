package seminars.seminar4.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.addLast("first");
        linkedList.addLast("second");
        linkedList.addLast("rfdth");
        linkedList.addFirst("zero2");
        linkedList.addFirst("zero1");
        linkedList.addLast("last");
        // linkedList.addLast(5);
        
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(linkedList.size()-1));
    }
}
