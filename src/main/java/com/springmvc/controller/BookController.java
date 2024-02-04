package com.springmvc.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.springmvc.Service.Services;
import com.springmvc.domain.Book;
import com.springmvc.exception.CategoryException;

@Controller
@RequestMapping("/Books")
public class BookController {
	List<Book> listofbook = new ArrayList<Book>();
	
	@Autowired
	Services services;
	
	@RequestMapping(method=RequestMethod.GET)
	public String AllBook(String allbooks, Model model) {
		List<Book> books = services.getAllBook(allbooks);
		System.out.println("AllBook after list : " + books);
		model.addAttribute("allbook", books);
		return "Books";
	}
	
	@GetMapping("/{category}")
	public String categoryBook(@PathVariable("category") String bookCategory, Model model) {
		List<Book> categoryresult = services.getcategoryBook(bookCategory);
		
		if(categoryresult == null || categoryresult.isEmpty()) {
			throw new CategoryException();
		}
		model.addAttribute("allbook", categoryresult);
		return "Books";
	}
	
	@GetMapping("/Book")
	public String getAllBook(@RequestParam("id") String bookId, Model model ) {
		System.out.println("bookId1 : " + bookId);
		Book Bookid = services.getBook(bookId);
		System.out.println("Bookid : " + Bookid);
		model.addAttribute("bookId", Bookid);
		return "Book";
	}
	
	@GetMapping("/add")
	public String addBook(@ModelAttribute("PlusBook")Book book) {
		return "addBook"; 
	}
	
	@PostMapping("/add")
	public String newBook(@ModelAttribute("PlusBook") Book book, HttpServletRequest request) {	
		System.out.println("여기까지는 왔습니까?1");
		
		MultipartFile bookimage = book.getBookimage();
		System.out.println("여기까지는 왔습니까?2");
		
		String originName = bookimage.getOriginalFilename();
		System.out.println("파일 ogname : " + originName);
		
		String save = request.getSession().getServletContext().getRealPath("./resources/images");
		System.out.println("위치 저장장소 : " + save);
		
		File file = new File(save, originName);
		
		if(bookimage != null && !bookimage.isEmpty()) {
			try {
				bookimage.transferTo(file);
			} catch(Exception e){
				throw new RuntimeException("로드를 실패하였습니다.", e);
			}
		}
		services.PlusBooks(book);
		return "redirect:/Books"; 
	}
}
