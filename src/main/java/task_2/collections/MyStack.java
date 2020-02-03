package task_2.collections;

/**
 * Упрощенный вариант Stack
 */
public class MyStack {

    private Node head;
    int size;
    private int top;

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getElement() {
            return value;
        }

        public void setElement(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public boolean push(int value) {
        boolean result = false;
        Node tmp = head;
        if (head == null) {
            head = new Node(value);
            result = true;
            return result;
        } else {
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(value));
            result = true;
            return result;
        }
    }


    public boolean isEmpty() {
        boolean result = false;
        if (size == 0 && head == null) {
            result = true;
            return result;
        }
        return result;
    }

    public int peek() {
        Node tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        int value = tmp.getElement();
        return value;
    }
}
