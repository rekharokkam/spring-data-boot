package com.learning.spring.data.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="BOOK")
public class Book
{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long bookId;
	
	private String title;
	
	private Date publishDate;
	
	private int pageCount;
	
	private BigDecimal price;

	/**
	 * @return the bookId
	 */
	public Long getBookId()
	{
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(Long bookId)
	{
		this.bookId = bookId;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the publishDate
	 */
	public Date getPublishDate()
	{
		return publishDate;
	}

	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(Date publishDate)
	{
		this.publishDate = publishDate;
	}

	/**
	 * @return the pageCount
	 */
	public int getPageCount()
	{
		return pageCount;
	}

	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount)
	{
		this.pageCount = pageCount;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice()
	{
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Book [bookId=" + bookId + ", title=" + title + ", publishDate=" + publishDate + ", pageCount="
				+ pageCount + ", price=" + price + "]";
	}
	
	
}
