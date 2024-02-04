package com.springmvc.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.domain.Book;
import com.springmvc.repository.BookRepository;

@Service
public class ServiceImple implements Services{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBook(String allbooks) {
		return bookRepository.getAllBook(allbooks);
	}

	@Override
	public List<Book> getcategoryBook(String bookCategory) {
		return bookRepository.getcategoryBook(bookCategory);
	}

	@Override
	public Book getBook(String bookId) {
		System.out.println("service getbook" );
		return bookRepository.getBook(bookId);
	}

	@Override
	public void PlusBooks(Book book) {
		System.out.println("여기는 도착하나?");
		bookRepository.PlusBooks(book); 
	}
	
}
