package project2;

import project2.ListIndexOutOfBoundsException;

public final class LinkedString implements LinkedStringInterface {
	
	/*
	 * Refer array,
	 * Calculate number of data in the list,
	 * Create the empty linked list.
	 */
	
	private final Node head;
		private final int count;
		public LinkedString() {
			head = null;
			count = 0;
		}
		
	public LinkedString(String string) {
		this(string.toCharArray());
	}
	
	public LinkedString(char[] string) {
		Node first = null;
		Node last = null;
		for(int i = 0; i < string.length; i++) {
			if(i == 0) {
				first = new Node(string[0]);
				last = first;
			}
			else {
				last.setNext(new Node(string[i], last, null));
				last = last.getNext();
			}
		}
		
		head = first;
		count = string.length;
		
	}
	
	public LinkedString(Node head, int count) {
		this.head = head;
		this.count = count;
	}
	
	public Node getHead() {
		return head;
	}
	
	/*
	 * Add element at given position index.
	 * @param index position of the added element.
	 * @param A reference to the added element.
	 * @throws ListIndexOutOfBoundsException if index < 0 or index > size()
	 */
	
	public char charAt(int index) {
		try {
			
			if (index < 0 || index >= count) throw new RuntimeException("Index out of bounds: " + index);
			Node currNod = head;
			for(int i = 0; i < count; i++) {
				if(i == index) {
					return (char) currNod.getItem();
				}
				currNod = currNod.getNext();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return '\0';
	}
	
	public LinkedStringInterface concat(LinkedStringInterface complement) {
		
		Node first = null;
		Node last = null;
		int size = 0;
		Node currNode = head;
		for(int i = 0; i < count; i++) {
			if (size == 0) {
				first = new Node(currNode.getItem());
				last = first;
			}
			else {
				last.setNext(new Node(currNode.getItem(), last, null));
				last = last.getNext();
			}
			
			currNode = currNode.getNext();
			size++;
		}
		
		currNode = ((LinkedString) complement ).getHead();
		for (int i = 0; i < complement.length(); i++) {
			if(size == 0) {
				first = new Node(currNode.getItem());
				last = first;
			}
			else {
				last.setNext(new Node(currNode.getItem(), last, null));
				last = last.getNext();
			}
			
			currNode = currNode.getNext();
			size++;
		}
		return new LinkedString(first, size);
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public int length() {
		return count;
	}
	
	public LinkedStringInterface substring(int start, int end) {
		try {
			if (start < 0 || start >= count || end < 0 || end >= count)
				throw new RuntimeException("Indexes out of bound: " + start + ", " + end);
			Node first = null;
			Node last = null;
			Node currNode = head;
			int size = 0;
			for (int i = 0; i < count; i++) {
				if (i >= end) return new LinkedString(first, size);
				if(i >= start && i < end) {
					if (size == 0) {
						first = new Node(currNode.getItem());
						last = first;
					}
					else {
						last.setNext(new Node(currNode.getItem(), last, null));
						last = last.getNext();
					}
					size++;
				}
				currNode = currNode.getNext();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public String toString() {
		String s = "";
		Node currNode = head;
		for (int i = 0; i < count; i++) {
			s += currNode.toString();
			currNode = currNode.getNext();
		}
		
		return s;
	}
	
}
