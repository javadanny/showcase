package com.cs;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.cs.domain.*;
import com.cs.dao.*;


/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/16/13
 * Time: 12:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.load("classpath:spring-config.xml");
        ctx.refresh();

        BooksDao booksDao = ctx.getBean("booksDao", BooksDao.class);

        System.out.println("Display all books");
        List<BooksEntity> books = booksDao.findAll();
        listBooks(books);

        System.out.println("Display one book");
        BooksEntity book;
        book = booksDao.findById(1);
        displayBook(book);

        System.out.println("Adding a book");
        book = new BooksEntity();
        book.setAuthor("Robert C. Martin");
        book.setBookTitle("The Clean Coder");
        booksDao.save(book);
        displayBook(book);

        System.out.println("Updating a book");
        book = booksDao.findById(1);
        book.setAuthor("Moody Blues");
        booksDao.save(book);
        displayBook(book);

        System.out.println("Deleting a book");
        book = booksDao.findById(9);
        booksDao.delete(book);

    }

    private static void listBooks(List<BooksEntity> books) {
        System.out.println("");
        System.out.println("Listing books without details");
        for (BooksEntity book: books) displayBook(book);
    }

    private static void displayBook(BooksEntity book) {
        System.out.println("Book ID: " + book.getBookId());
        System.out.println(book.getBookTitle() + "(" + book.getAuthor() + ")");
        System.out.println();
    }
}
