class LinkedList {
    java.util.LinkedList<Integer> linkedList;

    public LinkedList() {
        this.linkedList = new java.util.LinkedList<>();
    }

    public int get(int index) {
        if (linkedList.isEmpty() || index < 0 || index >= linkedList.size()) {
            return -1;
        }
        return linkedList.get(index);
    }

    public void insertHead(int val) {
        linkedList.addFirst(val);
    }

    public void insertTail(int val) {
        linkedList.addLast(val);
    }

    public boolean remove(int index) {
        if (linkedList.isEmpty() || index < 0 || index >= linkedList.size() || linkedList.get(index) == -1) {
            return false;
        } else {
            linkedList.remove(index);
            return true;
        }
    }

    public ArrayList<Integer> getValues() {
        return new ArrayList<>(linkedList);
    }
}