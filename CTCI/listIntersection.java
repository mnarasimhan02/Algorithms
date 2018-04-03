package com;

//Time complexity: O(m+n) - m and n ar elength of two linked lists
//Space O(1)
/*
1) Get count of the nodes in first list, let count be c1.
2) Get count of the nodes in second list, let count be c2.
3) Get the difference of counts d = abs(c1 – c2)
4) Now traverse the bigger list from the first node till d nodes so that from here onwards both the lists have equal no of nodes.
5) Then we can traverse both the lists in parallel till we come across a common node. (Note that getting a common node is done by comparing the address of the nodes)
*/
class listIntersection {

	static node head1;
	static node head2;

	static class node {
		int data;
		node next;

		public node(int data) {
			this.data = data;
			this.next = null;
		}

		public node() {
		}

	}

	/*
	 * function to get the intersection point of two linked lists head1 and head2
	 */
	int getNode() {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;

		if (c1 > c2) {
			d = c1 - c2;
			return getIntesectionNode(d, head1, head2);
		} else {
			d = c2 - c1;
			return getIntesectionNode(d, head2, head1);
		}
	}

	/*
	 * function to get the intersection point of two linked lists head1 and head2
	 * where head1 has d more nodes than head2
	 */
	int getIntesectionNode(int d, node node1, node node2) {
		int i;
		node current1 = node1;
		node current2 = node2;
		for (i = 0; i < d; i++) {
			if (current1 == null) {
				return -1;
			}
			current1 = current1.next;
		}
		while (current1 != null && current2 != null) {
			if (current1.data == current2.data) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}

		return -1;
	}

	/*
	 * Takes head pointer of the linked list and returns the count of nodes in the
	 * list
	 */
	int getCount(node node) {
		node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	public static void main(String[] args) {
		listIntersection list = new listIntersection();

		// creating first linked list
		listIntersection.head1 = new node(3);
		listIntersection.head1.next = new node(6);
		listIntersection.head1.next.next = new node(15);
		listIntersection.head1.next.next.next = new node(15);
		listIntersection.head1.next.next.next.next = new node(30);

		// creating second linked list
		listIntersection.head2 = new node(10);
		listIntersection.head2.next = new node(15);
		listIntersection.head2.next.next = new node(30);

		System.out.println("The node of intersection is " + list.getNode());

	}
}
