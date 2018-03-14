package com;

import java.util.Stack;
//Time complexity: O(n)
//Space O(n)
//Two approaches - Reverse and compare or iterative approach. 
//Iterative -  First half of the normal list matches with second half of the reversed list.
/*fast_ptr would become NULL when there are even elements in the list and not NULL for odd elements. We need to skip  
the middle node for odd case*/
public class listPalindrome {

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

	public static void main(String[] args) 
	{

		node start = new node(6);
		start.next = new node(1);
		start.next.next = new node(6);
		boolean result = isPalindrome(start);
		System.out.println("\n Palindrome Result "+result);

	}

	private static boolean isPalindrome(node start) {

		node l1=start, l2=start;
		Stack <Integer> stack= new Stack<Integer>();
		/*Push elements from first half of linked list into stack when fast runner reaches end of the list, we know we are in the middle*/
		while (l2!=null && l2.next!=null) {
			stack.push(l1.data);
			l1=l1.next;
			l2=l2.next.next;
		}
		/*odd numbers, skip middle element*/
		if (l2!=null) {
			l1=l1.next;
		}
		while(l1!=null) {
			int top= stack.pop().intValue();
			if (top!=l1.data){
				return false;
			}
			l1=l1.next;
		}
		return true;
	}

}
