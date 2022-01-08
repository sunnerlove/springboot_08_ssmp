package com.sun.services;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sun.domain.Book;
import org.springframework.stereotype.Service;

@Service
public interface IBookService extends IService<Book> {
    Boolean modify(Book book);
    IPage<Book> getPage(Integer currentPage,Integer pageSize);
}
