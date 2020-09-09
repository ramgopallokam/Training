package com.myapp.pack;

import java.util.List;

public class Library {
	
	String lname;
	int lid;
	String librarian;
	List<Book> books;
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLibrarian() {
		return librarian;
	}
	public void setLibrarian(String librarian) {
		this.librarian = librarian;
	}
	public List getBooks() {
		return books;
	}
	public void setBooks(List books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Library [lname=" + lname + ", lid=" + lid + ", librarian=" + librarian + ", books=" + books + "]";
	}
	public Library(String lname, int lid, String librarian, List books) {
		super();
		this.lname = lname;
		this.lid = lid;
		this.librarian = librarian;
		this.books = books;
	}
	
}
