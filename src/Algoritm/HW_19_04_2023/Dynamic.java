package HW_19_04_2023;

public interface Dynamic {

    void addAt(int index, int data);

    void add(int data);

    void remove(int data);

    void removeAt(int index);

    void growSize();

    void shrinkSize();

    void set(int index, int data);

    int get(int index);

    void clear();

    boolean contains(int data);

    boolean isEmpty();
}
