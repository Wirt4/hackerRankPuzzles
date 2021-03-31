package hackerRankPuzzles;

import java.util.ArrayList;

//working off explanation at https://stackoverflow.com/questions/65139713/how-to-find-the-xth-decibinary-number
public class DecibinaryNumbers {
	
		static int getValue(int[] deciBinary){
			int sum =0;
			for (int i=0;i<deciBinary.length; i++) {
				sum += deciBinary[i]<<i;
			}
			return sum;
		}
		
		static int getRep(int[] deciBinary){
			int sum =0;
			for (int i=0;i<deciBinary.length; i++) {
				sum += deciBinary[i]* (int)Math.pow(10, i);
			}
			return sum;
		}
		
		static ArrayList<Integer>getAllDBs(int foo){
			ArrayList<Integer> ans = new ArrayList<Integer>();
			int[] db = new int[5]; //hasto be a low value, otherwise  runs too hot
			do {
				int rep = getValue(db);
				if (rep==foo)ans.add(getRep(db));
			}while(iterateSlot(db));
			return ans;
		}
	
	   static long decibinaryNumbers(long x) {
		   //naieve solution, buid an arraylist of pairs and either look them up or compute as go along
	      ArrayList<Integer> listy = new ArrayList();
	      ArrayList<Integer> tempy;
	      int currentDecimal=0;
	      while (x > listy.size()) {
	    	  tempy = getAllDBs(currentDecimal);
	    	  tempy.addAll(0, listy);
	    	  listy = new ArrayList<Integer>(tempy);
	    	  currentDecimal++;
	      }
		   return listy.get((int)(x-1));
	    }
	   
	   static boolean iterateSlot(int[] deciBinary) {
		   int carry=1;
		   for (int i=0; i<deciBinary.length; i++) {
			   deciBinary[i]  = deciBinary[i] + carry;
			   carry = deciBinary[i] >9? 1:0;
			   deciBinary[i] %=10;
		   }
		   return carry !=1;
	   }
	  //makes a table for using with the first n digits and up to the values of 2^ power  - 1
	   static long[][] makeCountTable(int digits, int power) {
		   long[][] count = new long[1<< power][digits+1];
		   count[0][0] = digits <=0 || power<=0 ? -1 :1;
		   return count;
	   }
}
