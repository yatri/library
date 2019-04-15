package com.ravindra.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ravindra.library.domain.Book;
import com.ravindra.library.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService service;
	@GetMapping("/book/{bookId}/get-bookby-id")
	private  ResponseEntity<Book> getBookById(@PathVariable Integer bookId) {
		Book book = service.findBookByID(bookId);
		return ResponseEntity.ok().body(book);
	}
	@PostMapping("/book/add-book")
	private  ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book savedbook = service.addBook(book);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedbook);
	}
	
	@PostMapping("/book/delete-book")
	private  ResponseEntity<List<Book>> deleteBookById(@RequestParam int bookId) {
		List<Book> booklist = service.deleteBookById(bookId);
		return ResponseEntity.status(HttpStatus.OK).body(booklist);
	}
	
	@PostMapping("/book/save-allbook")
	private   ResponseEntity<List<Book>> saveAllBook(@RequestBody List<Book> books) {
		List<Book> booklist = service.saveALL(books);
		return ResponseEntity.status(HttpStatus.CREATED).body(booklist);
	}
	
	@GetMapping("/book/get-allbook")
	private   ResponseEntity<List<Book>> getAllBooks() {
		List<Book> booklist = service.getAllBooks();
		return ResponseEntity.status(HttpStatus.OK).body(booklist);
	}
	@GetMapping("/book/find-book-aurthor")
	private   ResponseEntity<List<Book>> findByAurthor(@RequestParam String aurthor) {
		List<Book> booklist = service.findByAurthor(aurthor);
		return ResponseEntity.status(HttpStatus.OK).body(booklist);
	}
	
	@GetMapping("/book/find-bookby-title")
	private   ResponseEntity<List<Book>> findBookByTitle(@RequestParam String title) {
		List<Book> booklist = service.searchWithTitle(title);
		return ResponseEntity.status(HttpStatus.OK).body(booklist);
	}
	
	@PatchMapping("/book/edit-book")
	private   ResponseEntity<Book> editBook(@RequestBody Book book) {
		Book updatedBook = service.updateBook(book);
		return ResponseEntity.status(HttpStatus.OK).body(updatedBook);
	}
	
}
