package hackerRankPuzzles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class main {
	public static boolean equalMatrix(long[][] a, long[][]b) {
		if (a.length != b.length)
			return false;
		for (int i= 0; i< a.length; i++) {
			if (!Arrays.equals(a[i], b[i])) 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		long[][] otherTable = {{2},{4}};
		long[][] brotherTable = {{2},{4}};
		long[][] returnTable = DecibinaryNumbers.makeCount(3,8);
		boolean bol = equalMatrix(otherTable, returnTable);
		System.out.println(Arrays.deepEquals(otherTable, brotherTable));

	}

}
