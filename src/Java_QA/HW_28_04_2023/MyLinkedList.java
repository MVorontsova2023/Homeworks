package HW_28_04_2023;

import java.util.*;

public class MyLinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return data;
    }

    public T removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        T data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return data;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    public LinkedListIterator listIterator() {
        return new LinkedListIterator();
    }

    public class LinkedListIterator implements ListIterator<T> {

        private Node<T> lastReturned;
        private Node<T> next;
        private int nextIndex;

        LinkedListIterator() {
            next = head;
            nextIndex = 0;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.data;
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public T previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            if (next == null) {
                lastReturned = next = tail;
            } else {
                lastReturned = next = next.prev;
            }
            nextIndex--;
            return lastReturned.data;
        }

        public int nextIndex() {
            return nextIndex;
        }

        public int previousIndex() {
            return nextIndex - 1;
        }

        public void remove() {
            if (lastReturned == null) {
                throw new IllegalStateException();
            }
            Node<T> prev = lastReturned.prev;
            Node<T> next = lastReturned.next;
            if (prev == null) {
                head = next;
            } else {
                prev.next = next;
                lastReturned.prev = null;
            }
            if (next == null) {
                tail = prev;
            } else {
                next.prev = prev;
                lastReturned.next = null;
            }
            lastReturned = null;
            size--;
            nextIndex--;
        }

        public void set(T element) {
            if (lastReturned == null) {
                throw new IllegalStateException();
            }
            lastReturned.data = element;
        }

        public void add(T element) {
            lastReturned = null;
            if (next == null) {
                addLast(element);
            } else if (next.prev == null) {
                addFirst(element);
            } else {
                Node<T> newNode = new Node<>(element);
                newNode.prev = next.prev;
                newNode.next = next;
                next.prev.next = newNode;
                next.prev = newNode;
                size++;
                nextIndex++;
            }
        }
    }
}
