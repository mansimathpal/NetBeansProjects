package com.learning.hibernate.driver;

import com.learning.collection.Author;
import com.learning.collection.Book;
import com.learning.hibernate.util.HibernateUtil;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AuthorDriver {
    public static void main(String[] args){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Book book1 = new Book(1, "Spring", "introduction to spring", 1500, 200);
        
        Book book2 = new Book(2, "Hibernate", "introduction to hibernate", 1800, 300);

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        Author author = new Author(101, "Ram Narayan", books);
        session.save(author);
        tx.commit();
        session.close();
        
    }
}
