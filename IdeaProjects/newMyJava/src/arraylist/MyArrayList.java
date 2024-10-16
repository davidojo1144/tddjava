package arraylist;

import java.util.Arrays;

    public class MyArrayList {

        private  int size = 0;
        private  String[] array;

        public MyArrayList() {
            this.array = new String [size];
        }

        public int size() {
            return this.size = array.length;
        }

        public boolean add(String element) {
            if (this.size == this.array.length) {
                resize();
            }
            array[size] = element;
            size++;
            return true;
        }

        public void add(int index, String element) {
            if (index < 0 || index > this.size) {
                throw new IndexOutOfBoundsException();
            }
            resize();
            for (int num = array.length-1; num >= index; num--) {
                if (num == index) {
                    array[num] = element;
                    break;
                }
                array[num] = array[num-1];
            }
        }



        public String remove(int index) {
            if (index < 0 || index >= this.size) {
                throw new IndexOutOfBoundsException();
            }
            String word = array[index];
            String [] newArray = new String[this.size - 1];
            for (int number = index; number < this.size-1; number++) {
                array[number] = array[number+1];
            }
            size--;
            array = Arrays.copyOf(newArray, size);
            return word;
        }

        public Boolean myEquals(String element) {
            for (int index = 0; index < this.size; index++) if (array[index].equalsIgnoreCase(element)) return true; return false;
        }
        public void clear() {
            array = new String[0];
            size = array.length;
        }



        public boolean addAll(int index, String[] element) {
            if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException();
            for (int alpha = 0; alpha < element.length; alpha++) {
                resize();
            }
            System.arraycopy(array, index, array, index + element.length, size-index);
            System.arraycopy(element, 0, array, index, element.length);
            System.out.println(Arrays.toString(array));
            return true;
        }

        public boolean addAll(String [] element) {
            if(element.length == 0) throw new NullPointerException();
            for (int index = array.length, count = 0; count < element.length; index++, count++) {
                resize();
                array[index] = element[count];
            }
            System.out.println(Arrays.toString(array));
            return true;
        }

        public String [] toArray() {
            return array;
        }


        private void resize() {
            int newCapacity = this.array.length + 1;
            array = Arrays.copyOf(array, newCapacity);
        }

    }

