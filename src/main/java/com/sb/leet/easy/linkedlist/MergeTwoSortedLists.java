/**
 * 
 */
package com.sb.leet.easy.linkedlist;

/**
 * @author ankur
 * @crated 08-Jul-2021
 */
public class MergeTwoSortedLists {

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode first = null;
		ListNode last = null;
		int loop = 0;
		while (null != l1 && null != l2) {
			ListNode newNode = null;
			if (l1.val >= l2.val) {
				newNode = new ListNode(l2.val);
				l2 = l2.next;
			} else {
				newNode = new ListNode(l1.val);
				l1 = l1.next;
			}
			if (loop == 0) {
				first = newNode;
			} else {
				last.next = newNode;
			}
			last = newNode;
			loop++;
		}
		// Rest pending nodes.
		while (null != l1 || null != l2) {
			ListNode newNode = null;
			if (null != l1) {
				newNode = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				newNode = new ListNode(l2.val);
				l2 = l2.next;
			}
			// If first is null then assign new node as first.
			if (null == first) {
				first = newNode;
			} else {
				last.next = newNode;
			}

			last = newNode;

		}

		return first;

	}

	public ListNode mergeByRecursion(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeTwoSortedLists runner = new MergeTwoSortedLists();
		// ListNode l1 = null;
		// ListNode l2 = null;
		ListNode l1 = runner.createList(-1, 3, 5, 6, 7, 10);
		ListNode l2 = runner.createList(-5, 1, 2, 3, 7, 9, 11, 12);
		// ListNode merged = runner.mergeTwoLists(l1, l2);
		ListNode merged = runner.mergeByRecursion(l1, l2);
		while (null != merged) {
			System.out.println(merged.val);
			merged = merged.next;
		}
	}

	private ListNode createList(int... elements) {
		ListNode first = null;
		ListNode last = null;
		for (int i = 0; i < elements.length; i++) {
			ListNode newNode = new ListNode(elements[i]);
			if (i == 0) {
				first = newNode;
			} else {
				last.next = newNode;
			}
			last = newNode;
		}

		return first;
	}

}
