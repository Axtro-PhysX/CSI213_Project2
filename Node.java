package project2;

/*
 * Node to be used in the doubly linked list.
 * @author nisanth
 * @version 1.0
 */

public class Node {
	
	private Object item;
	private Node next;
	private Node previous;
	
	/*
	 * Link to the next node from the previous node.
	 * @param item
	 */
	
	public Node (Object item) {
		this.item = item;
		this.previous = null;
		this.next = null;
	}
	
	/*
	 * Construct node w/ an element that links to a null node.
	 * @param element A refers to element of this node.
	 */
	
	public Node (Object item, Node previous, Node next) {
		this.item = item;
		this.previous = previous;
		this.next = next;
	}
	
	/*
	 * Return element of the node.
	 * @return element
	 */
	
	public Object getItem() {
		return item;
	}
	
	/*
	 * Return next reference of the node.
	 * @return A reference to the next node of the current node.
	 */
	
	public Node getNext() {
		return next;
	}
	
	/*
	 * Return previous reference of the node.
	 * @return A reference to the next node of the current node.
	 */
	
	public Node getPrevious() {
		return previous;
	}
	
	/*
	 * Change element of the node.
	 * @param A references this element.
	 */
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	/*
	 * Change next reference of the node.
	 * @param next A references the next node of this node.
	 */
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	/*
	 * Change previous reference of the node.
	 * @param previous A references the previous node.
	 */
	
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	/*
	 * Return a string representation of the node.
	 * @return string representation of the node.
	 */
	
	public String toString() {
		return item.toString();
	}

}
