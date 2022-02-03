package project5; // TODO check all javadocs
/**
 * A parent class "AbstractBibEntry" for child classes
 * (in this case, it will be "BookBibEntry" and "JournalBibEntry"
 * but other child classes could be made) to utilize and expand/
 * improve upon
 * @author Justin Homme
 * @version 02/22/21
 *
 */
public abstract class AbstractBibEntry {
	
	/**
	 * the title of the Citation
	 */
	protected String title;
	
	/**
	 * the first name of the 1st author
	 */
	protected String author1_fname;
	
	/**
	 * the last name of the 1st author
	 */
	protected String author1_lname;
	
	/**
	 * the first name of the 2nd author
	 */
	protected String author2_fname;
	
	/**
	 * the last name of the 2nd author
	 */
	protected String author2_lname;
	
	/**
	 * a boolean value which tells whether or not there 
	 * are more than two authors
	 */
	protected boolean etal;
	
	/**
	 * the year of publication
	 */
	protected int year;
	
	/**
	 * a constructor for class "AbstractBibEntry"
	 * @param title
	 * @param author1_fname 1st author's first name
	 * @param author1_lname 1st author's last name
	 * @param author2_fname 2nd author's first name
	 * @param author2_lname 2nd author's last name
	 * @param etal a boolean value which tells if there are more than 2 authors
	 * @param year the year it was published
	 * @throws IllegalArgumentException if the name of the title is null or an empty string,
	 * if the author has a legal first name without a legal last name or the author has 
	 * a legal last name without a legal first name, 
	 */
	public AbstractBibEntry(String title, String author1_fname,
							String author1_lname, String author2_fname,
							String author2_lname, boolean etal, int year) throws IllegalArgumentException {
		this.title = title;
		this.author1_fname = author1_fname;
		this.author1_lname = author1_lname;
		this.author2_fname = author2_fname;
		this.author2_lname = author2_lname;
		this.etal = etal;
		this.year = year;
	}
	/**
	 * 
	 * @return title the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to be set
	 * @throws IllegalArgumentException if the title is null or an empty string
	 */
	public void setTitle(String title) throws IllegalArgumentException {
		if(title == null || title.equals("")) {
			throw new IllegalArgumentException("The title cannot be null or an empty string.");
		}
		this.title = title;
	}
	/**
	 * 
	 * @return author1_fname
	 */
	public String getAuthor1_fname() {
		return author1_fname;
	}
	/**
	 * 
	 * @param author1_fname, author1_lname the first name of the primary author
	 * and the last name of the primary author
	 * @throws IllegalArgumentException if the author has a legal first name without a legal last name or the author has 
	 * a legal last name without a legal first name
	 */
	public void setAuthor1name(String author1_fname, String author1_lname) throws IllegalArgumentException {
		if((author1_fname != null && !author1_fname.equals("")) && (author1_lname == null || author1_lname.equals(""))) {
			throw new IllegalArgumentException("The author cannot have a first name without a last name");
		}else if((author1_lname != null && !author1_lname.equals("")) && (author1_fname == null || author1_fname.equals(""))) {
			throw new IllegalArgumentException("The author cannot have a last name without a first name");
		}
		this.author1_fname = author1_fname;
		this.author1_lname = author1_lname;
	}
	/**
	 * 
	 * @return author1_lname
	 */
	public String getAuthor1_lname() {
		return author1_lname;
	}
	/**
	 * 
	 * @return author2_fname
	 */
	public String getAuthor2_fname() {
		return author2_fname;
	}
	/**
	 * 
	 * @param author2_fname, author2_lname the first name of the secondary
	 * author and the last name of the secondary author
	 */
	public void setAuthor2name(String author2_fname, String author2_lname) {
		this.author2_fname = author2_fname;
		this.author2_lname = author2_lname;
	}
	/**
	 * 
	 * @return author2_lname
	 */
	public String getAuthor2_lname() {
		return author2_lname;
	}
	/**
	 * 
	 * @return etal
	 */
	public boolean isEtal() {
		return etal;
	}
	/**
	 * 
	 * @param etal a boolean value which tells if there are more than 2 authors
	 */
	public void setEtal(boolean etal) {
		this.etal = etal;
	}
	/**
	 * 
	 * @return year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * 
	 * @param year the year it was published
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
