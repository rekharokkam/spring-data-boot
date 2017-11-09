package com.learning.spring;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learning.spring.data.entities.Book;
import com.learning.spring.data.interfaces.BookRepository;

@SpringBootApplication
public class SpringDataBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataBootApplication.class, args);
		BookRepository repo = context.getBean(BookRepository.class);
		
		Book book = new Book();
		book.setTitle("A test book");
		book.setPageCount(200);
		book.setPublishDate(new Date());
		book.setPrice(new BigDecimal(12.99));
		
		repo.save(book);
		
		System.out.println(repo.findOne(book.getBookId()));
	}
}
