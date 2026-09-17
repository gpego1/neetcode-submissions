class DynamicArray {
    int[] array;
    int size = 0;
    int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        if (capacity > 0) {
            array = new int[capacity];
        }
    }

    public int get(int i) {
        if (array.length != 0) {
            return array[i];
        } else {
            return -1;
        }
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        array[size] = n;
        size++;
    }

    public int popback() {
        int val = array[size - 1];
        size--;
        return val;
    }

    private void resize() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}