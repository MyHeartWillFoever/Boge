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
		while(res!=null&&res.next!=null){
			System.out.print(res.value+" ");
			res = res.next;
		}
		if(res!=null){
			System.out.println(res.value);
		}
	}
	
	public static Node reverse(Node node) {
		if(node==null||node.next == null){
			return node;
		}else{
			Node nextNode = node.next;
			node.next = null;
			Node res = reverse(nextNode);
			nextNode.next = node;
			return res;
		}
	}
	private static class Node{
		int value;
		Node next;
		public Node(int value){
			this.value = value;
		}
	}
}
