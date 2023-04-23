package HW_19_04_2023;

import java.util.Arrays;

public class DynamicArray implements Dynamic {

    public int[] array;
    private int count = 0;
    private int size;

    public DynamicArray() {
        this.size = 10; // Длина массива по умолчанию
        this.array = new int[size];
    }

    public DynamicArray(int size) {
        this.size = size;
        this.array = new int[size];
    }

    @Override
    public void addAt(int index, int data) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        if (count == size) {
            growSize();
        }
        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = data;
        count++;
    }

    @Override
    public void add(int data) {
        addAt(count, data);
    }

    @Override
    public void remove(int data) {
        for (int i = 0; i < count; i++) {
            if (array[i] == data) {
                removeAt(i);
                return;
            }
        }
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index + 1; i < count; i++) {
            array[i - 1] = array[i];
        }
        count--;
        if (size >= 2 * count) {
            shrinkSize();
        }
    }

    @Override
    public void growSize() {
        size *= 2;
        array = Arrays.copyOf(array, size);
    }

    @Override
    public void shrinkSize() {
        size = count;
        array = Arrays.copyOf(array, size);
    }

    @Override
    public void set(int index, int data) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = data;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void clear() {
        size = 10;
        array = new int[size];
        count = 0;
    }

    @Override
    public boolean contains(int data) {
        for (int i = 0; i < count; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}


