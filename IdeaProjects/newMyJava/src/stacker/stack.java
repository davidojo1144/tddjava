package stacker;

import java.util.EmptyStackException;

public class stack {

    private final int length;
    private final int [] array;
    private int elementNumber;


        public stack(int length){
            this.length = length;
            this.array=new int [length];
        }

        public int getLength(){
            return length;
        }

        public boolean isEmpty() {
            int number = 0;
            for (int index = 0; index < this.length; index++) {
                if (array[index] == 0){
                    number += 1;
                }
            }
            return number == length;
        }

        public void push(int element) throws StackOverflowError{
            if((this.elementNumber -1) != this.length) {
                array[this.elementNumber] = element;
                this.elementNumber += 1;
            }
            else{
                throw new ArrayIndexOutOfBoundsException("Stack is full");
            }
        }

        public int pop() throws Exception {
            if (this.elementNumber == 0) throw new EmptyStackException();
            int num =  array[this.elementNumber-1];
            array[this.elementNumber-1] = 0;
            this.elementNumber -= 1;
            return num;
        }

        public int getElementNumber() {
            return this.elementNumber;
        }

        public int search(int element) {
            for (int index = 1, number = this.length - 1; index <= this.length; index++, number--) {
                if (array[number] == element) {
                    return index;
                }
            }
            return -1;
        }

        public int peek() {
            return array[this.elementNumber-1];
        }

    }

