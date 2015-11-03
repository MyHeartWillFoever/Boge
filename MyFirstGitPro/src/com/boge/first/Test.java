package com.boge.first;
public class Test {
	public static void main(String[] args) {
		Node n0 = new Node(0);
		Node n1 = new Node(1);
		n0.next = n1;
		Node n2 = new Node(2);
		n1.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		Node n4 = new Node(4);
		n3.next = n4;
		Node n5 = new Node(5);
		n4.next = n5;
		Node res = reverse(n0);
		while(res.next!=null){
			System.out.print(res.value+" ");
			res = res.next;
		}
		System.out.println(res.value);
	}
	
	public static Node reverse(Node node) {
		Node preNode = null;
		Node nextNode = null;
		while(node != null){
			nextNode = node.next;
			node.next = preNode;
			preNode = node;
			node = nextNode;
		}
		return preNode;
	}
	private static class Node{
		int value;
		Node next;
		public Node(int value){
			this.value = value;
		}
	}
}
