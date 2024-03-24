import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testSLinkedListAddFirstToEmptyList() {
        SLinkedList emptyList = new SLinkedList();
        emptyList.addFirst(5);
        assertEquals("5", emptyList.toString());
    }

    @Test
    public void testSLinkedListAddLastToEmptyList() {
        SLinkedList emptyList = new SLinkedList();
        emptyList.addLast(5);
        assertEquals("5", emptyList.toString());
    }

    @Test
    public void testSLinkedListRemoveLastFromSingleElementList() {
        SLinkedList singleElementList = new SLinkedList();
        singleElementList.addLast(5);
       singleElementList.removeLast();
        assertEquals("", singleElementList.toString());
    }

    @Test
    public void testSLinkedListRemoveFirstFromSingleElementList() {
        SLinkedList singleElementList = new SLinkedList();
        singleElementList.addLast(5);
        singleElementList.removeFirst();
        assertEquals("", singleElementList.toString());
    }

    @Test
    public void testSLinkedListRetrieveDataFromSingleElementList() {
        SLinkedList singleElementList = new SLinkedList();
        singleElementList.addLast(5);
        assertEquals(5, singleElementList.retrieveData(0));
    }

    @Test
    public void testSLinkedListRetrieveDataNegativeIndex() {
        SLinkedList myList = new SLinkedList();
        myList.addLast(5);
        assertEquals(0, myList.retrieveData(-1));
    }

    @Test
    public void testSLinkedListRemoveLastFromEmptyList() {
        SLinkedList emptyList = new SLinkedList();
        assertNull(emptyList.removeLast());
    }

    @Test
    public void testSLinkedListRemoveFirstFromEmptyList() {
        SLinkedList emptyList = new SLinkedList();
        assertNull(emptyList.removeFirst());
    }
}
