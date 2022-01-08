package com.sun.Cotronller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sun.domain.Book;
import com.sun.services.impl.BookServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private BookServiceImpl2 bookService;

    @GetMapping
    private List<Book> getAll(){
        return bookService.list();
    }

     /*
    * 请求体参数 @RequestBody
    * */
    @PostMapping
    private Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    private Boolean update(@RequestBody Book book){
        return bookService.modify(book);
    }

    @DeleteMapping("id")
    private Boolean del(@PathVariable Integer id){
        return bookService.removeById(id);
    }

    @GetMapping("id")
    private Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    @GetMapping("{currentPage}/{PathVariable}")
    public IPage<Book> getPage(@PathVariable Integer currentPage,@PathVariable  Integer pageSize){
        return bookService.getPage(currentPage,pageSize);
    }
}
