package com.sun.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mysql.cj.QueryResult;
import com.sun.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void getById(){
        System.out.println(bookDao.selectById(2));
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试一些");
        bookDao.insert(book);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(17);
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试测试测试一些");
        bookDao.insert(book);
    }
    @Test
    void testDel(){
        bookDao.deleteById(6);
    }
    @Test
    void testGetAll(){
        System.out.println(bookDao.selectList(null));

    }
    @Test
    void testGetPage(){
        Page page = new Page(3,2);
        Page page1 = bookDao.selectPage(page, null);
        //第几页
        System.out.println(page.getCurrent());
        // 总共几页
        System.out.println(page.getPages());
        // 当前查出的数据
        System.out.println(page.getRecords());
        // 每页条数
        System.out.println(page.getSize());
        // 总共条数
        System.out.println(page.getTotal());
    }

    @Test
    void testGetBy(){
        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("name","数学");
        wrapper.like("name","数学");
        bookDao.selectList(wrapper);
    }
    @Test
    void testGetBy2(){
        String des = "4";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(des != null ,Book::getDescription,des);
        bookDao.selectList(lqw);
    }
}
