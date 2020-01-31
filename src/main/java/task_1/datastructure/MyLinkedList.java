package task_1.datastructure;

import java.util.Arrays;

public class MyLinkedList {
    private Node head; // основа
    private int size;

    public boolean add(int element) {
        boolean result = false;
        if (head == null) {
            this.head = new Node(element);
            result = true;
        } else {
            Node tmp = head; // для цикла
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(element));
            result = true;
        }
        size++;
        return result;
    }

    public String toString() {
        Node tmp = head; // основа
        int[] result = new int[size];
        int index = 0;
        while (tmp != null) {
            result[index] = tmp.getElement();
            tmp = tmp.getNext();
            index++;
        }
        return Arrays.toString(result);
    }

    public int get(int index) {
        Node tmp = head; // основа
        int tmpIndex = 0;
        while (tmp != null) {
            if (tmpIndex == index) {
                return tmp.getElement();
            } else {
                tmp = tmp.getNext();
                tmpIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public boolean delete(int index) {
        boolean result = false;
        Node tmp = head; // основа
        int tpmIndex = 0;
        if (index == 0) { // случай если запрос на удаление головного элемента
            head = head.getNext();
            size--;
            result = true;
            return result;
        }
        while (tmp != null) {
            if (tpmIndex == index - 1) { // решение проблемы нашел как перескочить удаляемый узел
                tmp.setNext(tmp.getNext().getNext());
                size--;
                result = true;
                return result;
            } else {
                tmp = tmp.getNext();
                tpmIndex++;
            }
        }
        return result;
    }

    public int size() {
        int size = -1;
        if (head != null) {
            return this.size;
        } else {
            return size;
        }
    }


    private static class Node {
        private int element;
        private Node next;

        public Node(int element) {
            this.element = element;
        }

        public int getElement() {
            return element;
        }

        public void setElement(int element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(5));
        System.out.println(myLinkedList.size);
    }
}
