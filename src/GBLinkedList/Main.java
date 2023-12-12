package GBLinkedList;

public class Main {
    public static void main(String[] args) {
        Linked<String> ld = new MyLinkedList<>();
        ld.addLast("ans");
        ld.addFirst("1");
        System.out.println(ld.size());
        System.out.println(ld.getElementByIndex(0));
    }
}
