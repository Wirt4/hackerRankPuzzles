package hackerRankPuzzles;

import static org.junit.jupiter.api.Assertions.*;

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
	void testLimitedAlgorithm() {
		assertEquals(110, DecibinaryNumbers.decibinaryNumbers(20));
	}

	@Test 
	void testMakeCountFunctions(){
		long[][] table = {
				{1, 1, 1, 1},
				{0, 1, 1, 1},
				{0, 1, 2, 2},
				{0, 1, 2, 2},
				{0, 1, 3, 4},
				{0, 1, 3, 4},
				{0, 1, 4, 6},
				{0, 1, 4, 6}
		};
		assertEquals(Arrays.deepEquals(table, DecibinaryNumbers.makeCount(3, 8)), true);
	}

	@Test
	void testCountBelow(){
		long [] sample = {0, 1, 2, 4, 6, 10, 14, 20, 26};
		long[][] count = DecibinaryNumbers.makeCount(3, 8);
		assertEquals(true, Arrays.equals(sample,DecibinaryNumbers.makeCountBelow(count)));
	}

}
