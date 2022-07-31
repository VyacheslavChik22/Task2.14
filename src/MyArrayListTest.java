import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    private MyArrayList myArrayListTest;
    private final String TEST_BOOK = "book"; // образец для сравнения
    private final String[] Last_Test = {TEST_BOOK};
    @BeforeEach
    public void setUp() {
        myArrayListTest = new MyArrayList();
    }


    @org.junit.jupiter.api.Test
    void shouldAddItemWhenAdd() {
        String result = myArrayListTest.add(TEST_BOOK);
        assertEquals(result, TEST_BOOK);
        assertEquals(myArrayListTest.size(), 1);
    }

    @org.junit.jupiter.api.Test
    void shouldAddItemWithIndex() {
        String result = myArrayListTest.add(0, TEST_BOOK);
        assertEquals(result, TEST_BOOK);
        assertEquals(myArrayListTest.size(), 1);

    }

    @org.junit.jupiter.api.Test
    void shouldAddItemOnPositionWhenSet() {
        String resultAdding = myArrayListTest.add(0, TEST_BOOK);
        String result = myArrayListTest.set(0, TEST_BOOK);
        assertEquals(result, TEST_BOOK);
        assertEquals(myArrayListTest.size(), 1);


    }

    @org.junit.jupiter.api.Test
    void shouldFindItemByIndex() {
        String resultAdding = myArrayListTest.add(0, TEST_BOOK);
        int result = myArrayListTest.indexOf(TEST_BOOK);
        assertEquals(result, 0);
    }

    @org.junit.jupiter.api.Test
    void shouldExceptionIfItemIsNot() {
        assertThrows(Exception.class, () -> myArrayListTest.remove(TEST_BOOK));

    }


    @org.junit.jupiter.api.Test
    void shouldRemoveItemByIndex() {
        String resultAdding = myArrayListTest.add(0, TEST_BOOK);
        String result = myArrayListTest.remove(0);
        assertEquals(result, TEST_BOOK);
        assertEquals(myArrayListTest.size(), 0); // проверяем что массив пустой


    }

    @org.junit.jupiter.api.Test
    void shouldReturnTrueOrTrue() {
        String resultAdding = myArrayListTest.add(0, TEST_BOOK);
        boolean result = myArrayListTest.contains(TEST_BOOK);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnTrueOrFalse() {
        boolean result = myArrayListTest.contains(TEST_BOOK);
        assertFalse(result);
    }


    @org.junit.jupiter.api.Test
    void shouldReturnItemByLastIndex() {
     String resultAdd = myArrayListTest.add(TEST_BOOK);
     int result = myArrayListTest.lastIndexOf(TEST_BOOK);
     assertEquals(result,0);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnItemByIndex() {
     String resultAdd = myArrayListTest.add(TEST_BOOK);
     String result = myArrayListTest.get(0);
     assertEquals(result,TEST_BOOK);
    }

    @org.junit.jupiter.api.Test
    void shouldTestEqualsBeValid() {
        String resultAdd = myArrayListTest.add(TEST_BOOK);
        MyArrayList expectedList = new MyArrayList();
        expectedList.add(TEST_BOOK);
        boolean result = myArrayListTest.equals(expectedList);
        assertTrue(result);
    }
    @org.junit.jupiter.api.Test
    void shouldTestEqualsBeNotValid() {
        String resultAdd = myArrayListTest.add(TEST_BOOK);
        MyArrayList expectedList = new MyArrayList();
        boolean result = myArrayListTest.equals(expectedList);
        assertFalse(result);
    }



    @org.junit.jupiter.api.Test
    void shouldReturnSize() {
     String resultAdd = myArrayListTest.add(TEST_BOOK);
     int result = myArrayListTest.size();
     assertEquals(result,1);
    }


    @org.junit.jupiter.api.Test
    void shouldReturnTrueIsEmpty() {
        boolean result = myArrayListTest.isEmpty();
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnFalseIsEmpty() {
        String resultAdd = myArrayListTest.add(TEST_BOOK);
        boolean result = myArrayListTest.isEmpty();
        assertFalse(result);
    }
    @org.junit.jupiter.api.Test
    void clear() {
        String resultAdd = myArrayListTest.add(TEST_BOOK);
        myArrayListTest.clear();
        int result = myArrayListTest.size();
        assertEquals(result,0);
    }

    @org.junit.jupiter.api.Test
    void toArray() {
        String resultAdd = myArrayListTest.add(TEST_BOOK);
        String[] result = myArrayListTest.toArray();
        assertArrayEquals(result,Last_Test);
    }
}