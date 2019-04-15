package com.ravindra.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravindra.library.domain.Book;
import com.ravindra.library.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;

	public Book findBookByID(int bookId) {
		return bookRepository.findBookByID(bookId);
	}
	
	public Book addBook(Book book) {
		return bookRepository.addBook(book);
	}
	public List<Book> deleteBookById(int bookId) {
		return bookRepository.deleteBookById(bookId);
	}
	
	public List<Book> getAllBooks() {
		return bookRepository.getAllBooks();
	}
	
	public List<Book> saveALL(List<Book> books) {
		return bookRepository.saveALL(books);
	}
	
	public List<Book> findByAurthor(String aurthor) {
		return bookRepository.findByAurthor(aurthor);
	}
	public List<Book> searchWithTitle(String title) {
		return bookRepository.searchWithTitle(title);
	}
	public Book updateBook(Book book) {
		return bookRepository.editBook(book);
	}
}
