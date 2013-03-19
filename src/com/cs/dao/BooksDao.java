package com.cs.dao;

import com.cs.domain.*;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/16/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BooksDao {
    public BooksEntity save(BooksEntity book);
    public List<BooksEntity> findAll();
    public BooksEntity findById(int id);
    public void delete(BooksEntity book);
}
