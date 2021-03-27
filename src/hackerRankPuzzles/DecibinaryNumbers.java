package hackerRankPuzzles;
//working off explanation at https://stackoverflow.com/questions/65139713/how-to-find-the-xth-decibinary-number
public class DecibinaryNumbers {
	   static long decibinaryNumbers(long x) {
		   //TODO: add parameters to makeCount function to accommadate problem size
		   long [][] count = makeCount(3, 8);
		   long[] countBelow = makeCountBelow(count);
		   //Find the first decimal sum
		   //find each non-zero digit
		   //determine what each of those non-zero digits are
	        return -1;
	    }
	   
	   static long[] makeCountBelow(long[][]count) {
		   //also stubbed for worked example at stack overflow
		   long[] count_below = {0, 1, 2, 4, 6, 10, 14, 20, 26};
		   return count_below;
	   }
	   
	   static long[][] makeCount(int digits, int powerLimit){
		   //stub value, from a worked example at stack overflow
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
		  return table;
	   }
}
