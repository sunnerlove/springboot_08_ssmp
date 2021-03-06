package com.sun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sun.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BookDao extends BaseMapper<Book> {
}
