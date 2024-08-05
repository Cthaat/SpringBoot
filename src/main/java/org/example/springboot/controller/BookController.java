package org.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: con
 * @ClassName: BookController
 * @Author: Edge
 * @Date: 2024/8/5 22:38
 * @Version: 1.0
 */

@RestController
@RequestMapping ("/book")
public class BookController
{

    @GetMapping ("/{id}")
    public String getBookById(@PathVariable String id)
    {
        System.out.println("Get book by id: " + id);
        return "Book id is " + id;
    }
}