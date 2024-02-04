package com.springmvc.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.springmvc.domain.Book;

@Repository
public class BookRepositoryImpl implements BookRepository
{
	List<Book> listofBooks = new ArrayList<Book>();
	
	public BookRepositoryImpl() {
		super();
		Book book1 = new Book("ISBN123", "노력파교과서" ,5000000);
		book1.setAuthor("이도현");
		
		book1.setUnitPrice(5000000);
		book1.setDescription("it노력파 항상 노력을 하며 주말과 밤 낮 할 것 없이 노력 하는 인재");
		book1.setUnitInStck("1");
		book1.setCategory("it노력파");
		
		Book book2 = new Book("ISBN124", "신동파교과서" ,2500000);
		book2.setAuthor("정동민");
		book2.setDescription("it신동 한도 끝도 없이 노력하며, 발전 하고 있는 사람 it경험치 2배 이벤트 당첨자");
		book2.setUnitPrice(2500000);
		book2.setUnitInStck("10");
		book2.setCategory("it신동");
		
		Book book3 = new Book("ISBN125", "천재파교과서" ,2500000);
		book3.setAuthor("옥중혁");
		book3.setDescription("it천재 머리도 좋고 천재인 사람 그럼에도 불구하고 겸손한 자세로 누구보다 성실하게 노력한다.");
		book3.setUnitPrice(2500000);
		book3.setUnitInStck("10");
		book3.setCategory("it천재");
		
		listofBooks.add(book1);
		listofBooks.add(book2);
		listofBooks.add(book3);
		
	}

	@Override
	public List<Book> getAllBook(String allbooks) {
		// TODO Auto-generated method stub
		return listofBooks;
	}

	@Override
	public List<Book> getcategoryBook(String bookCategory) {
		System.out.println("bookCategory : " + bookCategory);
		
		List<Book> BylistofBooks = new ArrayList<Book>();
		for(int i = 0; i < listofBooks.size(); i++) {
			System.out.println("여기는 도착하나?4");
			Book book = listofBooks.get(i);
			
			System.out.println("book : " + book);
				if(bookCategory.equalsIgnoreCase(book.getCategory())) {
					
					BylistofBooks.add(book);
					System.out.println("BylistofBooks : " + BylistofBooks);
			}
		}
		return BylistofBooks;
	}

	@Override
	public Book getBook(String bookId) {
		Book info = null;
		
		for(int i = 0; i < listofBooks.size(); i++) {
			System.out.println("여기는 도착하나?3");
			Book book = listofBooks.get(i);
			System.out.println("BookgetBookId : " + book);
			
			if(bookId != null && bookId.equals(book.getBookId())) {
				info = book;
				System.out.println("info : " + info);
				break;
			} else {
				System.out.println("요청하신 페이지가 없습니다.");
			}
		}
		return info;
	}

	@Override
	public void PlusBooks(Book book) {
		System.out.println("여기는 도착하나?2");
		listofBooks.add(book);
	}
	
	
}
