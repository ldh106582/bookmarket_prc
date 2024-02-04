package com.springmvc.domain;

import org.springframework.web.multipart.MultipartFile;

public class Book 
{
	private String bookId;
	private String name;
	private int unitPrice;
	private String author;
	private String description;
	private String category;
	private String unitInStck;
	private String releasedate;
	private String condition;
	private MultipartFile bookimage;
	
	public Book() {
		super();
	}
	
	public Book(String bookId, String name, int unitPrice) {
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}


	public String getBookId() {
		return bookId;
	}


	public void setBookId(String bookId) {
		this.bookId = bookId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getUnitInStck() {
		return unitInStck;
	}


	public void setUnitInStck(String unitInStck) {
		this.unitInStck = unitInStck;
	}


	public String getReleasedate() {
		return releasedate;
	}


	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}

	public MultipartFile getBookimage() {
		return bookimage;
	}

	public void setBookimage(MultipartFile bookimage) {
		this.bookimage = bookimage;
	}
	
	
}
