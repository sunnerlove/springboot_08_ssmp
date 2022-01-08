package com.sun.Cotronller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sun.domain.Book;
import com.sun.services.BookService;
import com.sun.services.IBookService;
import com.sun.services.impl.BookServiceImpl2;
import com.sun.utils.ResultData;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookServiceImpl2 bookService;

    @GetMapping
    private ResultData getAll(){
        return new ResultData(true,bookService.list());
    }

     /*
    * 请求体参数 @RequestBody
    * */
    @PostMapping
    private ResultData save(@RequestBody Book book){
        return new ResultData(bookService.save(book));
    }

    @PutMapping
    private ResultData update(@RequestBody Book book){
        return new ResultData(bookService.modify(book));
    }

    @DeleteMapping("{id}")
    private ResultData del(@PathVariable Integer id){
        return new ResultData(bookService.removeById(id));
    }

    @GetMapping("{id}")
    private ResultData getById(@PathVariable Integer id){
        return new ResultData(true,bookService.getById(id));
    }

    @GetMapping("{currentPage}/{PathVariable}")
    public ResultData getPage(@PathVariable Integer currentPage,@PathVariable  Integer pageSize){
        return new ResultData(true,bookService.getPage(currentPage,pageSize));
    }
}
