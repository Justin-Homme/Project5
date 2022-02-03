package project5; // TODO check all javdocs
/**
 * A child Class "BookBibEntry" which inherits from its
 * parent class "AbstractBibEntry" and adds the attributes:
 * publisher, city (the city in which it was published) and
 * state (the state in which it was published)
 * @author Justin Homme
 * @version 02/22/21
 *
 */
public class BookBibEntry extends AbstractBibEntry {
	
	/**
	 * the name of the publisher
	 */
	private String publisher;
	
	/**
	 * the name of the city that the book
	 * was published in
	 */
	private String city;
	
	/**
	 * the name of the state that the book
	 * was published in
	 */
	private String state;
	
	/**
	 * a constructor for class "BookBibEntry" that inherits
	 * from its parent class "AbstractBibEntry"
	 * @param title
	 * @param author1_fname the first name of the 1st author of the book
	 * @param author1_lname the last name of the 1st author of the book
	 * @param author2_fname the first name of the 2nd author of the book
	 * @param author2_lname the last name of the 2nd author of the book
	 * @param etal a boolean value that tells us if there are more than 2 authors
	 * @param publisher the name of the book's publisher
	 * @param year the year in which the book was published
	 * @param city the city in which the book was published
	 * @param state the state in which the book was published
	 */
	public BookBibEntry(String title, String author1_fname,
						String author1_lname, String author2_fname,
						String author2_lname, boolean etal, String publisher,
						int year, String city, String state) {
		
		super(title, author1_fname, author1_lname, author2_fname, // inherits these from the
			  author2_lname, etal, year);						  // parent class "AbstractBibEntry"
		
		this.publisher = publisher;
		this.city = city;
		this.state = state;
	}
	/**
	 * 
	 * @return publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * 
	 * @param publisher the publisher of the book
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * 
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 
	 * @param city the city the book was written in
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 
	 * @return state
	 */
	public String getState() {
		return state;
	}
	/**
	 * 
	 * @param state the state the book was written in
	 */
	public void setState(String state) {
		this.state = state;
	}
	
}
