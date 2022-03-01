package project2;

public class ListException extends RuntimeException {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	/**
	 * Construct object with specific message.
	 * @param list a specific detail of the exception.
	 */

	public ListException(String message) {
		
		super(message);
		
	}
	
	
}
