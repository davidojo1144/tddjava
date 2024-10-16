package queue;
public class Queue{

private int [] array;
private int elementNumber;
private int number;

public Queue(int size) {
    this.array = new int [size];
}

public int size() {
    return array.length;
}

public boolean isEmpty() {
    return this.elementNumber == 0;
}

public void add(int element) {
    if (elementNumber == array.length) {
        throw new StackOverflowError();
    }
    array[elementNumber] = element;
    elementNumber++;
}

public int remove() {
    if (elementNumber == 0) {
        throw new ArrayIndexOutOfBoundsException();
    }
    int element = array[number];
    this.number++;
    return element;
}

public int countElement() {
    return elementNumber-number;
}

public int element() {
    return array[number];
}
}
