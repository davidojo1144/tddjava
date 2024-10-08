package stacking;

public class Stacking {
    private int stackSize;
    private int capacity = 0;

    public boolean isEmpty() {
        if (stackSize == 0) return true;
        return false;
    }

    public void pushing(String push) {
        stackSize++;
    }

    public void poping() {
        stackSize--;
    }

    public int checkSize() {
        return this.stackSize;
    }

    public int getCapacity() {
        return this.stackSize = this.stackSize + this.capacity;
    }

    public boolean isfull(){
        if(stackSize == this.capacity) return true;
        return false;
    }

}
