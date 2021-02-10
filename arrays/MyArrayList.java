package ua.kpi.fict.acts.it03.asdlabs.lab1.arrays;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private int[] items;

    public MyArrayList() {
        size = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    // ##### ADDITIONAL #####

    public void ensureCapacity(int newCapacity) {
        if (newCapacity < size) return;
        int[] old = items;
        items =  new int[newCapacity];
        for (int i = 0; i < size(); i++) {
            items[i] = old[i];
        }
    }

    public int size() {
        return size;
    }

    public int getSize()
    {
        return items.length;
    }

    public int getEL(int index) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();

        return items[index];
    }

    private void resize() {
        if (size >= items.length) {
            int[] newValues = new int[size * 3 / 2 + 1];
            System.arraycopy(items, 0, newValues, 0, size);
            items = newValues;
        }
        if (size >= DEFAULT_CAPACITY && size < items.length / 4) {
            int[] newValues = new int[size * 3 / 2 + 1];
            System.arraycopy(items, 0, newValues, 0, size);
            items = newValues;
        }
    }

    // ##### ADDING #####

    public void addLast(int object) {
        resize();
        items[size] = object;
        size++;
    }

    public void addFirst(int object) {
        resize();
        if (size == 0) {
            items[0] = object;
            size++;
        }
        else
        {
            int[] tmpArr = new int[items.length];
            tmpArr[0] = object;
            int itemsCounter = 0;
            for (int i = 1; i < tmpArr.length; i++)
            {
                tmpArr[i] = items[itemsCounter];
                itemsCounter++;
            }
            items = tmpArr;
        }
    }

    public void addAt(int object, int index) {
        resize();
        System.arraycopy(items, index, items, index + 1, size - index);
        items[index] = object;
        ++size;
    }

    // ##### DELETING #####


    public int remove(int index) {
        int removeItem = items[index];
        for (int i = index; i < size() - 1; i++) {
            items[i] = items[i + 1];
        }
        size--;
        return removeItem;
    }
    public void removeFirst()
    {
        remove(0);
    }

    public void removeLast()
    {
        remove(size);
    }

    // ##### REPLACEMENT #####

    public void replaceAt(int index, int newVal) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
        items[index] = newVal;
    }

    public void replaceFirst(int obj)
    {
        items[0] = obj;
    }

    public void replaceLast(int obj)
    {
        items[items.length-1] = obj;
    }


    // ##### INDEX OF #####

    public int indexOf(int obj) {
        for (int i = 0; i < size; i++) {
            if (items[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    // ##### SUM OF ELEMENTS #####

    public int getSum()
    {
        int result = 0;
        for (int i = 0; i < items.length; i++)
        {
            result = result + items[i];
        }
        return result;
    }

    public void print()
    {
        for (int i =0;i < size; i++)
        {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}
