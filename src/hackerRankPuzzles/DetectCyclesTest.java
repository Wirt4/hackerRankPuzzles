package hackerRankPuzzles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DetectCyclesTest {
	private SinglyLinkedList nullList;
	private SinglyLinkedList noCycles ;
	private SinglyLinkedList lionKing;
	DetectCyclesTest(){
		nullList = new SinglyLinkedList();
		noCycles = new SinglyLinkedList();
		for (int i=0; i<15; i++)
			noCycles.insertNode(i);
		lionKing = new SinglyLinkedList();
		for (int i =1; i<=3; i++)
			lionKing.insertNode(i);
		lionKing.tail.next = lionKing.head;
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNullList() {
		assertEquals(false, DetectCycles.hasCycle(nullList.head));
	}
	
	@Test
	void testStaightLine() {
		assertEquals(false, DetectCycles.hasCycle(noCycles.head));
	}
	
	@Test
	void testLoop() {
		assertEquals(true, DetectCycles.hasCycle(lionKing.head));
	}

}
