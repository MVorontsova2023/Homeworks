package HW_26_04_2023;

public class MyLinkedList implements Linked {
    private Node last;
    private Node first;
    private int size;

    public MyLinkedList() {
        last = null;
        first = null;
        size = 0;
    }

    private class Node {
        private Node next;
        private Node previous;
        private int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    @Override
    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
        size++;
    }

    @Override
    public void addAt(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node newNode = new Node(data);
        if (index == 0) {
            if (isEmpty()) {
                first = newNode;
                last = newNode;
            } else {
                newNode.next = first;
                first.previous = newNode;
                first = newNode;
            }
        } else if (index == size) {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        } else {
            Node current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.previous.next = newNode;
            newNode.previous = current.previous;
            newNode.next = current;
            current.previous = newNode;
        }
        size++;
    }

    @Override
    public void remove(int data) {
        Node current = first;
        while (current != null) {
            if (current.data == data) {
                if (current == first) {
                    first = current.next;
                    if (first != null) {
                        first.previous = null;
                    }
                } else if (current == last) {
                    last = current.previous;
                    last.next = null;
                } else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            first = first.next;
            if (first != null) {
                first.previous = null;
            }
        } else if (index == size - 1) {
            last = last.previous;
            last.next = null;
        } else {
            Node current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }

    @Override
    public void set(int index, int data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = data;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public void clear() {
        Node current = first;
        while (current != null) {
            Node next = current.next;
            current.previous = null;
            current.next = null;
            current.data = 0;
            current = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public boolean contains(int data) {
        Node current = first;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
