package com;
//Time complexity: O(1)
//Space O(1)
//Copy values from next element and delete next element
import com.kthtoLast.node;

public class deleteMiddleNode {

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
	
static node deleteMiddleNode(node n) {
	if (n==null || n.next==null) return null;
	node mid=n.next;
	n.data=mid.data;
	n.next=mid.next;
	return n;
}
	
	public static void main(String[] args) 
	{
	    
	    node start = new node(20);
	    start.next = new node(04);
	    start.next.next = new node(15);
	    start.next.next.next = new node(35);
        System.out.println("Linked list before deleting middle node :");
        printList(start);
		node delMiddlenode = deleteMiddleNode(start.next.next);
        System.out.println("\nLinked list after deleting middle node :");
        printList(start);
	}
}
