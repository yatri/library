package com.ravindra.library.domain;

public class Book {
	private int book_id;
	private String book_name;
	private String book_aurthor;
	private String book_isbn;
	private String published_year;
	private String book_edition;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_aurthor() {
		return book_aurthor;
	}

	public void setBook_aurthor(String book_aurthor) {
		this.book_aurthor = book_aurthor;
	}

	public String getBook_isbn() {
		return book_isbn;
	}

	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}

	public String getPublished_year() {
		return published_year;
	}

	public void setPublished_year(String published_year) {
		this.published_year = published_year;
	}

	public String getBook_edition() {
		return book_edition;
	}

	public void setBook_edition(String book_edition) {
		this.book_edition = book_edition;
	}
}
