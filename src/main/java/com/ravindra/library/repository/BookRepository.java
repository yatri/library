package com.ravindra.library.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.ravindra.library.domain.Book;
@Repository
public class BookRepository {
	private static List<Book> bookList = new ArrayList<Book>();

	public Book findBookByID(int bookId) {
		return bookList.stream().filter(x -> x.getBook_id() == bookId).findFirst().orElse(null);
	}

	public Book addBook(Book bookToAdd) {
		bookList.add(bookToAdd);
		return bookToAdd;
	}

	public List<Book> getAllBooks() {
		return bookList;
	}

	public List<Book> deleteBookById(int bookId) {
		bookList = bookList.stream().filter(x -> x.getBook_id() != bookId).collect(Collectors.toList());
		return bookList;
	}

	public List<Book> saveALL(List<Book> books) {
		bookList.addAll(books);
		return bookList;
	}

	public List<Book> findByAurthor(String aurthor) {
		return bookList.stream().filter(x -> x.getBook_aurthor().equalsIgnoreCase(aurthor))
				.collect(Collectors.toList());
	}
	
	public List<Book> searchWithTitle(String title) {
		return bookList.stream().filter(x -> x.getBook_name().toLowerCase().contains(title.toLowerCase())).collect(Collectors.toList());
	}
	public Book editBook(Book book) {
		int i=0;
		int a = 0;
		for(Book b: bookList) {
			if(b.getBook_id()==book.getBook_id()) {
				a=i;
			}
			i++;
		}		
		bookList.get(a).setBook_aurthor(book.getBook_aurthor());
		bookList.get(a).setBook_edition(book.getBook_edition());
		bookList.get(a).setBook_isbn(book.getBook_isbn());
		bookList.get(a).setBook_name(book.getBook_name());
		bookList.get(a).setPublished_year(book.getPublished_year());
		return bookList.get(a);
	}
	
}
