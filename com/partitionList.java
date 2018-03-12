//Partition list using head and tail pointers . Elements bigger are added to tail and smaller are added to head
//Each time we update element, we update head or tail
package com;

public class partitionList {

	static class node
	{
		int data;
		node next;
		public node(int data) 
		{
			this.data=data;
			this.next=null;
		}
	}
	/* Function to print nodes in a given linked list */
	static void printList(node head) 
	{
		while (head != null) 
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	static node partitionList(node n,int x) {
		node head=n, tail=n;
		/*partition list*/
		while (n!=null) {
			node next = n.next;
				if (n.data<x) 
				{
					/* Insert node at head. */
					n.next=head;
					head=n;
				} else {
					/* Insert node at tail. */
					tail.next=n;
					tail=n;
				}
				n=next;

		}
		tail.next=null;
		return head;
	}
	public static void main(String[] args) 
	{

		node start = new node(20);
		start.next = new node(04);
		start.next.next = new node(15);
		start.next.next.next = new node(35);
		start.next.next.next.next = new node(07);
		start.next.next.next.next.next = new node(25);
		System.out.println("Linked list original:");
		printList(start);
		node partitionList = partitionList(start,15);
		System.out.println("\n Linked list after partition:");
		printList(partitionList);
	}
}
