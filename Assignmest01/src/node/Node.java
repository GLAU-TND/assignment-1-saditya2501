package node;


public class Node<T> {
    private T data;
    private Node<T> next;

    //Getter
    public T getData() {
        return data;
    }

    //Setter
    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node {" +
                "data= " + data + '}';
    }
}
