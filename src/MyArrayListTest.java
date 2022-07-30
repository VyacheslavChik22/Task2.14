import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

   private MyArrayList myArrayListTest;
   @BeforeEach
   public void setUp(){
    myArrayListTest = new MyArrayList();
   }


    @org.junit.jupiter.api.Test
    void shouldAddItemWhenAdd() {
    String result = myArrayListTest.add("book");
    MyArrayList myArrayList = new MyArrayList();
    assertEquals(result, myArrayList.add("book"));
    assertEquals(myArrayListTest.size(),1);
    }

    @org.junit.jupiter.api.Test
    void shouldAddItemWithIndex() {
     String result = myArrayListTest.add(0,"book");
     MyArrayList myArrayList = new MyArrayList();
     assertEquals(result, myArrayList.add(0,"book"));
     assertEquals(myArrayListTest.size(),1);

    }

    @org.junit.jupiter.api.Test
    void shouldAddItemOnPositionWhenAdd() {
     String result = myArrayListTest.set(0,"book");
     MyArrayList myArrayList = new MyArrayList();
     assertEquals(result, myArrayList.set(0,"book"));
    }

    @org.junit.jupiter.api.Test
    void shouldFindItemByIndex() {
     int result = myArrayListTest.indexOf("book");
     MyArrayList myArrayList = new MyArrayList();
     assertEquals(result, myArrayList.indexOf("book"));
    }

    @org.junit.jupiter.api.Test
    void shouldExceptionIfItemIsNot() {
     assertThrows(Exception.class, () -> myArrayListTest.remove("book"));

    }

    @org.junit.jupiter.api.Test
    void shouldRemoveItemByIndex() {
     String added = myArrayListTest.add(0,"book");
     String result = myArrayListTest.remove(0);
     MyArrayList myArrayList = new MyArrayList();
     assertEquals(result, myArrayList.add("book"));
     assertThrows(Exception.class, () -> myArrayListTest.remove("book"));

    }

    @org.junit.jupiter.api.Test
    void shouldReturnTrueOrFalse() {
     boolean result = myArrayListTest.contains(String.valueOf(true));
     MyArrayList myArrayList = new MyArrayList();
     assertEquals(result, myArrayList.contains(String.valueOf(true)));
    }

    @org.junit.jupiter.api.Test
    void shouldReturnItemByLastIndex() {
     String resultAdd = myArrayListTest.add("book");
     int result = myArrayListTest.lastIndexOf("book");
     MyArrayList myArrayList = new MyArrayList();
     assertEquals(result,myArrayList.lastIndexOf("book"));
    }

    @org.junit.jupiter.api.Test
    void shouldReturnItemByIndex() {
     String resultAdd = myArrayListTest.add("book");
     String result = myArrayListTest.get(0);
     MyArrayList myArrayList = new MyArrayList();
     myArrayList.add("book");
     assertEquals(result,myArrayList.get(0));
    }

    @org.junit.jupiter.api.Test
    void testEquals() {

    }

    @org.junit.jupiter.api.Test
    void size() {
     String resultAdd = myArrayListTest.add("book");
     int result = myArrayListTest.size();
     MyArrayList myArrayList = new MyArrayList();
     myArrayList.add("book");
     assertEquals(result,myArrayList.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void toArray() {
    }
}