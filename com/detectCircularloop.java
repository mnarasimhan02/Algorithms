package com;
//Time Complexity: O(n)
//Auxiliary Space: O(1)
//use fast and slow pointer to detect loop

public class detectCircularloop {

	static class node {
		int data;
		node next;

		public node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		/*
		 * The constructed linked list is: 10->12->11->loop
		 */
		node start = new node(10);
		start.next = new node(12);
		start.next.next = new node(11);
		start.next.next.next = start.next;
		detectLoop(start);
	}

	private static int detectLoop(node start) {
		node slow = start, fast = start;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				System.out.println("Found loop");
				return 1;
			}
		}
		return 0;
	}

}
