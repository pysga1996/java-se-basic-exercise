package com.basic.bai_tap.trien_khai_cac_phuong_thuc_cua_ArrayList_theo_thu_vien_java.util_ArrayList.src.com.array_list_methods;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    void add(int index, E element) {
        if (index < 1 || index > (size + 1)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds!");
        }
        size++;
        if (size == elements.length) {
            ensureCapacity(elements.length * 2);
        }
        System.arraycopy(elements,index - 1, elements,1,size - index);
        elements[index - 1] = element;
    }

    E remove(int index) {
        if (index > size || index < 1) {
            return (E) elements;
        } else {
            if (index < size) {
                System.arraycopy(elements,index,elements,index - 1,size - index - 1);
            }
            elements[size - 1] = null;
            size--;
            return (E) elements;
        }
    }

    int size() {
        return size;
    }

    protected E clone() {
        return (E) Arrays.copyOf(elements,size);
    }

    boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    int indexOf (E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i + 1;
            }
        }
        return -1;
    }

    void ensureCapacity(int mintCapacity) {
        elements = Arrays.copyOf(elements,mintCapacity);
    }

    E get(int i) {
        if (i < 1 || i > size) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds!");
        } else return (E) elements[i - 1];
    }

    void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
}
