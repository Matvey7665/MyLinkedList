package GBLinkedList;

public class MyLinkedList<E> implements Linked<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode = new Node<E>(null,firstNode,null);
        firstNode = new Node<E>(null,null,lastNode);

    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null,prev,null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<>(null,null,next);
        next.setPrevElement(firstNode);
        size++;


    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0;i<counter;i++){
            target = getNextEl(target);
        }
        return target.getCurrentElement();
    }
    private Node<E> getNextEl(Node<E> current){
        return current.getNextElement();
    }
}
