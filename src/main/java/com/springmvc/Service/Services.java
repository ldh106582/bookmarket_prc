package com.springmvc.Service;

import java.util.List;

import com.springmvc.domain.Book;

public interface Services {
	public List<Book> getAllBook(String allbooks);
	public List<Book> getcategoryBook(String bookCategory);
	public Book getBook(String bookId);
	public void PlusBooks(Book book);
}
