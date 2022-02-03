package project5;
/**
 * For use in COS105 Project 5
 * A main method checking to see if your various setters, getters, and constructors seem to be working
 * Will print a report of any failures detected
 * We'll have a much better way (JUnit) to do this in a few weeks, but this will work for now
 * @author gosnat
 * @version Spring 2021
 */

public class Main {

	public static void main(String[] args) {		
		
		System.out.println("List of failed tests: ");
		
		
		BookBibEntry testBook = new BookBibEntry("Title", "Auth1FName", "Auth1LName",
				"Auth2FName", "Auth2LName", false, "Publisher", 2020, "City", "State");
		
		
		if(!testBook.getTitle().equals("Title")) System.out.println("Book Title Constructor Fail");
		if(!testBook.getAuthor1_fname().equals("Auth1FName")) System.out.println("Book A1FName Constructor Fail");
		if(!testBook.getAuthor1_lname().equals("Auth1LName")) System.out.println("Book A1LName Constructor Fail");
		if(!testBook.getAuthor2_fname().equals("Auth2FName")) System.out.println("Book A2FName Constructor Fail");
		if(!testBook.getAuthor2_lname().equals("Auth2LName")) System.out.println("Book A2LName Constructor Fail");
		if(testBook.isEtal() != false) System.out.println("Book et al Constructor Fail");
		if(!testBook.getPublisher().equals("Publisher")) System.out.println("Book Publisher Constructor Fail");
		if(testBook.getYear() != 2020) System.out.println("Book Year Constructor Fail");
		if(!testBook.getCity().equals("City")) System.out.println("Book City Constructor Fail");
		if(!testBook.getState().equals("State")) System.out.println("Book State Constructor Fail");
		
		testBook.setTitle("New Title");
		testBook.setAuthor1name("John", "Doe");
		testBook.setAuthor2name("Jane", "Roe");
		testBook.setEtal(true);
		testBook.setPublisher("New Publisher");
		testBook.setYear(2021);
		testBook.setCity("Arden Hills");
		testBook.setState("MN");
		
		if(!testBook.getTitle().equals("New Title")) System.out.println("Book Title set/get Fail");
		if(!testBook.getAuthor1_fname().equals("John")) System.out.println("Book A1FName set/get Fail");
		if(!testBook.getAuthor1_lname().equals("Doe")) System.out.println("Book A1LName set/get Fail");
		if(!testBook.getAuthor2_fname().equals("Jane")) System.out.println("Book A2FName set/get Fail");
		if(!testBook.getAuthor2_lname().equals("Roe")) System.out.println("Book A2LName set/get Fail");
		if(testBook.isEtal() != true) System.out.println("Book et al set/get Fail");
		if(!testBook.getPublisher().equals("New Publisher")) System.out.println("Book Publisher set/get Fail");
		if(testBook.getYear() != 2021) System.out.println("Book Year set/get Fail");
		if(!testBook.getCity().equals("Arden Hills")) System.out.println("Book City set/get Fail");
		if(!testBook.getState().equals("MN")) System.out.println("Book State set/get Fail");
		
		JournalBibEntry testJournal = new JournalBibEntry("Title", "Auth1FName", "Auth1LName",
				"Auth2FName", "Auth2LName", false, "Journal", 2020, 3, 2, 99, 101, "DOI");
		
		if(!testJournal.getTitle().equals("Title")) System.out.println("Journal Title Constructor Fail");
		if(!testJournal.getAuthor1_fname().equals("Auth1FName")) System.out.println("Journal A1FName Constructor Fail");
		if(!testJournal.getAuthor1_lname().equals("Auth1LName")) System.out.println("Journal A1LName Constructor Fail");
		if(!testJournal.getAuthor2_fname().equals("Auth2FName")) System.out.println("Journal A2FName Constructor Fail");
		if(!testJournal.getAuthor2_lname().equals("Auth2LName")) System.out.println("Journal A2LName Constructor Fail");
		if(testJournal.isEtal() != false) System.out.println("Journal et al Constructor Fail");
		if(!testJournal.getJournal().equals("Journal")) System.out.println("Journal Name Constructor Fail");
		if(testJournal.getYear() != 2020) System.out.println("Journal Year Constructor Fail");
		if(testJournal.getIssue() != 3) System.out.println("Journal Issue Constructor Fail");
		if(testJournal.getVolume() != 2) System.out.println("Journal Volume Constructor Fail");
		if(testJournal.getPageStart() != 99) System.out.println("Journal PageStart Constructor Fail");
		if(testJournal.getPageEnd() != 101) System.out.println("Journal PageEnd Constructor Fail");
		if(!testJournal.getDoi().equals("DOI")) System.out.println("Journal DOI Constructor Fail");
		
		testJournal.setTitle("New Title");
		testJournal.setAuthor1name("John", "Doe");
		testJournal.setAuthor2name("Jane", "Roe");
		testJournal.setEtal(true);
		testJournal.setJournal("New Journal");
		testJournal.setYear(2021);
		testJournal.setIssue(34);
		testJournal.setVolume(42);
		testJournal.setPages(15, 19);
		testJournal.setDoi("New DOI");
		
		if(!testJournal.getTitle().equals("New Title")) System.out.println("Journal Title set/get Fail");
		if(!testJournal.getAuthor1_fname().equals("John")) System.out.println("Journal A1FName set/get Fail");
		if(!testJournal.getAuthor1_lname().equals("Doe")) System.out.println("Journal A1LName set/get Fail");
		if(!testJournal.getAuthor2_fname().equals("Jane")) System.out.println("Journal A2FName set/get Fail");
		if(!testJournal.getAuthor2_lname().equals("Roe")) System.out.println("Journal A2LName set/get Fail");
		if(testJournal.isEtal() != true) System.out.println("Journal et al set/get Fail");
		if(!testJournal.getJournal().equals("New Journal")) System.out.println("Journal Name set/get Fail");
		if(testJournal.getYear() != 2021) System.out.println("Journal Year set/get Fail");
		if(testJournal.getIssue() != 34) System.out.println("Journal Issue set/get Fail");
		if(testJournal.getVolume() != 42) System.out.println("Journal Volume set/get Fail");
		if(testJournal.getPageStart() != 15) System.out.println("Journal PageStart set/get Fail");
		if(testJournal.getPageEnd() != 19) System.out.println("Journal PageEnd set/get Fail");
		if(!testJournal.getDoi().equals("New DOI")) System.out.println("Journal DOI set/get Fail");
		
		System.out.println("Test run complete");
	}

}