package de.demmer.dennis;

public class LinkedStringList {
	
	Node head;
	Node tail;
	
	public void add(String data) {
		Node n = new Node(data);
		
		if(head == null) {
			head = n;
		} else {
			tail.next = n;
		}
		
		tail = n;
		
	}
	
	

}
