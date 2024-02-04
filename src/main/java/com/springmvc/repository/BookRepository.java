package com.springmvc.repository;

import java.util.List;

import com.springmvc.domain.Book;

public interface BookRepository 
{
	List<Book> getAllBook(String allbooks);
	List<Book> getcategoryBook(String bookCategory);
	public Book getBook(String bookId);
	void PlusBooks(Book book);
}
