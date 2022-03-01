package project2;

public interface LinkedStringInterface {
	
	/**
	 * return character at the specific index in the string.
	 * @param index
	 * @return a character at the index specified.
	 */
	
	public char charAt(int index);
	
	/*
	 * Concatenate a string to the end of another one.
	 * @param complement
	 * @return a string with value passed into the method and added to the end of the string.
	 */
	
	public LinkedStringInterface concat(LinkedStringInterface complement);
	
	/*
	 * Determine if the list is empty.
	 * @return Boolean value if empty.
	 */
	
	public boolean isEmpty();
	
	/*
	 * Return length of the list.
	 */
	
	public int length();
	
	/*
	 * Begin substring at specified beginIndex and extend to character at endIndex.
	 * @param start
	 * @param end
	 * @return new string which is a substring of the current string.
	 */
	
	public LinkedStringInterface substring(int start, int end);

}
