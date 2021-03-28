package hackerRankPuzzles;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckBinarySearchTreeTest {
	private CheckBinarySearchTree bstCheck =new CheckBinarySearchTree();
	private Node one;
	private Node two;
	private Node three;
	private Node four;
	private Node five;
	private Node six;
	private Node seven;
	CheckBinarySearchTreeTest(){
		one = new Node();
		two = new Node();
		three = new Node();
		four = new Node();
		five = new Node();
		six = new Node();
		seven = new Node();
		one.data=1;
		two.data=2;
		three.data=3;
		four.data=4;
		five.data =5;
		six.data = 6;
		seven.data =7;
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
	void testCheckNull() {
		assertEquals(true, bstCheck.checkBST(null));
	}
	@Test 
	void checkTreeOfOne() {
		Node oneOff = new Node();
		oneOff.data = 42;
		assertEquals(true, bstCheck.checkBST(oneOff));
	}

	@Test
	void checkThreeBeeGood() {
		three.left = two;
		three.right =five;
		assertEquals(true, bstCheck.checkBST(three));
		three.left =null;
		three.right = null;
	}
	
	@Test 
	void scrambleTreeBad(){
		five.left=two;
		two.left = four;
		four.left = one;
		four.right =three;
		five.right = seven;
		seven.left = six;
		assertEquals(false, bstCheck.checkBST(five));
		five.left = null;
		two.left = null;
		four.left = null;
		four.right =null;
		five.right = null;
		seven.left = null;
		
	}
	
	@Test
	void scrambleTreeGood() {
		five.left=four;
		four.left = two;
		two.left = one;
		two.right =three;
		five.right = seven;
		seven.left = six;
		assertEquals(true, bstCheck.checkBST(five));
		seven.left = null;
		five.right = null;
		two.right = null;
		two.right =null;
		four.left =null;
		five.left=null;
	}
	
	@Test
	void testDuplicateValues(){
		//test case on hackerrank does not like duplicate values
		//if adjacent values are equal in any way shape or form, the site does not consider the structure a BST
		Node dum = new Node();
		Node dee = new Node();
		Node jack = new Node();
		dum.data = 12;
		dee.data = 12;
		jack.data = 10;
		jack.right=dum;
		dum.right =dee;
		assertEquals(false, bstCheck.checkBST(jack));
	}
	
	@Test
	void inOrderTraversals() {
		five.left=four;
		four.left = two;
		two.left = one;
		two.right =three;
		five.right = seven;
		seven.left = six;
		ArrayList<Integer> arr = new ArrayList<Integer>();
       for (int i=1; i<=7; i++)
    	   arr.add(i);
		ArrayList<Integer> foo = new ArrayList<>();
		assertEquals(arr, bstCheck.inOrderTraversal(five, foo));
		seven.left = null;
		five.right = null;
		two.right = null;
		two.right =null;
		four.left =null;
		five.left=null;
	}
	
	@Test
	void checkHiddenOne() {
		one.left =two;
		two.left = three;
		two.right = five;
		one.right = four;
		four.left = six;
		four.right = seven;
		assertEquals(false, bstCheck.checkBST(one));
		one.left =null;
		two.left = null;
		two.right = null;
		one.right = null;
		four.left = null;
		four.right = null;
	}
	@Test
	void checkThreeBeeBad() {
		two.left =three;
		two.right =five;
		assertEquals(false, bstCheck.checkBST(two));
		two.left = null;
		two.right = null;
	}
}
