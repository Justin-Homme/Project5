package project5; // TODO check all javadocs

/**
 * a child class ("JournalBibEntry") of its parent class
 * ("AbstractBibEntry") that adds some attributes to 
 * expand upon/ improve its parent class
 * @author Justin Homme
 * @version 02/22/21
 *
 */
public class JournalBibEntry extends AbstractBibEntry {
	
	/**
	 * the name of the journal
	 */
	private String journal;
	
	/**
	 * the DOI code of the journal article
	 */
	private String doi;
	
	/**
	 * the issue number of the journal article
	 */
	private int issue;
	
	/**
	 * the volume number of the journal article
	 */
	private int volume;
	
	/**
	 * the starting page number of the journal article's
	 * citation
	 */
	private int pageStart;
	
	/**
	 * the ending page number of the journal article's
	 * citation
	 */
	private int pageEnd;
	
	/**
	 * 
	 * @param title the title of the citation
	 * @param author1_fname 1st author's first name
	 * @param author1_lname 1st author's last name
	 * @param author2_fname 2nd author's first name
	 * @param author2_lname 2nd author's last name
	 * @param etal a boolean value that tells us if there are more than 2 authors
	 * @param journal the name of the journal article
	 * @param year the year in which the journal article was published
	 * @param issue the issue number of the journal article
	 * @param volume the volume number of the journal article
	 * @param pageStart the starting page number of the journal article's
	 * @param pageEnd the ending page number of the journal article's
	 * @param doi the DOI code of the journal article
	 */
	public JournalBibEntry(String title, String author1_fname,
							String author1_lname, String author2_fname,
							String author2_lname, boolean etal,
							String journal, int year, int issue,
							int volume, int pageStart, int pageEnd,
							String doi) {
		
		super(title, author1_fname, author1_lname, author2_fname,		// allows us to inherit from
			  author2_lname, etal, year);								// the parent class
		
		this.journal = journal;
		this.issue = issue;
		this.volume = volume;
		this.pageStart = pageStart;
		this.pageEnd = pageEnd;
		this.doi = doi;
	}
	/**
	 * 
	 * @return journal
	 */
	public String getJournal() {
		return journal;
	}
	
	/**
	 * 
	 * @param journal the name of the journal
	 */
	public void setJournal(String journal) {
		this.journal = journal;
	}
	
	/**
	 * 
	 * @return doi
	 */
	public String getDoi() {
		return doi;
	}
	
	/**
	 * 
	 * @param doi the DOI code of the article
	 */
	public void setDoi(String doi) {
		this.doi = doi;
	}
	
	/**
	 * 
	 * @return issue
	 */
	public int getIssue() {
		return issue;
	}
	
	/**
	 * 
	 * @param issue the issue number of the article
	 */
	public void setIssue(int issue) {
		this.issue = issue;
	}
	
	/**
	 * 
	 * @return volume
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * 
	 * @param volume the volume number of the article
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * 
	 * @return pageStart
	 */
	public int getPageStart() {
		return pageStart;
	}

	/**
	 * sets pageStart and pageEnd in the same Setter in order
	 * to allow the main to call one Setter method with both
	 * the start and end page numbers
	 * @param pageStart the starting page of the citation
	 * @param pageEnd the ending page of the citation
	 */
	public void setPages(int pageStart, int pageEnd) {
		if(pageStart >= 0 && pageEnd >= 0) {			// makes sure that you don't
			this.pageStart = pageStart;					// start or end on a negative
			this.pageEnd = pageEnd;						// page number
		}
	}
	
	/**
	 * 
	 * @return pageEnd
	 */
	public int getPageEnd() {
		return pageEnd;
	}
}
