package com;

import java.util.HashSet;

//Remove duplicates in unsorted linkedlist . When you encounter duplicate, remove and iterate
//use hashset .
//Time complexity: O(n)
public class removeDups {

	static class node {
		int data;
		node next;

		public node(int data) {
			this.data = data;
		}
	}

	static void removeDups(node n) {
		HashSet<Integer> set = new HashSet<>();
		node previous = null;
		while (n != null) {
			if (set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}

	/* Function to print nodes in a given linked list */
	static void printList(node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		/*
		 * The constructed linked list is: 10->12->11->11->12->11->10
		 */
		node start = new node(10);
		start.next = new node(12);
		start.next.next = new node(11);
		start.next.next.next = new node(11);
		start.next.next.next.next = new node(12);
		start.next.next.next.next.next = new node(11);
		start.next.next.next.next.next.next = new node(10);

		System.out.println("Linked list before removing duplicates :");
		printList(start);

		removeDups(start);

		System.out.println("\nLinked list after removing duplicates :");
		printList(start);
	}

}
