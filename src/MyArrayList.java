import java.util.Arrays;

public class MyArrayList implements StringList {


    private String[] storage;
    private int storageSize;

    public MyArrayList() {
        this.storage = new String[10];

    }

    //////////////////////////////////////////////////////
    @Override
    public String add(String item) {
        validateItem(item);
        storage[storageSize] = item;
        storageSize++;
        return item;
    }

    @Override
    public String add(int index, String item) {
        validateItem(item);
        if (index > storageSize || index < 0) {
            throw new IllegalArgumentException("Неверный индекс");
        } else if (index == storageSize) {
            storage[storageSize] = item;
            storageSize++;
            return item;
        } else {
            System.arraycopy(storage, index, storage, index + 1, storageSize - index);
            storage[index] = item;
            storageSize++;
        }
        return item;
    }


    @Override
    public String set(int index, String item) {
        validateItem(item);
        if (index > storageSize || index < 0) {
            throw new IllegalArgumentException("Неверный индекс");
        } else {
            storage[index] = item;
        }

        return item;
    }

    @Override
    public int indexOf(String item) {
        validateItem(item);
        for (int i = 0; i < storageSize; i++) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String remove(String item) {
        validateItem(item);
        int findIndex = indexOf(item);
        if (findIndex == -1) {
            throw new RuntimeException("Элемент отсутствует");
        }
        if (findIndex != storage.length - 1) {
            System.arraycopy(storage, findIndex + 1, storage, findIndex, storageSize - findIndex);
        }
        storageSize--;
        return item;
    }

    @Override
    public String remove(int index) {
        if (index > storageSize || index < 0) {
            throw new IllegalArgumentException("Неверный индекс");
        }

        String removeItem = storage[index];
        if (index != storage.length - 1) {
            System.arraycopy(storage, index + 1, storage, index, storageSize - index);
        }
        storageSize--;

        return removeItem;
    }

    @Override
    public boolean contains(String item) {
        validateItem(item);
        int findIndex = indexOf(item);
        return findIndex != -1;
    }


    @Override
    public int lastIndexOf(String item) {
        validateItem(item);
        for (int i = storageSize - 1; i > 0; i--) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index > storageSize || index < 0) {
            throw new IllegalArgumentException("Неверный индекс");
        }
        return storage[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null) {
            throw new RuntimeException("null");
        }
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return storageSize;
    }

    @Override
    public boolean isEmpty() {
        return storageSize == 0;
    }

    @Override
    public void clear() {
        storageSize = 0;
    }

    @Override
    public String[] toArray() {

        return Arrays.copyOf(storage,storageSize);
    }

    private void validateItem(String item) {
        if (item == null) {
            throw new RuntimeException("null");
        }
    }
}
