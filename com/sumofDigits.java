package com;
//Time Complexity: O(m + n) where m and n are number of nodes in first and second lists respectively.
//One by one pick nodes of both lists and add the values. If sum is more than 10 then make carry as 1 and reduce sum.
// If one list has more elements than the other then consider remaining values of this list as 0

import com.partitionList.node;

public class sumofDigits {

	static class node
	{
		int data;
		node next;
		public node(int data) 
		{
			this.data=data;
			this.next=null;
		}

		public node() { }
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
	static node sumofDigits(node l1, node l2, int carry) {
		int value = carry;
		node result= new node();
		if(l1==null && l2==null && carry==0) {
			return null;
		}
		if (l1!=null){
			value+=l1.data;
		}
		if (l2!=null){
			value+=l2.data;
		}
		result.data=value%10;
		/*Recurse*/
		if (l1!=null || l2!=null) {
			node more= sumofDigits(l1==null?null:l1.next,l2==null?null:l2.next,value>=10?1:0);
			result.next=more;
		}
		return result;
	}

	public static void main(String[] args) 
	{

		node start = new node(7);
		start.next = new node(1);
		start.next.next = new node(6);
		node end  = new node(5);
		end.next = new node(9);
		end.next.next = new node(2);
		System.out.println("\nLinked lists original:");
		printList(start);printList(end);
		node result = sumofDigits(start,end, 0);
		System.out.println("\nLinked list after sum:");
		printList(result);
	}

}
