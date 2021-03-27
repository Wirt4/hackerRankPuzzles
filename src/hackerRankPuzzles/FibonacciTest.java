package hackerRankPuzzles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciTest {
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
	void testFirstSeven() {
		int outputs[] = {0, 1, 1, 2, 3, 5, 8 };
		for (int input=0; input<7; input++) {
			assertEquals(outputs[input], Fibonacci.fibonacci(input));
		}
	}
	@Test
	void testThreeHundred() {
		assertEquals(832040, Fibonacci.fibonacci(30));
	}
	@Test
	void testOutOfRange() {
		assertEquals(-1, Fibonacci.fibonacci(31));
		assertEquals(-1, Fibonacci.fibonacci(100));
		assertEquals(-1, Fibonacci.fibonacci(-10));
		assertEquals(-1, Fibonacci.fibonacci(-1));
	}

}
