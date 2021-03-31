package hackerRankPuzzles;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DecibinaryNumbersTest {

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
	void testSlotIterate() {
		int[] test = new int[5];
		int[] ans = new int[5];
		ans[0]=1;
		DecibinaryNumbers.iterateSlot(test);
		assertEquals(true, Arrays.equals(test, ans));
		Arrays.fill(test,9);
		//check for overflow
		assertEquals(false, DecibinaryNumbers.iterateSlot(test));
		Arrays.fill(test, 0);
		test[0]=9;
		Arrays.fill(ans, 0);
		ans[1]=1;
		DecibinaryNumbers.iterateSlot(test);
		assertEquals(true, Arrays.equals(test, ans));
		Arrays.fill(test, 0);
		test[0]=8;
		Arrays.fill(ans, 0);
		ans[0]=9;
		DecibinaryNumbers.iterateSlot(test);
		assertEquals(true, Arrays.equals(test, ans));
	}
	@Test
	void getRepTest() {
		int[] testValOne = {1,0,0};
		assertEquals(1, DecibinaryNumbers.getRep(testValOne));
		int[] testValTwo = {2,1,0, 0};
		assertEquals(12, DecibinaryNumbers.getRep(testValTwo));
	}
	@Test
	void testSlot() {
			int[] test = new int[20];
			assertEquals(0, DecibinaryNumbers.getValue(test));
			test[2] = 1;
			assertEquals(4, DecibinaryNumbers.getValue(test));
			
	}
	@Test
	void testDecibinaryGenerationFour() {
		ArrayList<Integer> allDsForFour = new ArrayList<Integer>();
		allDsForFour.add(4);
		allDsForFour.add(12);
		allDsForFour.add(20);
		allDsForFour.add(100);
		assertEquals(true, allDsForFour.equals(DecibinaryNumbers.getAllDBs(4)));
	}
	@Test
	void naieveTest() {
		assertEquals(0, DecibinaryNumbers.decibinaryNumbers(1));
		assertEquals(1, DecibinaryNumbers.decibinaryNumbers(2));
		assertEquals(2, DecibinaryNumbers.decibinaryNumbers(3));
		assertEquals(10, DecibinaryNumbers.decibinaryNumbers(4));
		assertEquals(100, DecibinaryNumbers.decibinaryNumbers(10));
	}
	@Test
	void testCountBadVals() {
		long[][] count = {{-1}};
		long[][] ans = DecibinaryNumbers.makeCountTable(0, 3);
		assertEquals(true, Arrays.deepEquals(count, ans));

	}
	void testCountFunction() {
		long[][] count = {
		         {1, 1, 1, 1}, //sum 0
		         {0, 1, 1, 1}, // sum 1
		         {0, 1, 2, 2}, // sum 2
		         {0, 1, 2, 2}, // sum 3
		         {0, 1, 3, 4}, // sum 4
		         {0, 1, 3, 4}, // sum 5
		         {0, 1, 4, 6}, // sum 6
		         {0, 1, 4, 6} // sum 7
		};
		long[][] ans = DecibinaryNumbers.makeCountTable(3, 3);
		assertEquals(true, Arrays.deepEquals(count, ans));

	}
	@Test
	void testDecibinaryGenerationZero() {
		ArrayList<Integer> allDsForZero = new ArrayList<Integer>();
		allDsForZero.add(0);
		assertEquals(true, allDsForZero.equals(DecibinaryNumbers.getAllDBs(0)));
	}
	
}
