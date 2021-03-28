package hackerRankPuzzles;

import java.util.ArrayList;

public class CheckBinarySearchTree {
	boolean checkBST(Node root) {

		ArrayList<Integer> inOrderList = new ArrayList<Integer>();
		inOrderList = inOrderTraversal(root, inOrderList);
		
		for (int i=0; i<inOrderList.size()-1; i++) {
			if (inOrderList.get(i) >= inOrderList.get(i+1))
				return false;
		}
		return true;
    }
	
	ArrayList<Integer> inOrderTraversal(Node root, ArrayList<Integer> returnList){
		if (root !=null) {
			returnList = inOrderTraversal(root.left, returnList);
			returnList.add(root.data);
			returnList = inOrderTraversal(root.right, returnList);
		}
		return returnList;
	}
}