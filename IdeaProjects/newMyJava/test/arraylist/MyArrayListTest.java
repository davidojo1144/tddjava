package arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class MyArrayListTest {
        private MyArrayList myArrayList = new MyArrayList();

        @Test
        public void  testThatArrayListIsEmpty() {
            assertEquals(0, myArrayList.size());
        }

        @Test
        public void testThatICanAdd(){
            assertTrue(myArrayList.add("Ojo"));
        }

        @Test
        public void testThatICanAddOMoreThanElements() {
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
        }

        @Test
        public void testThatICanRemove() {
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            myArrayList.remove(2);
            assertEquals(3, myArrayList.size());
        }

        @Test
        public void testThatICanRemoveAndGetTheElementRemove() {
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            assertEquals("Akinzo", myArrayList.remove(2));
            assertEquals(3, myArrayList.size());
        }

        @Test
        public void testThatICanNotRemoveOutOfTheIndex(){
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            assertThrows(IndexOutOfBoundsException.class, () -> myArrayList.remove(20));
            assertThrows(IndexOutOfBoundsException.class, () -> myArrayList.remove(-1));
            assertEquals(4, myArrayList.size());
        }

        @Test
        public void testToEqualsElementInTheArrayList(){
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            assertTrue(myArrayList.myEquals("BADDOo"), "Baddoo");
        }

        @Test
        public void testToReturnFalseWhenIPassInAnElementNotInTheArrayList(){
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            assertFalse(myArrayList.myEquals("DDOo"), "Baddoo");
        }

        @Test
        public void testToClearArrayList(){
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            myArrayList.clear();
            assertEquals(myArrayList.size(), 0);
        }

        @Test
        public void testToAddToAParticularIndex(){
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            myArrayList.add(1, "Ojo");
            assertEquals(myArrayList.size(), 4);
        }

        @Test
        public void testToAddCollectionAtAParticularIndex(){
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            String [] name = {"adeleke", "adeyemi", "fm", "adeyemi"};
            assertTrue(myArrayList.addAll(2, name));
            assertNotEquals(myArrayList.size(), 4);
            assertEquals(myArrayList.size(), 8);
        }

        @Test
        public void testToThrowExceptionIfIndexIsLessOrGreaterThanArraylistSize(){
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            String [] name = {"adeleke", "adeyemi", "fm", "adeyemi"};
            assertThrows(IndexOutOfBoundsException.class, () -> myArrayList.addAll(-2, name));
        }

        @Test
        public void testToAddCollectionToTheEndOfTheList(){
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            String [] name = {"adeleke", "adeyemi", "fm", "adeyemi"};
            assertTrue(myArrayList.addAll(name));
        }

        @Test
        public void testToReturnExceptionIfCollectionIsEmpty(){
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            String [] name = {};
            assertThrows(NullPointerException.class, () -> myArrayList.addAll(name));
        }

        @Test
        public void testToReturnAllElementInTheArrayList(){
            assertTrue(myArrayList.add("Ojo"));
            assertTrue(myArrayList.add("Baddoo"));
            assertTrue(myArrayList.add("Akinzo"));
            assertTrue(myArrayList.add("david"));
            String [] name = {"adeleke", "adeyemi", "fm", "adeyemi"};
            assertTrue(myArrayList.addAll(name));
            assertEquals(myArrayList.size(), 8);
            assertNotEquals(myArrayList.size(), 4);
            String [] word = {"Ojo", "Baddoo", "Akinzo", "david", "adeleke", "adeyemi", "fm", "adeyemi"};
            assertArrayEquals(word, myArrayList.toArray());

        }

    }

