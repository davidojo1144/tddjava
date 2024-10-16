package myset;
public class MySet {

    private final int[] array;
    private int getElement;

    public MySet(int length) {
        this.array = new int[length];

    }

    public int getLength() {
        return array.length;
    }

    public boolean isEmpty() {
        return this.getElement == 0;
    }

    public boolean add(int element) {
        for (int index : array) {
            if (index == element) return false;
        }
        this.array[getElement] = element;
        getElement++;
        return true;
    }

    public boolean contain(int element) {
        for (int index : array) {
            if (index == element) return true;
        }
        return false;
    }

    public int size() {
        return getElement;
    }

    public Boolean remove(int element) {
        for (int index : array) {
            if (index == element) {
                array[index] = 0;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int index = 0; index < array.length; index++) {
            array[index] = 0;
            if (getElement == 0) break;
            getElement--;
        }
    }


    public boolean containsAll(int[] number) {
        int counter = 0;
        for (int element : array) {
            for (int index : number) {
                if (element == index) counter += 1;
            }
        }
        return array.length == counter || counter == number.length;
    }


}