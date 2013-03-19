package com.cs.dao;

import com.cs.domain.BooksEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import javax.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/16/13
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */

@Repository("booksDao")
@Transactional
public class BooksDaoImpl implements BooksDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public BooksEntity save(BooksEntity book) {
        sessionFactory.getCurrentSession().saveOrUpdate(book);
        System.out.println("Book saved with id: " + book.getBookId());
        return book;
    }

    @Transactional(readOnly = true)
    public List<BooksEntity> findAll() {
        return sessionFactory.getCurrentSession().createQuery(" from BooksEntity b").list();
    }

    @Transactional(readOnly = true)
    public BooksEntity findById(int id) {
        return (BooksEntity) sessionFactory.getCurrentSession().getNamedQuery("BooksEntity.findById").setParameter("id", id).uniqueResult();
    }

    public void delete(BooksEntity book) {
        sessionFactory.getCurrentSession().delete(book);
        System.out.println("Book deleted with id: " + book.getBookId());
    }
}
