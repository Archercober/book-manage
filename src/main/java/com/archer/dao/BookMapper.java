package com.archer.dao;


import com.archer.pojo.Books;
import java.util.List;


public interface BookMapper {

    int addBook(Books books);
    int deleteBookById(int id);
    int updateBook(Books books);
    //根据id查询,返回一个Book
    Books queryBookById(int id);
    //查询全部Book,返回list集合
    List<Books> queryAllBook();

}
