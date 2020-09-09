package com.pack.service;



import java.util.ArrayList;
import java.util.Date;

import com.pack.dao.BookDao;
import com.pack.model.Book;
import com.pack.model.Distributor;
import com.pack.model.Publisher;


public class BookService {

public static void main(String[] args) {

BookDao dao=new BookDao();
/* Book book= dao.getBooks(101);
System.out.println(book);
*/

/*ArrayList<Book> books=(ArrayList<Book>)dao.getBooks();

for(Book book:books){
System.out.println(book);

}*/


/*
Book book=new Book(105,"Welcome to AI","The Asimov",new Date());
Book book1=new Book(106,"Welcome to Nature","Mother Nature",new Date());

Publisher publisher1=new Publisher("5", "Sri publications");
book.setPublisher(publisher1);
Publisher publisher2=new Publisher("6", "Krish publications");
book.setPublisher(publisher2);
System.out.println(dao.saveBook(book));
System.out.println(dao.saveBook(book1));*/

/*
Book book=dao.getBook("Welcome to AI");
System.out.println(book);*/

ArrayList<Book> books=(ArrayList<Book>)dao.filterBooks();

for(Book book3:books){
System.out.println(book3);
}
}

}
