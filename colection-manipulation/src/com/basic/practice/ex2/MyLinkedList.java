package com.basic.practice.ex2;

public class MyLinkedList<E> {

    int numNodes = 0;

    static class Node<E> {

        private E data;
        Node<E> next;

        Node(E e) {
            data = e;
        }

        public E getData() {
            return data;
        }

        public void setData(E e) {
            this.data = e;
        }
    }

    public MyLinkedList() {
    }

    Node<E> head = null;
    Node<E> tail = null;

    void add(int index, E element) {
        if (index < 1) {
            throw new IndexOutOfBoundsException();
        } else if (index == 1) {
            addFirst(element);
        } else if (index > numNodes) {
            addLast(element);
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(element);
            current.next.next = temp;
            numNodes++;
        }

    }

    void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
        if (tail == null) {
            tail = head;
        }
    }

    void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        numNodes++;
    }

    E removeFirst() {
        if (numNodes == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            numNodes--;
            if (head == null) {
                tail = null;
            }
            return temp.getData();
        }
    }

    E removeLast() {
        if (numNodes == 0) {
            return null;
        } else if (numNodes == 1) {
            Node<E> temp = head;
            head = null;
            tail = null;
            numNodes--;
            return temp.getData();
        } else {
            Node<E> current = head;
            for (int i = 0; i < numNodes; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return temp.getData();
        }
    }

    E remove(int index) {
        if (index < 1 || index > numNodes) {
            return null;
        } else if (index == 1) {
            return removeFirst();
        } else if (index == numNodes) {
            return removeLast();
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index - 1; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            numNodes--;
            return current.getData();
        }

    }

    boolean remove(E element) {
        Node<E> current = head;
        for (int i = 0; i < numNodes; i++) {
            if (current.next.getData() == element) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
        }
        return false;
    }

    int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() throws CloneNotSupportedException {
        if (numNodes == 0) {
            throw new CloneNotSupportedException("The list is empty, you can't clone it!");
        } else {
            MyLinkedList<E> newLinkedList = new MyLinkedList<>();
            Node<E> current = head;
            for (int i = 0; i < numNodes; i++) {
                newLinkedList.addLast(current.getData());
                current = current.next;
            }
            return newLinkedList;
        }
    }

    boolean contains(E element) {
        Node<E> current = head;
        for (int i = 0; i < numNodes; i++) {
            if (current.next.getData() == element) {
                return true;
            }
        }
        return false;
    }

    int indexOf(E element) {
        Node<E> current = head;
        for (int i = 0; i < numNodes; i++) {
            if (current.getData() == element) {
                return i + 1;
            }
            current = current.next;
        }
        return -1;
    }

    boolean add(E e) {
        addLast(e);
        return true;
    }

    E get(int index) {
        if (index < 1 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < numNodes; i++) {
            if (i == index - 1) {
                break;
            }
            current = current.next;
        }
        return current.getData();
    }

    E getFirst() {
        if (numNodes == 0) {
            return null;
        } else {
            return head.getData();
        }
    }

    E getLast() {
        if (numNodes == 0) {
            return null;
        } else {
            Node<E> current = head;
            for (int i = 0; i < numNodes; i++) {
                current = current.next;
            }
            return current.getData();
        }
    }

    void clear() {
        Node<E> current = head;
        for (int i = 0; i < numNodes; i++) {
            current.setData(null);
            current = current.next;
        }
    }
}
