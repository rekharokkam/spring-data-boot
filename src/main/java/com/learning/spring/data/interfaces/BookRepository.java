package com.learning.spring.data.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring.data.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>
{

}
