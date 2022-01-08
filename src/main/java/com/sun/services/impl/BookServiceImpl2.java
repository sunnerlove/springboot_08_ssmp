package com.sun.services.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.dao.BookDao;
import com.sun.domain.Book;
import com.sun.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl2 extends ServiceImpl<BookDao, Book> implements IBookService {


    @Autowired
    private BookDao bookDao;

    public Boolean modify(Book book) {
        return  bookDao.updateById(book)>0;
    }
    public IPage<Book> getPage(Integer currentPage,Integer pageSize){
        IPage<Book> page = new Page<>();
        page.setCurrent(currentPage);
        page.setSize(pageSize);
        return bookDao.selectPage(page,null);
    }
}
