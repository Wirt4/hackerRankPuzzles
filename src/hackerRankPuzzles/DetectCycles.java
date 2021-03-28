package hackerRankPuzzles;

import java.util.HashSet;
import java.util.Set;

public class DetectCycles {
	static boolean hasCycle(SinglyLinkedListNode head) {
		SinglyLinkedListNode cursor = head;
		Set<SinglyLinkedListNode>set = new HashSet<SinglyLinkedListNode>();
		while (cursor != null) {
			if (set.contains(cursor))return true;
			set.add(cursor);
			cursor = cursor.next;
		}
		return false;
	}
}
