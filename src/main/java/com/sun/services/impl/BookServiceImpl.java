package com.sun.services.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sun.dao.BookDao;
import com.sun.domain.Book;
import com.sun.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return  bookDao.insert(book)>0;
    }

    @Override
    public boolean update(Book book) {
        return  bookDao.updateById(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return  bookDao.deleteById(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        return null;
    }
}
