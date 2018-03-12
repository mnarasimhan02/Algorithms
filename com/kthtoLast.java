package com;
//Kth to last element in linkedlist
//use two pointers to keep track .
//Time complexity: O(n)
//Space O(1)
import com.removeDups.node;

public class kthtoLast {

	static class node
	{
		int data;
		node next;
		public node(int data) 
		{
			this.data=data;
		}
	}
	
static node kthtoLast(node n, int k) {
	node p1 = n, p2=n;
	for (int i=0;i<k;i++) {
		if (p1.next==null) return null; 
		p1=p1.next;
	}
	while (p1!=null) {
		p1=p1.next;
		p2=p2.next;
	}
	return p2;
}
	
public static void main(String[] args) 
{
    
    node start = new node(20);
    start.next = new node(04);
    start.next.next = new node(15);
    start.next.next.next = new node(35);
	node kthnode = kthtoLast(start, 3);
	String nodeValue = kthnode == null ? "null" : "" + kthnode.data;
	System.out.println(3 + ": " + nodeValue);
}
	
}

